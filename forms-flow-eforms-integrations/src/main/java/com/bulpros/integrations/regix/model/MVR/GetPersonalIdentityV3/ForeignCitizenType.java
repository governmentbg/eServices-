//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 03:52:47 PM EEST 
//


package com.bulpros.integrations.regix.model.MVR.GetPersonalIdentityV3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignCitizenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignCitizenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Names" type="{http://egov.bg/RegiX/MVR/BDS/PersonalIdentityInfoResponse}PersonNames" minOccurs="0"/&gt;
 *         &lt;element name="NationalityList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Nationality" type="{http://egov.bg/RegiX/MVR/BDS/PersonalIdentityInfoResponse}Nationality" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Gender" type="{http://egov.bg/RegiX/MVR/BDS/PersonalIdentityInfoResponse}GenderType" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignCitizenType", propOrder = {
    "pin",
    "pn",
    "names",
    "nationalityList",
    "gender",
    "birthDate"
})
public class ForeignCitizenType {

    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "PN")
    protected String pn;
    @XmlElement(name = "Names")
    protected PersonNames names;
    @XmlElement(name = "NationalityList")
    protected ForeignCitizenType.NationalityList nationalityList;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "BirthDate")
    protected String birthDate;

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the pn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPN() {
        return pn;
    }

    /**
     * Sets the value of the pn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPN(String value) {
        this.pn = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNames }
     *     
     */
    public PersonNames getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNames }
     *     
     */
    public void setNames(PersonNames value) {
        this.names = value;
    }

    /**
     * Gets the value of the nationalityList property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignCitizenType.NationalityList }
     *     
     */
    public ForeignCitizenType.NationalityList getNationalityList() {
        return nationalityList;
    }

    /**
     * Sets the value of the nationalityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignCitizenType.NationalityList }
     *     
     */
    public void setNationalityList(ForeignCitizenType.NationalityList value) {
        this.nationalityList = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Nationality" type="{http://egov.bg/RegiX/MVR/BDS/PersonalIdentityInfoResponse}Nationality" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nationality"
    })
    public static class NationalityList {

        @XmlElement(name = "Nationality", required = true)
        protected List<Nationality> nationality;

        /**
         * Gets the value of the nationality property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nationality property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNationality().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Nationality }
         * 
         * 
         */
        public List<Nationality> getNationality() {
            if (nationality == null) {
                nationality = new ArrayList<Nationality>();
            }
            return this.nationality;
        }

    }

}
