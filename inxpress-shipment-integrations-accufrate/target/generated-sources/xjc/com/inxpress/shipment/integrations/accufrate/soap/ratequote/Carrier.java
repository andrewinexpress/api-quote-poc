//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.21 at 05:10:28 PM BST 
//


package com.inxpress.shipment.integrations.accufrate.soap.ratequote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Carrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Carrier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_accessKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_accessorialFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_accessorialPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_account" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_accountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_billToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_billToCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_billToName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_billToState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_billtoEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_billtoPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_billtoZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_carrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_carrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_carrierId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_carrierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_classSpecialFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_classWeightFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_classWeightPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_classWeightStartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_custCarrierId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_destPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_destPhoneField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_dimensionFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_dimensionPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_discount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_errorMessageField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_floorMinimum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_formatCanadianZipcode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_fuelChargeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_fuelChargeField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_fuelChargeValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_globalCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_netPriceField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_originPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_originPhoneField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_parentChargeLineage" type="{http://schemas.datacontract.org/2004/07/accufRATE.accufRATE}ArrayOfParentCharge"/&gt;
 *         &lt;element name="_password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_prePaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_quoteNumberField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_returnsMultipleQuotes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_shipper" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_tariffId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_thirdParty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_thirdPartyAddressId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_transitTimeField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_wgResponse" type="{http://schemas.datacontract.org/2004/07/accufRATE}WhiteGloveResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carrier", namespace = "http://schemas.datacontract.org/2004/07/accufRATE.accufRATE", propOrder = {
    "accessKey",
    "accessorialFormat",
    "accessorialPrefix",
    "account",
    "accountType",
    "billToAddress",
    "billToCity",
    "billToName",
    "billToState",
    "billtoEmail",
    "billtoPhone",
    "billtoZip",
    "carrier",
    "carrierCode",
    "carrierId",
    "carrierName",
    "classSpecialFormat",
    "classWeightFormat",
    "classWeightPrefix",
    "classWeightStartIndex",
    "custCarrierId",
    "destPhone",
    "destPhoneField",
    "dimensionFormat",
    "dimensionPrefix",
    "discount",
    "errorMessageField",
    "floorMinimum",
    "formatCanadianZipcode",
    "fuelChargeDesc",
    "fuelChargeField",
    "fuelChargeValue",
    "globalCarrier",
    "netPriceField",
    "originPhone",
    "originPhoneField",
    "parentChargeLineage",
    "password",
    "prePaid",
    "quoteNumberField",
    "reference",
    "returnsMultipleQuotes",
    "shipper",
    "tariffId",
    "thirdParty",
    "thirdPartyAddressId",
    "transitTimeField",
    "url",
    "userName",
    "wgResponse"
})
public class Carrier {

