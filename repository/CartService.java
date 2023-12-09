package com.example.marketplace.controller;

import com.example.marketplace.model.CartItem;
import com.example.marketplace.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public List<CartItem> getCartItems() {
        return cartService.getCartItems();
    }

    @PostMapping
    public void addToCart(@RequestBody CartItem cartItem) {
        cartService.addToCart(cartItem);
    }
}
