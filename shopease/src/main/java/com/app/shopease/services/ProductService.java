package com.app.shopease.services;

import com.app.shopease.dto.ProductDto;
import com.app.shopease.entities.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    public Product addProduct(ProductDto product);
    public List<ProductDto> getAllProducts(UUID categoryId, UUID typeId);
    ProductDto getProductBySlug(String slug);
    ProductDto getProductById(UUID id);
    Product updateProduct(ProductDto productDto);
}
