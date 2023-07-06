package com.ingesoft.carro.service.interfaces;

import com.ingesoft.carro.model.CartItem;
import com.ingesoft.carro.model.CartModel;

public interface CartService {
    CartModel getCart(Long id);
    void addToCart(Long id, CartItem item);
    void removeFromCart(Long id, Long itemId);
}

   


