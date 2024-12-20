package com.example.shopweb.repository;

import com.example.shopweb.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    // Additional custom queries (if needed) can go here
}
