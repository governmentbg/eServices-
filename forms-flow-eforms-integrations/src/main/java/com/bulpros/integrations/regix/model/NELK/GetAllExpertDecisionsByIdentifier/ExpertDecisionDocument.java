//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.26 at 07:37:27 PM EEST 
//


package com.bulpros.integrations.regix.model.NELK.GetAllExpertDecisionsByIdentifier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Експертно решение
 * 
 * <p>Java class for ExpertDecisionDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpertDecisionDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MeetingNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CommissionDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommissionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommisionMember" type="{http://egov.bg/RegiX/NELK/EISME}CommisionMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PersonNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentityDocument" type="{http://egov.bg/RegiX/NELK/EISME}IdentityDocument" minOccurs="0"/&gt;
 *         &lt;element name="PermanentAddress" type="{http://egov.bg/RegiX/NELK/EISME}Address" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryAddress" type="{http://egov.bg/RegiX/NELK/EISME}Address" minOccurs="0"/&gt;
 *         &lt;element name="Employment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmploymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConditionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConditionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpertiseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpertiseTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpertiseDecisionMaking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpertiseDecisionMakingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpertisePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpertisePlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployabilityAssessment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployabilityAssessmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppealedHospitalSheets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DurationForeignAid" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DurationDisabilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DurationDisability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DurationDisabilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisabilityReason" type="{http://egov.bg/RegiX/NELK/EISME}DisabilityReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Diagnosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneralIllness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneralIllnessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkAccident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkAccidentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkDisease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkDiseaseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MilitaryDisability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MilitaryDisabilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContradictionWorkingConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecommendationsForChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArgumentsAndObservations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Appeal" type="{http://egov.bg/RegiX/NELK/EISME}Appeal" minOccurs="0"/&gt;
 *         &lt;element name="Parent" type="{http://egov.bg/RegiX/NELK/EISME}Parent" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalData" type="{http://egov.bg/RegiX/NELK/EISME}AdditionalData" minOccurs="0"/&gt;
 *         &lt;element name="InitiateDocument" type="{http://egov.bg/RegiX/NELK/EISME}InitiateDocument" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpertDecisionDocument", propOrder = {
    "registrationNumber",
    "meetingNumber",
    "registrationDate",
    "commissionDescr",
    "commissionCode",
    "commisionMember",
    "personNames",
    "personIdentifier",
    "identityDocument",
    "permanentAddress",
    "temporaryAddress",
    "employment",
    "employmentCode",
    "profession",
    "conditionText",
    "conditionCode",
    "expertiseType",
    "expertiseTypeCode",
    "expertiseDecisionMaking",
    "expertiseDecisionMakingCode",
    "expertisePlace",
    "expertisePlaceCode",
    "employabilityAssessment",
    "employabilityAssessmentCode",
    "appealedHospitalSheets",
    "durationForeignAid",
    "durationDisabilityDate",
    "durationDisability",
    "durationDisabilityCode",
    "disabilityReason",
    "diagnosis",
    "diagnosisCode",
    "generalIllness",
    "generalIllnessCode",
    "workAccident",
    "workAccidentCode",
    "workDisease",
    "workDiseaseCode",
    "militaryDisability",
    "militaryDisabilityCode",
    "contradictionWorkingConditions",
    "recommendationsForChild",
    "argumentsAndObservations",
    "receiptDate",
    "appeal",
    "parent",
    "additionalData",
    "initiateDocument"
})
public class ExpertDecisionDocument {

    @XmlElement(name = "RegistrationNumber")
    protected Long registrationNumber;
    @XmlElement(name = "MeetingNumber")
    protected Long meetingNumber;
    @XmlElement(name = "RegistrationDate")
    protected String registrationDate;
    @XmlElement(name = "CommissionDescr")
    protected String commissionDescr;
    @XmlElement(name = "CommissionCode")
    protected String commissionCode;
    @XmlElement(name = "CommisionMember", nillable = true)
    protected List<CommisionMember> commisionMember;
    @XmlElement(name = "PersonNames")
    protected String personNames;
    @XmlElement(name = "PersonIdentifier")
    protected String personIdentifier;
    @XmlElement(name = "IdentityDocument")
    protected IdentityDocument identityDocument;
    @XmlElement(name = "PermanentAddress")
    protected Address permanentAddress;
    @XmlElement(name = "TemporaryAddress")
    protected Address temporaryAddress;
    @XmlElement(name = "Employment")
    protected String employment;
    @XmlElement(name = "EmploymentCode")
    protected String employmentCode;
    @XmlElement(name = "Profession")
    protected String profession;
    @XmlElement(name = "ConditionText")
    protected String conditionText;
    @XmlElement(name = "ConditionCode")
    protected String conditionCode;
    @XmlElement(name = "ExpertiseType")
    protected String expertiseType;
    @XmlElement(name = "ExpertiseTypeCode")
    protected String expertiseTypeCode;
    @XmlElement(name = "ExpertiseDecisionMaking")
    protected String expertiseDecisionMaking;
    @XmlElement(name = "ExpertiseDecisionMakingCode")
    protected String expertiseDecisionMakingCode;
    @XmlElement(name = "ExpertisePlace")
    protected String expertisePlace;
    @XmlElement(name = "ExpertisePlaceCode")
    protected String expertisePlaceCode;
    @XmlElement(name = "EmployabilityAssessment")
    protected String employabilityAssessment;
    @XmlElement(name = "EmployabilityAssessmentCode")
    protected String employabilityAssessmentCode;
    @XmlElement(name = "AppealedHospitalSheets")
    protected String appealedHospitalSheets;
    @XmlElement(name = "DurationForeignAid")
    protected String durationForeignAid;
    @XmlElement(name = "DurationDisabilityDate")
    protected String durationDisabilityDate;
    @XmlElement(name = "DurationDisability")
    protected String durationDisability;
    @XmlElement(name = "DurationDisabilityCode")
    protected String durationDisabilityCode;
    @XmlElement(name = "DisabilityReason", nillable = true)
    protected List<DisabilityReason> disabilityReason;
    @XmlElement(name = "Diagnosis")
    protected String diagnosis;
    @XmlElement(name = "DiagnosisCode")
    protected String diagnosisCode;
    @XmlElement(name = "GeneralIllness")
    protected String generalIllness;
    @XmlElement(name = "GeneralIllnessCode")
    protected String generalIllnessCode;
    @XmlElement(name = "WorkAccident")
    protected String workAccident;
    @XmlElement(name = "WorkAccidentCode")
    protected String workAccidentCode;
    @XmlElement(name = "WorkDisease")
    protected String workDisease;
    @XmlElement(name = "WorkDiseaseCode")
    protected String workDiseaseCode;
    @XmlElement(name = "MilitaryDisability")
    protected String militaryDisability;
    @XmlElement(name = "MilitaryDisabilityCode")
    protected String militaryDisabilityCode;
    @XmlElement(name = "ContradictionWorkingConditions")
    protected String contradictionWorkingConditions;
    @XmlElement(name = "RecommendationsForChild")
    protected String recommendationsForChild;
    @XmlElement(name = "ArgumentsAndObservations")
    protected String argumentsAndObservations;
    @XmlElement(name = "ReceiptDate")
    protected String receiptDate;
    @XmlElement(name = "Appeal")
    protected Appeal appeal;
    @XmlElement(name = "Parent")
    protected Parent parent;
    @XmlElement(name = "AdditionalData")
    protected AdditionalData additionalData;
    @XmlElement(name = "InitiateDocument")
    protected InitiateDocument initiateDocument;

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegistrationNumber(Long value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the meetingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeetingNumber() {
        return meetingNumber;
    }

    /**
     * Sets the value of the meetingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeetingNumber(Long value) {
        this.meetingNumber = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationDate(String value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the commissionDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionDescr() {
        return commissionDescr;
    }

    /**
     * Sets the value of the commissionDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionDescr(String value) {
        this.commissionDescr = value;
    }

    /**
     * Gets the value of the commissionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionCode() {
        return commissionCode;
    }

    /**
     * Sets the value of the commissionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionCode(String value) {
        this.commissionCode = value;
    }

    /**
     * Gets the value of the commisionMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commisionMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommisionMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommisionMember }
     * 
     * 
     */
    public List<CommisionMember> getCommisionMember() {
        if (commisionMember == null) {
            commisionMember = new ArrayList<CommisionMember>();
        }
        return this.commisionMember;
    }

    /**
     * Gets the value of the personNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNames() {
        return personNames;
    }

    /**
     * Sets the value of the personNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNames(String value) {
        this.personNames = value;
    }

    /**
     * Gets the value of the personIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonIdentifier() {
        return personIdentifier;
    }

    /**
     * Sets the value of the personIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonIdentifier(String value) {
        this.personIdentifier = value;
    }

    /**
     * Gets the value of the identityDocument property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocument }
     *     
     */
    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    /**
     * Sets the value of the identityDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocument }
     *     
     */
    public void setIdentityDocument(IdentityDocument value) {
        this.identityDocument = value;
    }

    /**
     * Gets the value of the permanentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * Sets the value of the permanentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPermanentAddress(Address value) {
        this.permanentAddress = value;
    }

    /**
     * Gets the value of the temporaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getTemporaryAddress() {
        return temporaryAddress;
    }

    /**
     * Sets the value of the temporaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setTemporaryAddress(Address value) {
        this.temporaryAddress = value;
    }

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployment(String value) {
        this.employment = value;
    }

    /**
     * Gets the value of the employmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentCode() {
        return employmentCode;
    }

    /**
     * Sets the value of the employmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentCode(String value) {
        this.employmentCode = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfession(String value) {
        this.profession = value;
    }

    /**
     * Gets the value of the conditionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionText() {
        return conditionText;
    }

    /**
     * Sets the value of the conditionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionText(String value) {
        this.conditionText = value;
    }

    /**
     * Gets the value of the conditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionCode() {
        return conditionCode;
    }

    /**
     * Sets the value of the conditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionCode(String value) {
        this.conditionCode = value;
    }

    /**
     * Gets the value of the expertiseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertiseType() {
        return expertiseType;
    }

    /**
     * Sets the value of the expertiseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertiseType(String value) {
        this.expertiseType = value;
    }

    /**
     * Gets the value of the expertiseTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertiseTypeCode() {
        return expertiseTypeCode;
    }

    /**
     * Sets the value of the expertiseTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertiseTypeCode(String value) {
        this.expertiseTypeCode = value;
    }

    /**
     * Gets the value of the expertiseDecisionMaking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertiseDecisionMaking() {
        return expertiseDecisionMaking;
    }

    /**
     * Sets the value of the expertiseDecisionMaking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertiseDecisionMaking(String value) {
        this.expertiseDecisionMaking = value;
    }

    /**
     * Gets the value of the expertiseDecisionMakingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertiseDecisionMakingCode() {
        return expertiseDecisionMakingCode;
    }

    /**
     * Sets the value of the expertiseDecisionMakingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertiseDecisionMakingCode(String value) {
        this.expertiseDecisionMakingCode = value;
    }

    /**
     * Gets the value of the expertisePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertisePlace() {
        return expertisePlace;
    }

    /**
     * Sets the value of the expertisePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertisePlace(String value) {
        this.expertisePlace = value;
    }

    /**
     * Gets the value of the expertisePlaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertisePlaceCode() {
        return expertisePlaceCode;
    }

    /**
     * Sets the value of the expertisePlaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertisePlaceCode(String value) {
        this.expertisePlaceCode = value;
    }

    /**
     * Gets the value of the employabilityAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployabilityAssessment() {
        return employabilityAssessment;
    }

    /**
     * Sets the value of the employabilityAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployabilityAssessment(String value) {
        this.employabilityAssessment = value;
    }

    /**
     * Gets the value of the employabilityAssessmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployabilityAssessmentCode() {
        return employabilityAssessmentCode;
    }

    /**
     * Sets the value of the employabilityAssessmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployabilityAssessmentCode(String value) {
        this.employabilityAssessmentCode = value;
    }

    /**
     * Gets the value of the appealedHospitalSheets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppealedHospitalSheets() {
        return appealedHospitalSheets;
    }

    /**
     * Sets the value of the appealedHospitalSheets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppealedHospitalSheets(String value) {
        this.appealedHospitalSheets = value;
    }

    /**
     * Gets the value of the durationForeignAid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationForeignAid() {
        return durationForeignAid;
    }

    /**
     * Sets the value of the durationForeignAid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationForeignAid(String value) {
        this.durationForeignAid = value;
    }

    /**
     * Gets the value of the durationDisabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationDisabilityDate() {
        return durationDisabilityDate;
    }

    /**
     * Sets the value of the durationDisabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationDisabilityDate(String value) {
        this.durationDisabilityDate = value;
    }

    /**
     * Gets the value of the durationDisability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationDisability() {
        return durationDisability;
    }

    /**
     * Sets the value of the durationDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationDisability(String value) {
        this.durationDisability = value;
    }

    /**
     * Gets the value of the durationDisabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationDisabilityCode() {
        return durationDisabilityCode;
    }

    /**
     * Sets the value of the durationDisabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationDisabilityCode(String value) {
        this.durationDisabilityCode = value;
    }

    /**
     * Gets the value of the disabilityReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilityReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilityReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisabilityReason }
     * 
     * 
     */
    public List<DisabilityReason> getDisabilityReason() {
        if (disabilityReason == null) {
            disabilityReason = new ArrayList<DisabilityReason>();
        }
        return this.disabilityReason;
    }

    /**
     * Gets the value of the diagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the value of the diagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosis(String value) {
        this.diagnosis = value;
    }

    /**
     * Gets the value of the diagnosisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * Sets the value of the diagnosisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosisCode(String value) {
        this.diagnosisCode = value;
    }

    /**
     * Gets the value of the generalIllness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralIllness() {
        return generalIllness;
    }

    /**
     * Sets the value of the generalIllness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralIllness(String value) {
        this.generalIllness = value;
    }

    /**
     * Gets the value of the generalIllnessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralIllnessCode() {
        return generalIllnessCode;
    }

    /**
     * Sets the value of the generalIllnessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralIllnessCode(String value) {
        this.generalIllnessCode = value;
    }

    /**
     * Gets the value of the workAccident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkAccident() {
        return workAccident;
    }

    /**
     * Sets the value of the workAccident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkAccident(String value) {
        this.workAccident = value;
    }

    /**
     * Gets the value of the workAccidentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkAccidentCode() {
        return workAccidentCode;
    }

    /**
     * Sets the value of the workAccidentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkAccidentCode(String value) {
        this.workAccidentCode = value;
    }

    /**
     * Gets the value of the workDisease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDisease() {
        return workDisease;
    }

    /**
     * Sets the value of the workDisease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDisease(String value) {
        this.workDisease = value;
    }

    /**
     * Gets the value of the workDiseaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDiseaseCode() {
        return workDiseaseCode;
    }

    /**
     * Sets the value of the workDiseaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDiseaseCode(String value) {
        this.workDiseaseCode = value;
    }

    /**
     * Gets the value of the militaryDisability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryDisability() {
        return militaryDisability;
    }

    /**
     * Sets the value of the militaryDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryDisability(String value) {
        this.militaryDisability = value;
    }

    /**
     * Gets the value of the militaryDisabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryDisabilityCode() {
        return militaryDisabilityCode;
    }

    /**
     * Sets the value of the militaryDisabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryDisabilityCode(String value) {
        this.militaryDisabilityCode = value;
    }

    /**
     * Gets the value of the contradictionWorkingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContradictionWorkingConditions() {
        return contradictionWorkingConditions;
    }

    /**
     * Sets the value of the contradictionWorkingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContradictionWorkingConditions(String value) {
        this.contradictionWorkingConditions = value;
    }

    /**
     * Gets the value of the recommendationsForChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationsForChild() {
        return recommendationsForChild;
    }

    /**
     * Sets the value of the recommendationsForChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationsForChild(String value) {
        this.recommendationsForChild = value;
    }

    /**
     * Gets the value of the argumentsAndObservations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgumentsAndObservations() {
        return argumentsAndObservations;
    }

    /**
     * Sets the value of the argumentsAndObservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgumentsAndObservations(String value) {
        this.argumentsAndObservations = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptDate(String value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the appeal property.
     * 
     * @return
     *     possible object is
     *     {@link Appeal }
     *     
     */
    public Appeal getAppeal() {
        return appeal;
    }

    /**
     * Sets the value of the appeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appeal }
     *     
     */
    public void setAppeal(Appeal value) {
        this.appeal = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Parent }
     *     
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parent }
     *     
     */
    public void setParent(Parent value) {
        this.parent = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData }
     *     
     */
    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData }
     *     
     */
    public void setAdditionalData(AdditionalData value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the initiateDocument property.
     * 
     * @return
     *     possible object is
     *     {@link InitiateDocument }
     *     
     */
    public InitiateDocument getInitiateDocument() {
        return initiateDocument;
    }

    /**
     * Sets the value of the initiateDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiateDocument }
     *     
     */
    public void setInitiateDocument(InitiateDocument value) {
        this.initiateDocument = value;
    }

}
