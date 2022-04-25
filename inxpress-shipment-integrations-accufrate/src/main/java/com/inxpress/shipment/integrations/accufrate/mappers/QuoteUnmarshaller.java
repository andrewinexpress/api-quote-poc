package com.inxpress.shipment.integrations.accufrate.mappers;

import com.inxpress.shipment.data.Quote;
import com.inxpress.shipment.data.QuoteItem;
import com.inxpress.shipment.integrations.accufrate.soap.ratequote.ArrayOfQuote;
import com.inxpress.shipment.integrations.accufrate.soap.ratequote.GetQuotesResponse;
import com.inxpress.shipment.integrations.accufrate.soap.ratequote.QuoteResponse;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Unmarshalls the SOAP response from the AccufRATE SOAP service to the equivalent Quote
 * object and associated objects defined in the InXpress Data Model Quote object.
 */
@Component
public class QuoteUnmarshaller {

    public Quote unmarshal(GetQuotesResponse soapResponse) {
        QuoteResponse quoteResponse = soapResponse.getGetQuotesResult().getValue();

        return new Quote(
            quoteResponse.getQuoteID(),
            quoteResponse.isIsValid(),
            quoteResponse.getErrorMessage() != null? quoteResponse.getErrorMessage().getValue() : null,
            unmarshal(quoteResponse.getQuotes().getValue(), quoteResponse.getQuotesRequestedCount())
        );
    }

    // Note this is a candidate for moving into its own mapper
    private QuoteItem[] unmarshal(ArrayOfQuote quoteItemsXMLArray, int itemCount) {
        if (itemCount == 0) return new QuoteItem[] {};

        List<com.inxpress.shipment.integrations.accufrate.soap.ratequote.Quote> quoteItems =
                quoteItemsXMLArray.getQuote();

        QuoteItem[] items = new QuoteItem[itemCount];

        for (var index = 0; index<itemCount; index++) {
            items[index] = unmarshal(quoteItems.get(index));
        }

        return items;
    }

    // Note this is a candidate for moving into its own mapper
    private QuoteItem unmarshal(com.inxpress.shipment.integrations.accufrate.soap.ratequote.Quote responseItem) {
        return new QuoteItem(
            responseItem.getQuoteDetailID(),
            responseItem.getCarrierID(),
            responseItem.getCarrierName().getValue(),
            responseItem.getCarrierLogo() != null? responseItem.getCarrierLogo().getValue() : null,
            responseItem.getTariffID(),
            responseItem.getTariffDesc().getValue(),
            responseItem.getTariffOwner().getValue(),
            responseItem.getAccountNumber().getValue(),
            responseItem.getBaseCharge().doubleValue(),
            responseItem.getNetCharge().doubleValue(),
            responseItem.getQuoteNumber().getValue(),
            responseItem.getTransitTime().getValue(),
            responseItem.getOriginPhone().getValue(),
            responseItem.getDestPhone().getValue(),
            responseItem.getErrorMessage()!=null? responseItem.getErrorMessage().getValue() : null
        );
    }

}
