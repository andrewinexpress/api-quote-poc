package com.inxpress.shipment.data;

/**
 * Enumeration of codes which identify the class of freight according to the National Motor Freight Classification
 * (NMFC) system of the National Motor Freight Traffic Association (NMFTA).
 *
 * The codes are numbered and represent the lowest to highest cost according to weight range per cubic foot (0.028317
 * cubic meters). The codes defined here are as documented here.
 *
 * Specified at https://inxpressconnect.atlassian.net/wiki/spaces/ID/pages/2764341249/WebShip+Freight+REST+API+Specification#2.2.5.1---QuoteRequest-object
 */
public enum FreightClassCode {
    NA,
    NMFC_50,
    NMFC_55,
    NMFC_60,
    NMFC_65,
    NMFC_70,
    NMFC_77_5,
    NMFC_85,
    NMFC_92_5,
    NMFC_100,
    NMFC_110,
    NMFC_125,
    NMFC_150,
    NMFC_175,
    NMFC_200,
    NMFC_250,
    NMFC_300,
    NMFC_400,
    NMFC_500
}
