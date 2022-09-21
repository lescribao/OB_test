package com.OBtest.shoppingCart.services;

import com.OBtest.shoppingCart.CartManager;
import com.OBtest.shoppingCart.models.Cart;
import com.OBtest.shoppingCart.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    CartManager cartManager = new CartManager();

    public void createCart(int id) {

        if (cartManager.getCartList().get(id) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The ID introduced is already in use.");
        } else {
            List<Product> productList = new ArrayList<>();
            Cart cart = new Cart(id, productList);

            cartManager.getCartList().put(id, cart);
            cartManager.deleteCart(id);
        }

    }

    public void addProduct(int id, Product product) {
        if(cartManager.getCartList().get(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The Cart with the given ID doesn't exist");
        } else {
                cartManager.getCartList().get(id).getProductList().add(product);
            }
    }

    public List<Product> getProducts(int id) {

        if(cartManager.getCartList().get(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The Cart with the given ID doesn't exist");
        } else {
            return cartManager.getCartList().get(id).getProductList();
        }
    }

    public void deleteCart(int id) {

        if(cartManager.getCartList().get(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The Cart with the given ID doesn't exist");
        } else {
            cartManager.getCartList().remove(id);
        }

    }
}
