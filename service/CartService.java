package com.example.marketplace.service;

import com.example.marketplace.model.CartItem;
import com.example.marketplace.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final CartItemRepository cartItemRepository;

    @Autowired
    public CartService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    public List<CartItem> getCartItems() {
        return cartItemRepository.findAll();
    }

    public void addToCart(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }
}
