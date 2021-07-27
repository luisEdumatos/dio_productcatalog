package com.dio.dio_shoppingcart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CartNotFoundException extends Exception {
    public CartNotFoundException(Integer id) {
        super("Product not found with ID " + id);
    }
}
