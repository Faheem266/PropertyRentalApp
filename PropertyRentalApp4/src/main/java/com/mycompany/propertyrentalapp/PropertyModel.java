package com.mycompany.propertyrentalapp;

public class PropertyModel {
    public String propertyId;
    public String propertyAddress;
    public double propertyRentalAmount;
    public String agentName;

    public PropertyModel(String propertyId, String propertyAddress, double propertyRentalAmount, String agentName) {
        this.propertyId = propertyId;
        this.propertyAddress = propertyAddress;
        this.propertyRentalAmount = propertyRentalAmount;
        this.agentName = agentName;
    }

    @Override
    public String toString() {
        return "PROPERTY ID: " + propertyId +
                "\nPROPERTY ADDRESS: " + propertyAddress +
                "\nPROPERTY RENTAL AMOUNT: R" + propertyRentalAmount +
                "\nPROPERTY AGENT: " + agentName;
    }
}


