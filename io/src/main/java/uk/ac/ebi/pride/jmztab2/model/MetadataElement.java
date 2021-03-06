/* 
 * Copyright 2018 Leibniz-Institut für Analytische Wissenschaften – ISAS – e.V..
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
package uk.ac.ebi.pride.jmztab2.model;

/**
 * Define all elements used in metadata.
 *
 * @author qingwei
 * @author nilshoffmann
 * @since 23/05/13
 * 
 */
public enum MetadataElement {
    MZTAB                             ("mzTab"),
    TITLE                             ("title"),
    DESCRIPTION                       ("description"),
    SAMPLE_PROCESSING                 ("sample_processing"),
    INSTRUMENT                        ("instrument"),
    SOFTWARE                          ("software"),
    PUBLICATION                       ("publication"),
    CONTACT                           ("contact"),
    URI                               ("uri"),
    EXTERNAL_STUDY_URI                ("external_study_uri"),
    DERIVATIZATION_AGENT              ("derivatization_agent"),
    QUANTIFICATION_METHOD             ("quantification_method"),
    SMALL_MOLECULE                    ("small_molecule"),
    SMALL_MOLECULE_FEATURE            ("small_molecule_feature"),
    MS_RUN                            ("ms_run"),
    CUSTOM                            ("custom"),
    SAMPLE                            ("sample"),
    ASSAY                             ("assay"),
    STUDY_VARIABLE                    ("study_variable"),
    CV                                ("cv"),
    COLUNIT                           ("colunit"),
    COLUNIT_SMALL_MOLECULE            ("colunit-small_molecule"),
    COLUNIT_SMALL_MOLECULE_FEATURE    ("colunit-small_molecule_feature"),
    COLUNIT_SMALL_MOLECULE_EVIDENCE   ("colunit-small_molecule_evidence"),
    ID_CONFIDENCE_MEASURE             ("id_confidence_measure"),
    DATABASE                          ("database"),
    SMALLMOLECULE_QUANTIFICATION_UNIT ("small_molecule-quantification_unit"),
    SMALLMOLECULE_FEATURE_QUANTIFICATION_UNIT ("small_molecule_feature-quantification_unit"),
    SMALLMOLECULE_IDENTIFICATION_RELIABILITY ("small_molecule-identification_reliability");

    private final String name;

    MetadataElement(String name) {
        this.name = name;
    }

    /**
     * <p>Getter for the field <code>name</code>.</p>
     *
     * @return element name.
     */
    public String getName() {
        return name;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Find element by name with case-insensitive match. If not find, return null.
     *
     * @param name a {@link java.lang.String} object.
     * @return a {@link uk.ac.ebi.pride.jmztab2.model.MetadataElement} object.
     */
    public static MetadataElement findElement(String name) {
        if (name == null) {
            return null;
        }

        MetadataElement element;
        try {
            element = MetadataElement.valueOf(name.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            element = null;
        }

        return element;
    }
}
