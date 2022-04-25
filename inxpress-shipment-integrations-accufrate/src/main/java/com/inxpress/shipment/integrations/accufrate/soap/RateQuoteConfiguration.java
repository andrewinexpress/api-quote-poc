package com.inxpress.shipment.integrations.accufrate.soap;

import com.inxpress.shipment.integrations.accufrate.RateQuoteClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class RateQuoteConfiguration {

    @Value("${com.inxpress.shipment.integrations.accufrate.ratequote.url}")
    private String rateQuoteURL;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.inxpress.shipment.integrations.accufrate.soap.ratequote");
        return marshaller;
    }

    @Bean
    public RateQuoteClient rateQuoteClient(Jaxb2Marshaller marshaller) {
        RateQuoteClient client = new RateQuoteClient();
        client.setDefaultUri(rateQuoteURL);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}