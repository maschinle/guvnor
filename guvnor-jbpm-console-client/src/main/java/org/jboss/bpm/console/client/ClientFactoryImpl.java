/*
 * Copyright 2012 JBoss Inc
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

package org.jboss.bpm.console.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import org.drools.guvnor.client.explorer.AbstractClientFactoryImpl;
import org.drools.guvnor.client.perspective.BpmConsoleActivityMapper;
import org.drools.guvnor.client.util.ActivityMapper;
import org.drools.guvnor.client.widgets.wizards.WizardFactory;

public class ClientFactoryImpl
        extends AbstractClientFactoryImpl {

    public ClientFactoryImpl( EventBus eventBus) {
        super(eventBus);
    }

    @Override
    public ActivityMapper getActivityMapper() {
        return new BpmConsoleActivityMapper(this);
    }

    @Override
    public PlaceHistoryMapper getPlaceHistoryMapper() {
        if (guvnorPlaceHistoryMapper == null) {
            guvnorPlaceHistoryMapper = GWT.create(BpmRuntimePlaceHistoryMapper.class);
        }
        return guvnorPlaceHistoryMapper;
    }

    @Override
    public WizardFactory getWizardFactory() {
        return null;  //TODO: -Rikkola-
    }
}
