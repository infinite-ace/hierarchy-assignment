package com.infinitelambda.bikestore;

import java.util.List;

public interface Shippable {
    /***
     * This method holds the business logic for shipping specific item sizes,
     * details regarding shipping. We must implement it in all shippable bike parts
     * if there are no restrictions we just pass a true value to the return statement,
     * or we type our business requirements that decide weather the Product is shippable.
     * @param country
     */
    public boolean isAbleToShipToCountry(String country);
}
