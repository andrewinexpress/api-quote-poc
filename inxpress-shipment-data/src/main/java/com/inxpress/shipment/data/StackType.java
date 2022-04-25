package com.inxpress.shipment.data;

/**
 * Enumeration of ways in which pallets can be stacked.
 *
 * Specified at https://inxpressconnect.atlassian.net/wiki/spaces/ID/pages/2764341249/WebShip+Freight+REST+API+Specification#2.2.5.1---QuoteRequest-object
 */
public enum StackType {

    /** Pallets need to be single stacked */
    SINGLE,

    /** Pallets need to be double stacked */
    DOUBLE,

    /** Pallets need to be triple stacked */
    TRIPLE
}
