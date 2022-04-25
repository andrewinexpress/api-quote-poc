package com.inxpress.shipment.services;

import com.inxpress.shipment.dao.QuoteDAO;
import com.inxpress.shipment.dao.QuoteRequestDAO;
import com.inxpress.shipment.data.Quote;
import com.inxpress.shipment.data.QuoteRequest;
import com.inxpress.shipment.integrations.accufrate.RateQuoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service providing business logic related to quotes for shipment.
 */
@Service
public class QuoteService {

    @Autowired
    private QuoteRequestDAO requestDAO;

    @Autowired
    private QuoteDAO responseDAO;

    @Autowired
    private RateQuoteClient quoteClient;


    /**
     * Gets a quote from a 3rd party supplier, saving both the request and response in
     * the database.
     */
    public Quote getQuote(QuoteRequest quoteRequest) {
        requestDAO.saveOrUpdate(quoteRequest);

        Quote response = quoteClient.getQuote(quoteRequest);

        responseDAO.saveOrUpdate(response);

        return response;
    }

}
