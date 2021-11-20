package com.infinitelambda.bikestore;

import java.util.List;

public class Frame extends BikePart implements Shippable {

  String geometryType;

  String discipline;

  String wheelSize;

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

  @Override
  public boolean isAbleToShipToCountry(String country) {
    return false;
  }
}
