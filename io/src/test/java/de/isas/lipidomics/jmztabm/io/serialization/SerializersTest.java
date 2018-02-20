/*
 * Copyright 2018 Nils Hoffmann <nils.hoffmann@isas.de>.
 *
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
 */
package de.isas.lipidomics.jmztabm.io.serialization;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.utils.LogMethodName;

/**
 *
 * @author Nils Hoffmann <nils.hoffmann@isas.de>
 */
public class SerializersTest {

    @Rule
    public LogMethodName methodNameLogger = new LogMethodName();
    
    @Test
    public void testMixedCamelCaseToUnderscore() {
        String camelCase1 = "camelCase";
        Assert.assertEquals("camel_case", Serializers.
            camelCaseToUnderscoreLowerCase(camelCase1));
    }

    @Test
    public void testCapitalCamelCaseToUnderscore() {
        String camelCase2 = "CamelCase";
        Assert.assertEquals("camel_case", Serializers.
            camelCaseToUnderscoreLowerCase(camelCase2));
    }

    @Test
    public void testUpperCaseCamelCaseMadnessToUnderscore() {
        String camelCase3 = "CAmelCASE";
        Assert.assertEquals("camel_case", Serializers.
            camelCaseToUnderscoreLowerCase(camelCase3));
    }

}
