package com.inxpress.shipment.integrations.accufrate.mappers;

import com.inxpress.shipment.data.*;
import com.inxpress.shipment.data.FreightItem;
import com.inxpress.shipment.integrations.accufrate.soap.ratequote.*;
import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import org.springframework.stereotype.Component;

/**
 * Marshalls QuoteRequest objects and associated object defined in the InXpress Data Model to
 * the equivalent SOAP representation to be sent to the AccufRATE SOAP service.
 */
@Component
public class QuoteRequestMarshaller {

    private ObjectFactory objectFactory = new ObjectFactory();


    public GetQuotesForTariffs marshal(QuoteRequest request) {
        RequestQuote soapRequest = new RequestQuote();

        soapRequest.setQuoteTypeId(marshal(request.quoteType()));
        soapRequest.setClientReferenceId(objectFactory.createString(request.customerAccountNumber()));
        soapRequest.setFromCity(objectFactory.createString(request.originCity()));
        soapRequest.setFromState(objectFactory.createString(request.originState()));
        soapRequest.setFromZip(objectFactory.createString(request.originAddressCode()));
        soapRequest.setToCity(objectFactory.createString(request.destinationCity()));
        soapRequest.setToState(objectFactory.createString(request.destinationState()));
        soapRequest.setToZip(objectFactory.createString(request.destinationAddressCode()));
        soapRequest.setPallets(request.numberOfPallets());
        soapRequest.setCanGoOnRefrigeratedVan(request.canGoOnRefrigeratedVan());
        soapRequest.setIsFullTruckLoad(request.fullTruckLoad());
        soapRequest.setIsStandardSize(request.standardSize());
        soapRequest.setIsLinealFootRate(request.linealFootRate());

        if (request.totalLinealFoot() != null)
            soapRequest.setTotalLinealFoot(BigDecimal.valueOf(request.totalLinealFoot()));

        soapRequest.setStackTypeId(marshal(request.stackType()));
        soapRequest.setIsPalletized(request.palletized());

        if (request.serviceLevel() != null)
            soapRequest.setServiceLevel(marshal(request.serviceLevel()));

        soapRequest.setNeedHaulaway(request.needHaulaway());
        soapRequest.setIsFieldDestroy(request.wgFieldDestroy());
        soapRequest.setFreightItems(
                objectFactory.createArrayOfFreightItem(marshal(request.freightItems()))
        );

        if (request.accessorials() != null)
            soapRequest.setAccessorial(objectFactory.createArrayOfstring(marshal(request.accessorials())));

        soapRequest.setPackageDimensions(objectFactory.createArrayOfDimension(marshal(request.packageDimensions())));

        GetQuotesForTariffs soapTariffRequest = objectFactory.createGetQuotesForTariffs();
        soapTariffRequest.setRequest(objectFactory.createRequestQuote(soapRequest));
        return soapTariffRequest;
    }

    // Note this is a candidate for moving into its own mapper
    private Integer marshal(ShipmentType shipmentType) {
        return switch (shipmentType) {
            case LTL: yield 1;
            case TL: yield 2;
            case WHITE_GLOVE_DELIVERY: yield 3;
            case WHITE_GLOVE_LAST_MILE_ONLY: yield 4;
            case WHITE_GLOVE_PICKUP: yield 5;
            case WHITE_GLOVE_PICKUP_ONLY: yield 6;
            case VOLUME: yield 11;
        };
    }

    // Note this is a candidate for moving into its own mapper
    private Integer marshal(StackType stackType) {
        return switch (stackType) {
            case SINGLE: yield 1;
            case DOUBLE: yield 2;
            case TRIPLE: yield 3;
        };
    }

    // Note this is a candidate for moving into its own mapper
    private JAXBElement<String> marshal(ServiceLevel serviceLevel) {
        var value = switch (serviceLevel) {
            case PREMIUM: yield "1";
            case STANDARD: yield "2";
            case BASIC: yield "3";
        };

        return objectFactory.createString(value);
    }

    // Note this is a candidate for moving into its own mapper
    private ArrayOfFreightItem marshal(FreightItem[] items) {
        if (items == null || items.length == 0) return null;

        ArrayOfFreightItem itemSOAPArray = objectFactory.createArrayOfFreightItem();

        for (var index = 0; index < items.length; index++) {
            itemSOAPArray.getFreightItem().add(marshal(items[index]));
        }

        return itemSOAPArray;
    }

    // Note this is a candidate for moving into its own mapper
    private com.inxpress.shipment.integrations.accufrate.soap.ratequote.FreightItem marshal(FreightItem item) {
        com.inxpress.shipment.integrations.accufrate.soap.ratequote.FreightItem soapItem =
                objectFactory.createFreightItem();

        soapItem.setWeight(item.weight());
        soapItem.setClassCode(marshal(item.classCode()));

        return soapItem;
    }

