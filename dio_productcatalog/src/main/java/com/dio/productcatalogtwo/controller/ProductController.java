package com.dio.productcatalogtwo.controller;

import com.dio.productcatalogtwo.exception.ProductNotFoundException;
import com.dio.productcatalogtwo.model.Product;
import com.dio.productcatalogtwo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> listAll() {
        return productService.listAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) throws ProductNotFoundException {
        return productService.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
