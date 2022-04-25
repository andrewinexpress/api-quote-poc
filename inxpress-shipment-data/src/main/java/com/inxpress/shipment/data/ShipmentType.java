package com.inxpress.shipment.data;

/**
 * Enumeration of the types of shipment to quote for.
 *
 * Specified at https://inxpressconnect.atlassian.net/wiki/spaces/ID/pages/2764341249/WebShip+Freight+REST+API+Specification#2.2.5.1---QuoteRequest-object
 */
public enum ShipmentType {
    /** Less than truck load */
    LTL,

    /** Truck load */
    TL,

    /** Special care required for processing and delivery */
    WHITE_GLOVE_DELIVERY,

    /** Special care for last mile */
    WHITE_GLOVE_LAST_MILE_ONLY,

    /** Special care pickup */
    WHITE_GLOVE_PICKUP,

    /** Special care on delivery */
    WHITE_GLOVE_PICKUP_ONLY,

    /** For volume rate quotes */
    VOLUME
}
