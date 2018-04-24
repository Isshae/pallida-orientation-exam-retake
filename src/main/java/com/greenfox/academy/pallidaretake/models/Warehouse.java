package com.greenfox.academy.pallidaretake.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Warehouse {

  @GeneratedValue
  @Id
  private Integer id;
  private String itemName;
  private String manufacturer;
  private String category;
  private String size;
  private Float unitPrice;

  public Warehouse() {
  }

  public Warehouse(String itemName, String manufacturer, String category, String size, Float unitPrice) {
    this.itemName = itemName;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.unitPrice = unitPrice;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
  }
}


