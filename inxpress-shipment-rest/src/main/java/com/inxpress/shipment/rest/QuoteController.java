package com.inxpress.shipment.rest;

import com.inxpress.shipment.data.Quote;
import com.inxpress.shipment.data.QuoteRequest;
import com.inxpress.shipment.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/v1/", consumes="application/json", produces="application/json")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;


    @PostMapping(path="/quote")
    public ResponseEntity<QuoteResponseWrapper> getQuote(@RequestBody QuoteRequest quoteRequest) {
        Quote quote = quoteService.getQuote(quoteRequest);

        if (quote != null) {
            QuoteResponseWrapper wrapper = new QuoteResponseWrapper(quote);

            if (quote.valid()) {
                return new ResponseEntity(wrapper, HttpStatus.OK);
            } else {
                return new ResponseEntity(wrapper, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
