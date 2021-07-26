package com.dio.productcatalogtwo.controller;

import com.dio.productcatalogtwo.exception.ProductNotFoundException;
import com.dio.productcatalogtwo.model.Product;
import com.dio.productcatalogtwo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Product findById(@PathVariable Long id) throws ProductNotFoundException {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()) {
            throw new ProductNotFoundException(id);
        } else {
            return product.get();
        }
    }
}
