package com.greenfox.academy.pallidaretake.models;

import java.util.List;

public class WarehouseResponse {

  private String response;
  private List<Warehouse> clothes;

  public WarehouseResponse() {
  }

  public WarehouseResponse(List<Warehouse> clothes) {
    this.response = "ok";
    this.clothes = clothes;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public List<Warehouse> getClothes() {
    return clothes;
  }

  public void setClothes(List<Warehouse> clothes) {
    this.clothes = clothes;
  }
}
