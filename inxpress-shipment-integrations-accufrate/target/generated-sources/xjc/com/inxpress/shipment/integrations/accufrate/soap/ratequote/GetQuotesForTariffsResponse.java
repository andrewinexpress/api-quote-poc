//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.21 at 05:10:28 PM BST 
//


package com.inxpress.shipment.integrations.accufrate.soap.ratequote;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetQuotesForTariffsResult" type="{http://schemas.datacontract.org/2004/07/accufRATE.accufRATE}QuoteResponse" minOccurs="0"/&gt;
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
    "getQuotesForTariffsResult"
})
@XmlRootElement(name = "GetQuotesForTariffsResponse")
public class GetQuotesForTariffsResponse {

    @XmlElementRef(name = "GetQuotesForTariffsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuoteResponse> getQuotesForTariffsResult;

    /**
     * Gets the value of the getQuotesForTariffsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuoteResponse }{@code >}
     *     
     */
    public JAXBElement<QuoteResponse> getGetQuotesForTariffsResult() {
        return getQuotesForTariffsResult;
    }

    /**
     * Sets the value of the getQuotesForTariffsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuoteResponse }{@code >}
     *     
     */
    public void setGetQuotesForTariffsResult(JAXBElement<QuoteResponse> value) {
        this.getQuotesForTariffsResult = value;
    }

}