    // Note this is a candidate for moving into its own mapper
    private JAXBElement<String> marshal(FreightClassCode classCode) {
        if (classCode == null) return objectFactory.createString("NA");

        var classCodeString = switch (classCode) {
            case NA: yield "NA";
            case NMFC_50: yield "50";
            case NMFC_55: yield "55";
            case NMFC_60: yield "60";
            case NMFC_65: yield "65";
            case NMFC_70: yield "70";
            case NMFC_77_5: yield "77.5";
            case NMFC_85: yield "85";
            case NMFC_92_5: yield "92.5";
            case NMFC_100: yield "100";
            case NMFC_110: yield "110";
            case NMFC_125: yield "125";
            case NMFC_150: yield "150";
            case NMFC_175: yield "175";
            case NMFC_200: yield "200";
            case NMFC_250: yield "250";
            case NMFC_300: yield "300";
            case NMFC_400: yield "400";
            case NMFC_500: yield "500";
        };

        return objectFactory.createString(classCodeString);
    }

    // Note this is a candidate for moving into its own mapper
    private ArrayOfstring marshal(AccessorialCode[] accessorialCodes) {
        if (accessorialCodes == null || accessorialCodes.length == 0) return null;

        ArrayOfstring itemSOAPArray = objectFactory.createArrayOfstring();

        for (var index = 0; index < accessorialCodes.length; index++) {
            itemSOAPArray.getString().add(marshal(accessorialCodes[index]));
        }

        return itemSOAPArray;
    }

    // Note this is a candidate for moving into its own mapper
    private String marshal(AccessorialCode accessorialCode) {
        return switch(accessorialCode) {
            case AIRPORT_DELIVERY: yield "50";
            case AIRPORT_PICKUP: yield "49";
            case AMAZON_FBA: yield "93";
            case APPOINTMENT_FEE_DELIVERY: yield "1";
            case CFS_DELIVERY: yield "99";
            case CFS_PICKUP: yield "98";
            case CONSTRUCTION_SITE_DELIVERY: yield "48";
            case CONSTRUCTION_SITE_PICKUP: yield "47";
            case DELIVERY_NOTIFICATION_FEE: yield "88";
            case ESTATE_DELIVERY: yield "4";
            case ESTATE_PICKUP: yield "97";
            case SENSITIVE_DELIVERY: yield "61";
            case SENSITIVE_PICKUP: yield "62";
            case GROCERY_WAREHOUSE: yield "43";
            case HAZMAT: yield "5";
            case HOTEL_DELIVERY: yield "100";
            case INSIDE_DELIVERY: yield "6";
            case INSIDE_PICKUP: yield "7";
            case LIFTGATE_DELIVERY: yield "8";
            case LIFTGATE_PICKUP: yield "9";
            case LIMITED_ACCESS_DELIVERY: yield "59";
            case LIMITED_ACCESS_PICKUP: yield "58";
            case SECURITY_DELIVERY: yield "10";
            case MINI_STORAGE_UNIT_DELIVERY: yield "65";
            case MINI_STORAGE_UNIT_PICKUP: yield "64";
            case NOTIFICATION_PRIOR_TO_DELIVERY: yield "90";
            case LF_8_12: yield "103";
            case LF_12_16: yield "104";
            case LF_16_20: yield "105";
            case LF_20_PLUS: yield "106";
            case WORSHIP: yield "11";
            case PROTECT_FROM_FREEZING: yield "18";
            case RESIDENTIAL_DELIVERY: yield "12";
            case RESIDENTIAL_PICKUP: yield "13";
            case SATURDAY_DELIVERY: yield "14";
            case SATURDAY_PICKUP: yield "15";
            case SCHOOL_DELIVERY: yield "16";
            case SCHOOL_PICKUP: yield "96";
            case SHOPPING_MALL_DELIVERY: yield "101";
            case STORAGE_FACILITY_DELIVERY: yield "102";
            case CRITICAL_OR_APPOINTMENT: yield "54";
            case TRADE_SHOW_DELIVERY: yield "46";
            case TRADE_SHOW_PICKUP: yield "45";
        };
    }

    // Note this is a candidate for moving into its own mapper
    private ArrayOfDimension marshal(PackageDimension[] dimensions) {
        if (dimensions == null || dimensions.length == 0) return null;

        ArrayOfDimension itemSOAPArray = objectFactory.createArrayOfDimension();

        for (var index = 0; index < dimensions.length; index++) {
            itemSOAPArray.getDimension().add(marshal(dimensions[index]));
        }

        return itemSOAPArray;
    }


    // Note this is a candidate for moving into its own mapper
    private Dimension marshal(PackageDimension dimension) {
        Dimension soapDimension = objectFactory.createDimension();

        soapDimension.setPieces(dimension.pieces());
        soapDimension.setLength(dimension.length());
        soapDimension.setWidth(dimension.width());
        soapDimension.setHeight(dimension.height());

        return soapDimension;
    }

}
