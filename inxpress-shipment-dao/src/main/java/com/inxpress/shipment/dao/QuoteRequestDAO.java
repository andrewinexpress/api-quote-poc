package com.inxpress.shipment.dao;

import com.inxpress.shipment.data.QuoteRequest;
import org.springframework.stereotype.Component;

/**
 * Data Access Object for persistence of {@link com.inxpress.shipment.data.QuoteRequest} objects.
 */
@Component
public class QuoteRequestDAO {

    /**
     * Saves (creates or updates) the given QuoteRequest in the persistence store and returns the object with any
     * database assigned field values.
     *
     * NOTE: This is a no-op implementation that simply returns the same object that is passed in.
     */
    public QuoteRequest saveOrUpdate(QuoteRequest quoteRequest) {
        return quoteRequest;
    }

}
