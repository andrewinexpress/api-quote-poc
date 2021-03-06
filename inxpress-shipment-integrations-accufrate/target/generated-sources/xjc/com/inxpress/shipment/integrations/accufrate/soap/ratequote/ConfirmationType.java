//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.21 at 05:10:28 PM BST 
//


package com.inxpress.shipment.integrations.accufrate.soap.ratequote;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfirmationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOCONFIRMATION"/&gt;
 *     &lt;enumeration value="DELIVERY"/&gt;
 *     &lt;enumeration value="SIGNATURE"/&gt;
 *     &lt;enumeration value="ADULTSIGNATURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfirmationType", namespace = "http://schemas.datacontract.org/2004/07/accufRATE")
@XmlEnum
public enum ConfirmationType {

    NOCONFIRMATION,
    DELIVERY,
    SIGNATURE,
    ADULTSIGNATURE;

    public String value() {
        return name();
    }

    public static ConfirmationType fromValue(String v) {
        return valueOf(v);
    }

}
