
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Types;
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;


/**
 * Details of the radioactive isotope contained in the product
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_DgRadioactiveIsotope)
public class DgRadioactiveIsotope
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_DgRadioactiveIsotope)
    protected Set<String> types;

    /**
     * Numeric expression of the activity of a radioactive Item
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_activityLevelMeasure)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_activityLevelMeasure)
    protected String activityLevelMeasure;
    /**
     * Applies to fissile material only, other than fissile excepted. A numeric value expressed to one decimal place preceded by the letters CSI.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_criticalitySafetyIndexNumeric)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_criticalitySafetyIndexNumeric)
    protected String criticalitySafetyIndexNumeric;
    /**
     * Id of each radionuclide or for mixtures of radionuclides.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_isotopeId)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_isotopeId)
    protected String isotopeId;
    /**
     * The name or symbol of each radionuclide or for mixtures of radionuclides, an appropriate general description, or a list of the most restrictive radionuclides. 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_isotopeName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_isotopeName)
    protected String isotopeName;
    /**
     * A notation that the material is low dispersible radioactive material.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_lowDispersibleIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_lowDispersibleIndicator)
    protected Boolean lowDispersibleIndicator;
    /**
     * A description of the physical and chemical form of the material.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_physicalChemicalForm)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_physicalChemicalForm)
    protected String physicalChemicalForm;
    /**
     * A notation that the material is special form
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_specialFormIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_specialFormIndicator)
    protected Boolean specialFormIndicator;

    public void setActivityLevelMeasure(String activityLevelMeasure) {
        this.activityLevelMeasure = activityLevelMeasure;
    }

    public String getActivityLevelMeasure() {
        return activityLevelMeasure;
    }

    public void setCriticalitySafetyIndexNumeric(String criticalitySafetyIndexNumeric) {
        this.criticalitySafetyIndexNumeric = criticalitySafetyIndexNumeric;
    }

    public String getCriticalitySafetyIndexNumeric() {
        return criticalitySafetyIndexNumeric;
    }

    public void setIsotopeId(String isotopeId) {
        this.isotopeId = isotopeId;
    }

    public String getIsotopeId() {
        return isotopeId;
    }

    public void setIsotopeName(String isotopeName) {
        this.isotopeName = isotopeName;
    }

    public String getIsotopeName() {
        return isotopeName;
    }

    public void setLowDispersibleIndicator(Boolean lowDispersibleIndicator) {
        this.lowDispersibleIndicator = lowDispersibleIndicator;
    }

    public Boolean getLowDispersibleIndicator() {
        return lowDispersibleIndicator;
    }

    public void setPhysicalChemicalForm(String physicalChemicalForm) {
        this.physicalChemicalForm = physicalChemicalForm;
    }

    public String getPhysicalChemicalForm() {
        return physicalChemicalForm;
    }

    public void setSpecialFormIndicator(Boolean specialFormIndicator) {
        this.specialFormIndicator = specialFormIndicator;
    }

    public Boolean getSpecialFormIndicator() {
        return specialFormIndicator;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }
}
