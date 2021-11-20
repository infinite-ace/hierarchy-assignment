package com.infinitelambda.bikestore;

import com.infinitelambda.constants.Constants;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Fork extends BikePart implements Shippable {

    private String suspensionSize;
    private Float redound;
    private Boolean isTwoCrown;
    private Boolean hasDiskBreaks;

    /* Implementing abstract methods and interface methods */
    @Override
    public void setPromotion() {

    }

    @Override
    public void service() {

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
