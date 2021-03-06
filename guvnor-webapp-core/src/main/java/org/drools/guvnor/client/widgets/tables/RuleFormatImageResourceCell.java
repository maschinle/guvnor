/*
* Copyright 2010 JBoss Inc
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.drools.guvnor.client.widgets.tables;

import org.drools.guvnor.client.resources.RuleFormatImageResource;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

public class RuleFormatImageResourceCell extends AbstractCell<RuleFormatImageResource> {

    @Override
    public void render(Context context,
                       RuleFormatImageResource value,
                       SafeHtmlBuilder sb) {
        SafeHtml html = SafeHtmlUtils.fromTrustedString( AbstractImagePrototype.create( value ).getHTML() );
        sb.append( html );
    }

}
