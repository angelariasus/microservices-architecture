package com.system.inventory_service.controller;

import com.system.inventory_service.entity.ProductInventory;
import com.system.inventory_service.service.ProductInventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class ProductInventoryController {
    private final ProductInventoryService service;

    public ProductInventoryController(ProductInventoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductInventory> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ProductInventory addProduct(@RequestBody ProductInventory productInventory) {
        return service.save(productInventory);
    }
}