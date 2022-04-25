//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.21 at 05:10:28 PM BST 
//


package com.inxpress.shipment.integrations.accufrate.soap.ratequote;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvancedMarkUp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvancedMarkUp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_classFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_classTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_destState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_markUpPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="_maximumPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="_minimumPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="_originState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_revenueFrom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="_revenueTo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancedMarkUp", namespace = "http://schemas.datacontract.org/2004/07/accufRATE.accufRATE", propOrder = {
    "classFrom",
    "classTo",
    "destState",
    "markUpPercent",
    "maximumPrice",
    "minimumPrice",
    "originState",
    "revenueFrom",
    "revenueTo"
})
public class AdvancedMarkUp {

    @XmlElement(name = "_classFrom", required = true, nillable = true)
    protected String classFrom;
    @XmlElement(name = "_classTo", required = true, nillable = true)
    protected String classTo;
    @XmlElement(name = "_destState", required = true, nillable = true)
    protected String destState;
    @XmlElement(name = "_markUpPercent", required = true)
    protected BigDecimal markUpPercent;
    @XmlElement(name = "_maximumPrice", required = true)
    protected BigDecimal maximumPrice;
    @XmlElement(name = "_minimumPrice", required = true)
    protected BigDecimal minimumPrice;
    @XmlElement(name = "_originState", required = true, nillable = true)
    protected String originState;
    @XmlElement(name = "_revenueFrom", required = true)
    protected BigDecimal revenueFrom;
    @XmlElement(name = "_revenueTo", required = true)
    protected BigDecimal revenueTo;

    /**
     * Gets the value of the classFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassFrom() {
        return classFrom;
    }

    /**
     * Sets the value of the classFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassFrom(String value) {
        this.classFrom = value;
    }

    /**
     * Gets the value of the classTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassTo() {
        return classTo;
    }

    /**
     * Sets the value of the classTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassTo(String value) {
        this.classTo = value;
    }

    /**
     * Gets the value of the destState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestState() {
        return destState;
    }

    /**
     * Sets the value of the destState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestState(String value) {
        this.destState = value;
    }

    /**
     * Gets the value of the markUpPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkUpPercent() {
        return markUpPercent;
    }

    /**
     * Sets the value of the markUpPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkUpPercent(BigDecimal value) {
        this.markUpPercent = value;
    }

    /**
     * Gets the value of the maximumPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPrice() {
        return maximumPrice;
    }

    /**
     * Sets the value of the maximumPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPrice(BigDecimal value) {
        this.maximumPrice = value;
    }

    /**
     * Gets the value of the minimumPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Sets the value of the minimumPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPrice(BigDecimal value) {
        this.minimumPrice = value;
    }

    /**
     * Gets the value of the originState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginState() {
        return originState;
    }

    /**
     * Sets the value of the originState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginState(String value) {
        this.originState = value;
    }

    /**
     * Gets the value of the revenueFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRevenueFrom() {
        return revenueFrom;
    }

    /**
     * Sets the value of the revenueFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRevenueFrom(BigDecimal value) {
        this.revenueFrom = value;
    }

    /**
     * Gets the value of the revenueTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRevenueTo() {
        return revenueTo;
    }

    /**
     * Sets the value of the revenueTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRevenueTo(BigDecimal value) {
        this.revenueTo = value;
    }

}
