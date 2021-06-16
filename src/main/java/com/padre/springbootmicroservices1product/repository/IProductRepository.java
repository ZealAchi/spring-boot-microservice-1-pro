package com.padre.springbootmicroservices1product.repository;

import com.padre.springbootmicroservices1product.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface IProductRepository extends CrudRepository<Product,Long> {

}
