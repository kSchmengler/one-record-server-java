
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.DC;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;


/**
 * Other contact options e.g. Skype, Whatsapp, Viber, Fax etc
 *
 * This class was generated by OWL2Java 0.16.4
 *
 */
@OWLClass(iri = Vocabulary.s_c_ContactOther)
public class ContactOther
    implements Serializable
{

    @Id(generated = true)
    @ApiModelProperty(readOnly = true)
    protected String id;
    @JsonIgnore
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_ContactOther)
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;
    @JsonProperty("@language")
    @OWLAnnotationProperty(iri = DC.Terms.LANGUAGE)
    protected String language;

    /**
     * Contact details e.g. Skype ID
     *
     */
    @OWLDataProperty(iri = Vocabulary.s_p_detail)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_detail)
    protected String detail;
    /**
     * Contact type - e.g. Skype
     *
     */
    @OWLDataProperty(iri = Vocabulary.s_p_otherType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_otherType)
    protected String otherType;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("ContactOther {"+ name)+"<")+ id)+">")+"}");
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setOtherType(String otherType) {
        this.otherType = otherType;
    }

    public String getOtherType() {
        return otherType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
