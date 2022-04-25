package com.inxpress.shipment.integrations.accufrate;

import com.inxpress.shipment.data.Quote;
import com.inxpress.shipment.data.QuoteRequest;
import com.inxpress.shipment.integrations.accufrate.mappers.QuoteRequestMarshaller;
import com.inxpress.shipment.integrations.accufrate.mappers.QuoteUnmarshaller;
import com.inxpress.shipment.integrations.accufrate.soap.ratequote.GetQuotesForTariffs;
import com.inxpress.shipment.integrations.accufrate.soap.ratequote.GetQuotesResponse;
import com.inxpress.shipment.integrations.accufrate.soap.ratequote.QuoteResponse;
import com.inxpress.shipment.integrations.accufrate.soap.ratequote.RequestQuote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class RateQuoteClient extends WebServiceGatewaySupport {

    private static final Logger LOG = LoggerFactory.getLogger(RateQuoteClient.class);

    @Autowired
    private QuoteRequestMarshaller requestMarshaller;

    @Autowired
    private QuoteUnmarshaller responseUnmarhsaller;

    @Value("${com.inxpress.shipment.integrations.accufrate.ratequote.url}")
    private String rateQuoteURL;


    public Quote getQuote(QuoteRequest request) {

        LOG.info("Requesting quote for customer {} from ZIP {} to ZIP {}",
                request.customerAccountNumber(), request.originAddressCode(), request.destinationAddressCode());

        GetQuotesForTariffs soapRequest = requestMarshaller.marshal(request);

        GetQuotesResponse soapResponse = (GetQuotesResponse) getWebServiceTemplate()
                .marshalSendAndReceive(rateQuoteURL, soapRequest, new SoapActionCallback(""));

        Quote quote = responseUnmarhsaller.unmarshal(soapResponse);

        LOG.info("Response is valid? {} with error message '{}' and {} items",
                quote.valid(), quote.errorMessage(), quote.items()!=null? quote.items().length : 0);

        return quote;
    }

}