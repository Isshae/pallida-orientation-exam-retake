package com.greenfox.academy.pallidaretake.controllers;

import com.greenfox.academy.pallidaretake.models.WarehouseResponse;
import com.greenfox.academy.pallidaretake.repository.WarehouseRepo;
import com.greenfox.academy.pallidaretake.services.WarehouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseRestController {

 WarehouseServiceImpl warehouseService;

  @Autowired
  public WarehouseRestController(WarehouseServiceImpl warehouseService) {
    this.warehouseService = warehouseService;
  }

  @GetMapping("/warehouse/query")
  public WarehouseResponse queryByPrice(@RequestParam(name = "price") Float price,
                                        @RequestParam(name = "type") String type) {
    if (type.toLowerCase().equals("lower")) {
      return new WarehouseResponse(warehouseService.findAllByUnitPriceLessThan(price));
    } else if (type.toLowerCase().equals("higher")) {
      return new WarehouseResponse(warehouseService.findAllByUnitPriceGreaterThan(price));
    } else if (type.toLowerCase().equals("equal")) {
      return new WarehouseResponse(warehouseService.findAllByUnitPriceEquals(price));
    } else {
      return null;
    }
  }
}
