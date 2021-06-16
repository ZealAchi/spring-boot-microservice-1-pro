package com.padre.springbootmicroservices1product.service;

import com.padre.springbootmicroservices1product.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
