package com.inxpress.shipment.data;

/**
 * Fields that detail the dimensions of a package and the number of pieces in the package.
 *
 * Specified at https://inxpressconnect.atlassian.net/wiki/spaces/ID/pages/2764341249/WebShip+Freight+REST+API+Specification#2.2.5.1---QuoteRequest-object
 */
public record PackageDimension(
    Integer pieces,
    Double length,
    Double width,
    Double height,
    MeasurementType measurementType
) {}
