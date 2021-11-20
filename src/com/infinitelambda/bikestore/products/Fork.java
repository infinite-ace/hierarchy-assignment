package com.infinitelambda.bikestore.products;

import com.infinitelambda.bikestore.staff.Mechanic;
import com.infinitelambda.constants.Constants;

public class Fork extends BikePart implements Shippable {

    private String suspensionSize;
    private Float redound;
    private Boolean isTwoCrown;
    private Boolean hasDiskBreaks;

    /* Implementing abstract methods and interface methods */


    @Override
    public Double setDiscount(Double percent) {
        return null;
    }

    @Override
    public void serviceRepairs(BikePart bikePart, Integer days, Double price, Mechanic mechanic) {
        System.out.println("========Output for serviceRepairs func========");

        System.out.println(
            mechanic.getName() + " will fix your " + bikePart.productName + "  for the period of  " +
                days + " " + "for the price of " + price + "$"
        );

        System.out.println();
    }

    @Override
    public void warrantyRepairProcess() {

    }

    @Override
    public void transfer() {

    }

    /***
     * In our store he have variety of boxes from size 150 x 30 x 30,
     * and generally we have no restrictions to ship it to the end client.
     *
     * So we pass true.
     * @param country
     */
    @Override
    public boolean isAbleToShipToCountry(String country) {
        System.out.println("========Output for isAbleToShipToCountry func========");

        System.out.println(Constants.AVAILABLE_COUNTRIES_FOR_SHIPPING.contains(country) ? "Would be able to ship" : "Wouldnt be able to ship");

        System.out.println();

        return Constants.AVAILABLE_COUNTRIES_FOR_SHIPPING.contains(country);
    }


    /* Setters & Getters */

    public String getSuspensionSize() {
        return suspensionSize;
    }

    public void setSuspensionSize(String suspensionSize) {
        this.suspensionSize = suspensionSize;
    }

    public Float getRedound() {
        return redound;
    }

    public void setRedound(Float redound) {
        this.redound = redound;
    }

    public Boolean getTwoCrown() {
        return isTwoCrown;
    }

    public void setTwoCrown(Boolean twoCrown) {
        isTwoCrown = twoCrown;
    }

    public Boolean getHasDiskBreaks() {
        return hasDiskBreaks;
    }

    public void setHasDiskBreaks(Boolean hasDiskBreaks) {
        this.hasDiskBreaks = hasDiskBreaks;
    }
}
