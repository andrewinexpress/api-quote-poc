package com.inxpress.shipment.integrations.accufrate;


import com.inxpress.shipment.data.*;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.groups.Tuple;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

@ContextConfiguration("classpath:test-context.xml")
@RunWith(SpringRunner.class)
public class RateQuoteClientTest {

    @Autowired
    private RateQuoteClient clientUnderTest;


    @Test
    public void rateQuoteIsReturned() {
        // given
        QuoteRequest testRequest = createSimpleTestRequest();

        // when
        Quote testResponse = clientUnderTest.getQuote(testRequest);

        // then
        assertThat(testResponse)
            .isNotNull()
            .hasFieldOrPropertyWithValue("id", 4472241)
            .hasFieldOrPropertyWithValue("valid", true)
            .hasFieldOrProperty("items");
        assertThat(testResponse.items())
            .hasSizeGreaterThanOrEqualTo(1)
            .extracting(QuoteItem::accountNumber, QuoteItem::id, QuoteItem::carrierId)
            .contains(
                new Tuple("ABCD1234", 1896636, 427),
                new Tuple("TEST9999", 1896637, 435)
            );
    }


    private QuoteRequest createSimpleTestRequest() {
        return new QuoteRequest(
            ShipmentType.LTL,
            "123456",
            "Mountain View",
            "CA",
            "91043",
            "New York",
            "NY",
            "10036",
            1,
            null,
            null,
            null,
            null,
            null,
            StackType.SINGLE,
            null,
            null,
            null,
            null,
            new FreightItem[] {
                new FreightItem(12.3, MeasurementType.IMPERIAL, FreightClassCode.NA)
            },
            null,
            new PackageDimension[] {
                new PackageDimension(1, 40.2, 40.5, 40.1, MeasurementType.IMPERIAL)
            }
        );
    }

}
