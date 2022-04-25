package com.inxpress.shipment.data;

/**
 * Represents a quote for an available service from a carrier.
 *
 * Specified at https://inxpressconnect.atlassian.net/wiki/spaces/ID/pages/2764341249/WebShip+Freight+REST+API+Specification#2.2.5.1---QuoteRequest-object
 */
public record QuoteItem(
    Integer id,
    Integer carrierId,
    String carrierName,
    String carrierLogo,
    Integer tariffId,
    String tariffDescription,
    String tariffOwner,
    String accountNumber,
    Double baseCharge,
    Double netCharge,
    String quoteNumber,
    String transitTime,
    String originPhone,
    String destinationPhone,
    String message
) {}
