package com.dio.dio_shoppingcart.controller;

import com.dio.dio_shoppingcart.exception.CartNotFoundException;
import com.dio.dio_shoppingcart.model.Cart;
import com.dio.dio_shoppingcart.model.Item;
import com.dio.dio_shoppingcart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item) {
        return cartService.addItem(id, item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cart findById(@PathVariable("id") Integer id) throws CartNotFoundException {
        return cartService.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable("id") Integer id) {
        cartService.delete(id);
    }

}
