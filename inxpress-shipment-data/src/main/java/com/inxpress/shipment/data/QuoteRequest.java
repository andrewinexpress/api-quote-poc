package com.inxpress.shipment.data;

/**
 * Represents a request for a quote.
 *
 * Specified at https://inxpressconnect.atlassian.net/wiki/spaces/ID/pages/2764341249/WebShip+Freight+REST+API+Specification#2.2.5.1---QuoteRequest-object
 */
@Entity
public record QuoteRequest(
    ShipmentType quoteType,
    String customerAccountNumber,
    String originCity,
    String originState,
    String originAddressCode,
    String destinationCity,
    String destinationState,
    String destinationAddressCode,
    Integer numberOfPallets,
    Boolean canGoOnRefrigeratedVan,
    Boolean fullTruckLoad,
    Boolean standardSize,
    Boolean linealFootRate,
    Double totalLinealFoot,
    StackType stackType,
    Boolean palletized,
    ServiceLevel serviceLevel,
    Boolean needHaulaway,
    Boolean wgFieldDestroy,
    FreightItem[] freightItems,
    AccessorialCode[] accessorials,
    PackageDimension[] packageDimensions
) {}
