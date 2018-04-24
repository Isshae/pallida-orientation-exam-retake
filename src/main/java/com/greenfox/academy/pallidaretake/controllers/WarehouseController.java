package com.greenfox.academy.pallidaretake.controllers;

import com.greenfox.academy.pallidaretake.services.WarehouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WarehouseController {

  WarehouseServiceImpl warehouseService;

  @Autowired
  public WarehouseController(WarehouseServiceImpl warehouseService) {
    this.warehouseService = warehouseService;
  }

  @GetMapping("/")
  public String viewIndexPage(Model model) {
    model.addAttribute("items", warehouseService.findAll());
    return "index";
  }

  @GetMapping("/warehouse")
  public String showWarehousePage(Model model) {
    return "summary";
  }

  @PostMapping("/warehouse/summary")
  public String listSelectedItems() {

    return "redirect:/";
  }
}
