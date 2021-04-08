
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Types;
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;


/**
 * Signature details of the Epermit for Live Animals
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_EpermitSignature)
public class EpermitSignature
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_EpermitSignature)
    protected Set<String> types;

    /**
     * Signatory company name
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_signatoryCompany)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_signatoryCompany)
    protected Company signatoryCompany;
    /**
     * Security Stamp ID
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_securityStampId)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_securityStampId)
    protected String securityStampId;
    /**
     * Role of the signatory with regards to the ePermit: Applicant, Permit issuer, Issuing Authority or Examining authority
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_signatoryRole)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_signatoryRole)
    protected String signatoryRole;
    /**
     * Date and time of the signature
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_signatureDate)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_signatureDate)
    protected Date signatureDate;
    /**
     * Signatory signature authentication text
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_signatureStatement)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_signatureStatement)
    protected String signatureStatement;
    /**
     * Code specifying a type of government action such asinspection, detention, fumigation, security.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_signatureTypeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_signatureTypeCode)
    protected String signatureTypeCode;

    public void setSignatoryCompany(Company signatoryCompany) {
        this.signatoryCompany = signatoryCompany;
    }

    public Company getSignatoryCompany() {
        return signatoryCompany;
    }

    public void setSecurityStampId(String securityStampId) {
        this.securityStampId = securityStampId;
    }

    public String getSecurityStampId() {
        return securityStampId;
    }

    public void setSignatoryRole(String signatoryRole) {
        this.signatoryRole = signatoryRole;
    }

    public String getSignatoryRole() {
        return signatoryRole;
    }

    public void setSignatureDate(Date signatureDate) {
        this.signatureDate = signatureDate;
    }

    public Date getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureStatement(String signatureStatement) {
        this.signatureStatement = signatureStatement;
    }

    public String getSignatureStatement() {
        return signatureStatement;
    }

    public void setSignatureTypeCode(String signatureTypeCode) {
        this.signatureTypeCode = signatureTypeCode;
    }

    public String getSignatureTypeCode() {
        return signatureTypeCode;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }
}
