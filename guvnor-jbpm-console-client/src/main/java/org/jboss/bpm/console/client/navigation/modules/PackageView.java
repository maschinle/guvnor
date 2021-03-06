/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.bpm.console.client.navigation.modules;

import org.drools.guvnor.client.rpc.Module;

/**
 * A class able to organise PackageConfigData into folders
 */
public abstract class PackageView {

    protected Folder root = new Folder();

    abstract void doAddPackage(String packageName,
                               Module conf);

    public Folder getRootFolder() {
        return this.root;
    }

    public void addPackage(Module conf) {
        String name = conf.getName();
        doAddPackage( name,
                      conf );
    }

    public void addSubPackages(String baseName,
                        Module[] subPackages) {
        if ( subPackages != null ) {
            for ( Module conf : subPackages ) {
                StringBuilder sb = new StringBuilder( baseName );
                sb.append( "." );
                sb.append( conf.getName() );
                doAddPackage( sb.toString(),
                              conf );
            }
        }
    }
    
    public void clear() {
        root.getChildren().clear();
    }

}