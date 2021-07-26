package com.dio.productcatalogtwo.repository;

import com.dio.productcatalogtwo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