    @XmlElement(name = "_accessKey", required = true, nillable = true)
    protected String accessKey;
    @XmlElement(name = "_accessorialFormat", required = true, nillable = true)
    protected String accessorialFormat;
    @XmlElement(name = "_accessorialPrefix", required = true, nillable = true)
    protected String accessorialPrefix;
    @XmlElement(name = "_account", required = true, nillable = true)
    protected String account;
    @XmlElement(name = "_accountType", required = true, nillable = true)
    protected String accountType;
    @XmlElement(name = "_billToAddress", required = true, nillable = true)
    protected String billToAddress;
    @XmlElement(name = "_billToCity", required = true, nillable = true)
    protected String billToCity;
    @XmlElement(name = "_billToName", required = true, nillable = true)
    protected String billToName;
    @XmlElement(name = "_billToState", required = true, nillable = true)
    protected String billToState;
    @XmlElement(name = "_billtoEmail", required = true, nillable = true)
    protected String billtoEmail;
    @XmlElement(name = "_billtoPhone", required = true, nillable = true)
    protected String billtoPhone;
    @XmlElement(name = "_billtoZip", required = true, nillable = true)
    protected String billtoZip;
    @XmlElement(name = "_carrier", required = true, nillable = true)
    protected String carrier;
    @XmlElement(name = "_carrierCode", required = true, nillable = true)
    protected String carrierCode;
    @XmlElement(name = "_carrierId")
    protected int carrierId;
    @XmlElement(name = "_carrierName", required = true, nillable = true)
    protected String carrierName;
    @XmlElement(name = "_classSpecialFormat", required = true, nillable = true)
    protected String classSpecialFormat;
    @XmlElement(name = "_classWeightFormat", required = true, nillable = true)
    protected String classWeightFormat;
    @XmlElement(name = "_classWeightPrefix", required = true, nillable = true)
    protected String classWeightPrefix;
    @XmlElement(name = "_classWeightStartIndex")
    protected int classWeightStartIndex;
    @XmlElement(name = "_custCarrierId")
    protected int custCarrierId;
    @XmlElement(name = "_destPhone", required = true, nillable = true)
    protected String destPhone;
    @XmlElement(name = "_destPhoneField", required = true, nillable = true)
    protected String destPhoneField;
    @XmlElement(name = "_dimensionFormat", required = true, nillable = true)
    protected String dimensionFormat;
    @XmlElement(name = "_dimensionPrefix", required = true, nillable = true)
    protected String dimensionPrefix;
    @XmlElement(name = "_discount", required = true, nillable = true)
    protected String discount;
    @XmlElement(name = "_errorMessageField", required = true, nillable = true)
    protected String errorMessageField;
    @XmlElement(name = "_floorMinimum", required = true, nillable = true)
    protected String floorMinimum;
    @XmlElement(name = "_formatCanadianZipcode")
    protected boolean formatCanadianZipcode;
    @XmlElement(name = "_fuelChargeDesc", required = true, nillable = true)
    protected String fuelChargeDesc;
    @XmlElement(name = "_fuelChargeField", required = true, nillable = true)
    protected String fuelChargeField;
    @XmlElement(name = "_fuelChargeValue", required = true, nillable = true)
    protected String fuelChargeValue;
    @XmlElement(name = "_globalCarrier")
    protected boolean globalCarrier;
    @XmlElement(name = "_netPriceField", required = true, nillable = true)
    protected String netPriceField;
    @XmlElement(name = "_originPhone", required = true, nillable = true)
    protected String originPhone;
    @XmlElement(name = "_originPhoneField", required = true, nillable = true)
    protected String originPhoneField;
    @XmlElement(name = "_parentChargeLineage", required = true, nillable = true)
    protected ArrayOfParentCharge parentChargeLineage;
    @XmlElement(name = "_password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "_prePaid")
    protected boolean prePaid;
    @XmlElement(name = "_quoteNumberField", required = true, nillable = true)
    protected String quoteNumberField;
    @XmlElement(name = "_reference", required = true, nillable = true)
    protected String reference;
    @XmlElement(name = "_returnsMultipleQuotes")
    protected boolean returnsMultipleQuotes;
    @XmlElement(name = "_shipper")
    protected boolean shipper;
    @XmlElement(name = "_tariffId")
    protected int tariffId;
    @XmlElement(name = "_thirdParty")
    protected boolean thirdParty;
    @XmlElement(name = "_thirdPartyAddressId")
    protected int thirdPartyAddressId;
    @XmlElement(name = "_transitTimeField", required = true, nillable = true)
    protected String transitTimeField;
    @XmlElement(name = "_url", required = true, nillable = true)
    protected String url;
    @XmlElement(name = "_userName", required = true, nillable = true)
    protected String userName;
    @XmlElement(name = "_wgResponse", required = true, nillable = true)
    protected WhiteGloveResponse wgResponse;

    /**
     * Gets the value of the accessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * Sets the value of the accessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessKey(String value) {
        this.accessKey = value;
    }

    /**
     * Gets the value of the accessorialFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessorialFormat() {
        return accessorialFormat;
    }

    /**
     * Sets the value of the accessorialFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessorialFormat(String value) {
        this.accessorialFormat = value;
    }

    /**
     * Gets the value of the accessorialPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessorialPrefix() {
        return accessorialPrefix;
    }

    /**
     * Sets the value of the accessorialPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessorialPrefix(String value) {
        this.accessorialPrefix = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the billToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddress() {
        return billToAddress;
    }

    /**
     * Sets the value of the billToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddress(String value) {
        this.billToAddress = value;
    }

    /**
     * Gets the value of the billToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCity() {
        return billToCity;
    }

    /**
     * Sets the value of the billToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCity(String value) {
        this.billToCity = value;
    }

    /**
     * Gets the value of the billToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToName() {
        return billToName;
    }

    /**
     * Sets the value of the billToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToName(String value) {
        this.billToName = value;
    }

    /**
     * Gets the value of the billToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToState() {
        return billToState;
    }

    /**
     * Sets the value of the billToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToState(String value) {
        this.billToState = value;
    }

    /**
     * Gets the value of the billtoEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltoEmail() {
        return billtoEmail;
    }

    /**
     * Sets the value of the billtoEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltoEmail(String value) {
        this.billtoEmail = value;
    }

    /**
     * Gets the value of the billtoPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltoPhone() {
        return billtoPhone;
    }

    /**
     * Sets the value of the billtoPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltoPhone(String value) {
        this.billtoPhone = value;
    }

    /**
     * Gets the value of the billtoZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltoZip() {
        return billtoZip;
    }

    /**
     * Sets the value of the billtoZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltoZip(String value) {
        this.billtoZip = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the carrierId property.
     * 
     */
    public int getCarrierId() {
        return carrierId;
    }

    /**
     * Sets the value of the carrierId property.
     * 
     */
    public void setCarrierId(int value) {
        this.carrierId = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the classSpecialFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassSpecialFormat() {
        return classSpecialFormat;
    }

    /**
     * Sets the value of the classSpecialFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassSpecialFormat(String value) {
        this.classSpecialFormat = value;
    }

    /**
     * Gets the value of the classWeightFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassWeightFormat() {
        return classWeightFormat;
    }

    /**
     * Sets the value of the classWeightFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassWeightFormat(String value) {
        this.classWeightFormat = value;
    }

    /**
     * Gets the value of the classWeightPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassWeightPrefix() {
        return classWeightPrefix;
    }

    /**
     * Sets the value of the classWeightPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassWeightPrefix(String value) {
        this.classWeightPrefix = value;
    }

    /**
     * Gets the value of the classWeightStartIndex property.
     * 
     */
    public int getClassWeightStartIndex() {
        return classWeightStartIndex;
    }

    /**
     * Sets the value of the classWeightStartIndex property.
     * 
     */
    public void setClassWeightStartIndex(int value) {
        this.classWeightStartIndex = value;
    }

    /**
     * Gets the value of the custCarrierId property.
     * 
     */
    public int getCustCarrierId() {
        return custCarrierId;
    }

    /**
     * Sets the value of the custCarrierId property.
     * 
     */
    public void setCustCarrierId(int value) {
        this.custCarrierId = value;
    }

    /**
     * Gets the value of the destPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestPhone() {
        return destPhone;
    }

    /**
     * Sets the value of the destPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestPhone(String value) {
        this.destPhone = value;
    }

    /**
     * Gets the value of the destPhoneField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestPhoneField() {
        return destPhoneField;
    }

    /**
     * Sets the value of the destPhoneField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestPhoneField(String value) {
        this.destPhoneField = value;
    }

    /**
     * Gets the value of the dimensionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionFormat() {
        return dimensionFormat;
    }

    /**
     * Sets the value of the dimensionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionFormat(String value) {
        this.dimensionFormat = value;
    }

    /**
     * Gets the value of the dimensionPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionPrefix() {
        return dimensionPrefix;
    }

    /**
     * Sets the value of the dimensionPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionPrefix(String value) {
        this.dimensionPrefix = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the errorMessageField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessageField() {
        return errorMessageField;
    }

    /**
     * Sets the value of the errorMessageField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessageField(String value) {
        this.errorMessageField = value;
    }

    /**
     * Gets the value of the floorMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorMinimum() {
        return floorMinimum;
    }

    /**
     * Sets the value of the floorMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorMinimum(String value) {
        this.floorMinimum = value;
    }

    /**
     * Gets the value of the formatCanadianZipcode property.
     * 
     */
    public boolean isFormatCanadianZipcode() {
        return formatCanadianZipcode;
    }

    /**
     * Sets the value of the formatCanadianZipcode property.
     * 
     */
    public void setFormatCanadianZipcode(boolean value) {
        this.formatCanadianZipcode = value;
    }

    /**
     * Gets the value of the fuelChargeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelChargeDesc() {
        return fuelChargeDesc;
    }

    /**
     * Sets the value of the fuelChargeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelChargeDesc(String value) {
        this.fuelChargeDesc = value;
    }

    /**
     * Gets the value of the fuelChargeField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelChargeField() {
        return fuelChargeField;
    }

    /**
     * Sets the value of the fuelChargeField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelChargeField(String value) {
        this.fuelChargeField = value;
    }

    /**
     * Gets the value of the fuelChargeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelChargeValue() {
        return fuelChargeValue;
    }

    /**
     * Sets the value of the fuelChargeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelChargeValue(String value) {
        this.fuelChargeValue = value;
    }

    /**
     * Gets the value of the globalCarrier property.
     * 
     */
    public boolean isGlobalCarrier() {
        return globalCarrier;
    }

    /**
     * Sets the value of the globalCarrier property.
     * 
     */
    public void setGlobalCarrier(boolean value) {
        this.globalCarrier = value;
    }

    /**
     * Gets the value of the netPriceField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPriceField() {
        return netPriceField;
    }

    /**
     * Sets the value of the netPriceField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPriceField(String value) {
        this.netPriceField = value;
    }

    /**
     * Gets the value of the originPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginPhone() {
        return originPhone;
    }

    /**
     * Sets the value of the originPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginPhone(String value) {
        this.originPhone = value;
    }

    /**
     * Gets the value of the originPhoneField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginPhoneField() {
        return originPhoneField;
    }

    /**
     * Sets the value of the originPhoneField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginPhoneField(String value) {
        this.originPhoneField = value;
    }

    /**
     * Gets the value of the parentChargeLineage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParentCharge }
     *     
     */
    public ArrayOfParentCharge getParentChargeLineage() {
        return parentChargeLineage;
    }

    /**
     * Sets the value of the parentChargeLineage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParentCharge }
     *     
     */
    public void setParentChargeLineage(ArrayOfParentCharge value) {
        this.parentChargeLineage = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the prePaid property.
     * 
     */
    public boolean isPrePaid() {
        return prePaid;
    }

    /**
     * Sets the value of the prePaid property.
     * 
     */
    public void setPrePaid(boolean value) {
        this.prePaid = value;
    }

    /**
     * Gets the value of the quoteNumberField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumberField() {
        return quoteNumberField;
    }

    /**
     * Sets the value of the quoteNumberField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumberField(String value) {
        this.quoteNumberField = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the returnsMultipleQuotes property.
     * 
     */
    public boolean isReturnsMultipleQuotes() {
        return returnsMultipleQuotes;
    }

    /**
     * Sets the value of the returnsMultipleQuotes property.
     * 
     */
    public void setReturnsMultipleQuotes(boolean value) {
        this.returnsMultipleQuotes = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     */
    public boolean isShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     */
    public void setShipper(boolean value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the tariffId property.
     * 
     */
    public int getTariffId() {
        return tariffId;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     */
    public void setTariffId(int value) {
        this.tariffId = value;
    }

    /**
     * Gets the value of the thirdParty property.
     * 
     */
    public boolean isThirdParty() {
        return thirdParty;
    }

    /**
     * Sets the value of the thirdParty property.
     * 
     */
    public void setThirdParty(boolean value) {
        this.thirdParty = value;
    }

    /**
     * Gets the value of the thirdPartyAddressId property.
     * 
     */
    public int getThirdPartyAddressId() {
        return thirdPartyAddressId;
    }

    /**
     * Sets the value of the thirdPartyAddressId property.
     * 
     */
    public void setThirdPartyAddressId(int value) {
        this.thirdPartyAddressId = value;
    }

    /**
     * Gets the value of the transitTimeField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitTimeField() {
        return transitTimeField;
    }

    /**
     * Sets the value of the transitTimeField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitTimeField(String value) {
        this.transitTimeField = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the wgResponse property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteGloveResponse }
     *     
     */
    public WhiteGloveResponse getWgResponse() {
        return wgResponse;
    }

    /**
     * Sets the value of the wgResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteGloveResponse }
     *     
     */
    public void setWgResponse(WhiteGloveResponse value) {
        this.wgResponse = value;
    }

}
