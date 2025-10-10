package com.system.inventory_service.service;

import com.system.inventory_service.entity.ProductInventory;
import com.system.inventory_service.repository.ProductInventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInventoryService {
    private final ProductInventoryRepository repository;

    public ProductInventoryService(ProductInventoryRepository repository) {
        this.repository = repository;
    }

    public List<ProductInventory> getAll() {
        return repository.findAll();
    }

    public ProductInventory save(ProductInventory productInventory) {
        return repository.save(productInventory);
    }
}