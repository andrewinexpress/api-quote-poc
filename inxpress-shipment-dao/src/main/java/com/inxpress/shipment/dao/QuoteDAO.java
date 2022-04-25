package com.inxpress.shipment.dao;

import com.inxpress.shipment.data.Quote;
import org.springframework.stereotype.Component;

/**
 * Data Access Object for persistence of {@link Quote} objects.
 */
@Component
public class QuoteDAO {

    /**
     * Saves (creates or updates) the given Quote in the persistence store and returns the object with any
     * database assigned field values.
     *
     * NOTE: This is a no-op implementation that simply returns the same object that is passed in.
     */
    public Quote saveOrUpdate(Quote quote) {
        return quote;
    }

}
