package com.inxpress.shipment.data;

/**
 * Enumeration of available service levels.
 *
 * Specified at https://inxpressconnect.atlassian.net/wiki/spaces/ID/pages/2764341249/WebShip+Freight+REST+API+Specification#2.2.5.1---QuoteRequest-object
 */
public enum ServiceLevel {

    /** Premium service. */
    PREMIUM,

    /** Standard service. */
    STANDARD,

    /** Basic service. */
    BASIC
}
