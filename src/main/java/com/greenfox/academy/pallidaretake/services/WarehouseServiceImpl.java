package com.greenfox.academy.pallidaretake.services;

import com.greenfox.academy.pallidaretake.models.Warehouse;
import com.greenfox.academy.pallidaretake.repository.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

  WarehouseRepo warehouseRepo;

  @Autowired
  public WarehouseServiceImpl(WarehouseRepo warehouseRepo) {
    this.warehouseRepo = warehouseRepo;
  }

  @Override
  public List<Warehouse> findAllByUnitPriceLessThan(Float price) {
    return warehouseRepo.findAllByUnitPriceLessThan(price);
  }

  @Override
  public List<Warehouse> findAllByUnitPriceGreaterThan(Float price) {
    return warehouseRepo.findAllByUnitPriceGreaterThan(price);
  }

  @Override
  public List<Warehouse> findAllByUnitPriceEquals(Float price) {
    return warehouseRepo.findAllByUnitPriceEquals(price);
  }

  @Override
  public List<Warehouse> findAll() {
    return warehouseRepo.findAll();
  }
}
