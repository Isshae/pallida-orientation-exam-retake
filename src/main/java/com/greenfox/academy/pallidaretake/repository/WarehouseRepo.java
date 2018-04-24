package com.greenfox.academy.pallidaretake.repository;

import com.greenfox.academy.pallidaretake.models.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseRepo extends CrudRepository<Warehouse, Integer> {

  List<Warehouse> findAllByUnitPriceLessThan(Float price);

  List<Warehouse> findAllByUnitPriceGreaterThan(Float price);

  List<Warehouse> findAllByUnitPriceEquals(Float price);

  List<Warehouse> findAll();

  @Query("SELECT DISTINCT a.city FROM Address a")
  List<String> findDistinctItemNames();
}
