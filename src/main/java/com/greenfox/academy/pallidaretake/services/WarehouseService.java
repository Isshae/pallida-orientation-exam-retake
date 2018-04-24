package com.greenfox.academy.pallidaretake.services;

import com.greenfox.academy.pallidaretake.models.Warehouse;

import java.util.List;

public interface WarehouseService {
  List<Warehouse> findAllByUnitPriceLessThan(Float price);

  List<Warehouse> findAllByUnitPriceGreaterThan(Float price);

  List<Warehouse> findAllByUnitPriceEquals(Float price);

  List<Warehouse> findAll();
}
