package com.polymorphism.entities.bikestore;

public class Fork extends BikePart implements Shippable {
    String suspensionSize;
    Float redound;
    Boolean isTwoCrown;
    Boolean hasDiskBreaks;

    @Override
    public void ship(String country) {

    }
}
