package com.infinitelambda.bikestore.products;

import com.infinitelambda.bikestore.staff.Mechanic;

public abstract class BikePart {

  protected String productName;
  protected String itemDescription;
  protected Integer weight;
  protected Integer height;
  protected String brand;
  protected Double price;

  public void shipToCountry(String country) {
    System.out.println("========Output for shipToCountry func========");

    if (this.productName == null || country == null) {
      System.err.println("Cannot ship a null object. Please check your data.");
    } else if (this.productName.equals("") || country.equals("")) {
      System.err.println("Product name or country is missing. Please check your data.");
    } else {
      System.out.println("Item to ship: " + this.productName + "\n" + "Shipped to: " + country + "\n");
    }
  }

  public abstract Double setDiscount(Double percent);

  public abstract void serviceRepairs(BikePart bikePart, Integer days, Double price, Mechanic mechanic);

  public abstract void warrantyRepairProcess();

  public abstract void transfer();

  /* Setters & Getters */

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getItemDescription() {
    System.out.println("========Output for getItemDescription func========");

    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }
}
