package dev.vio.pricematrix;

public class Customer {

    private String code;
    private String name;
    private String paymentTerm;
    private String guarantee;
    private String currency;
    private String deliveryCond;
    private String transportMode;
    private String segment;
    private String shipment;

    public Customer() {
    }

    public Customer(String code, String name, String paymentTerm, String guarantee, String currency,
                    String deliveryCond, String transportMode, String segment, String shipment) {
        this.code = code;
        this.name = name;
        this.paymentTerm = paymentTerm;
        this.guarantee = guarantee;
        this.currency = currency;
        this.deliveryCond = deliveryCond;
        this.transportMode = transportMode;
        this.segment = segment;
        this.shipment = shipment;
    }

    //Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDeliveryCond() {
        return deliveryCond;
    }

    public void setDeliveryCond(String deliveryCond) {
        this.deliveryCond = deliveryCond;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getShipment() {
        return shipment;
    }

    public void setShipment(String shipment) {
        this.shipment = shipment;
    }
}
