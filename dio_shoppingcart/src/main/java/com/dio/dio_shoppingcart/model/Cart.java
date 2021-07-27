package com.dio.dio_shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("cart")
public class Cart {

    @Id
    private Integer id;
    private List<Item> items = new ArrayList<>();

    public Cart (Integer id) {
        this.id = id;
    }
}
