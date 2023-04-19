package com.Microservice.ProductService.service;

import com.Microservice.ProductService.model.ProductRequest;
import com.Microservice.ProductService.model.ProductResponse;

public interface ProductService {

    long addProduct(ProductRequest productRequest);
    ProductResponse getProductById(long productId);
}
