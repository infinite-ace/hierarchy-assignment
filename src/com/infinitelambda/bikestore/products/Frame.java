package com.infinitelambda.bikestore.products;

import com.infinitelambda.bikestore.staff.Mechanic;

public class Frame extends BikePart implements Shippable {

  String geometryType;

  String discipline;

  String wheelSize;

  @Override
  public Double setDiscount(Double percent) {
      return this.getPrice() - percent / 100;
  }

  @Override
  public void serviceRepairs(BikePart bikePart, Integer days, Double price, Mechanic mechanic) {
    /*

    */

    System.out.println("Mechanic");
  }

  @Override
  public void warrantyRepairProcess() {

  }

  @Override
  public void transfer() {

  }

  @Override
  public boolean isAbleToShipToCountry(String country) {
    return false;
  }
}
