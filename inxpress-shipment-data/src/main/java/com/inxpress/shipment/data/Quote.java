package com.inxpress.shipment.data;

/**
 * Represents a quote for available services from carriers, comprising zero or more
 * items, each of which is an available service.
 *
 * Specified at https://inxpressconnect.atlassian.net/wiki/spaces/ID/pages/2764341249/WebShip+Freight+REST+API+Specification#2.2.5.1---QuoteRequest-object
 */
public record Quote(
    Integer id,
    boolean valid,
    String errorMessage,
    QuoteItem[] items
) {}
