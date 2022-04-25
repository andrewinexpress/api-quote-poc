package com.inxpress.shipment.data;

/**
 * Fields that detail an item of freight.
 *
 * Specified at https://inxpressconnect.atlassian.net/wiki/spaces/ID/pages/2764341249/WebShip+Freight+REST+API+Specification#2.2.5.1---QuoteRequest-object
 */
public record FreightItem(
    Double weight,
    MeasurementType measurementType,
    FreightClassCode classCode
) {}
