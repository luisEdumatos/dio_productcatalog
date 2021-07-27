package com.dio.dio_shoppingcart.service;

import com.dio.dio_shoppingcart.exception.CartNotFoundException;
import com.dio.dio_shoppingcart.model.Cart;
import com.dio.dio_shoppingcart.model.Item;
import com.dio.dio_shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart addItem(Integer id, Item item) {
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        if (savedCart.equals(Optional.empty())) {
            cart = new Cart(id);
        }
        else {
            cart = savedCart.get();
        }
        cart.getItems().add(item);
        return cartRepository.save(cart);
    }

    public Cart findById(Integer id) throws CartNotFoundException {
        Optional<Cart> cart = cartRepository.findById(id);
        if (cart.isEmpty()) {
            throw new CartNotFoundException(id);
        } else {
            return cart.get();
        }
    }

    public void delete(Integer id) {
        cartRepository.deleteById(id);
    }
}
