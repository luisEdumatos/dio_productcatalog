package com.dio.productcatalogtwo.service;

import com.dio.productcatalogtwo.exception.ProductNotFoundException;
import com.dio.productcatalogtwo.model.Product;
import com.dio.productcatalogtwo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public List<Product> listAll() {
        List<Product> allProducts = (List<Product>) productRepository.findAll();
        return allProducts.stream()
                .collect(Collectors.toList());
    }

    public Product findById(Long id) throws ProductNotFoundException {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()) {
            throw new ProductNotFoundException(id);
        } else {
            return product.get();
        }
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
