package gwt.material.design.client.constants;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import gwt.material.design.client.base.helper.EnumHelper;

/**
 * Created by Mark Kevin on 11/13/2015.
 */
public enum FABType implements CssType{

    DEFAULT(""),
    HORIZONTAL("horizontal"),
    CLICK_ONLY("click-to-toggle");

    private final String cssClass;

    FABType(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static FABType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, FABType.class, DEFAULT);
    }
}