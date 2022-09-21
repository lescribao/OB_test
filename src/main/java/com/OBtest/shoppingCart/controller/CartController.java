package com.OBtest.shoppingCart.controller;

import com.OBtest.shoppingCart.CartManager;
import com.OBtest.shoppingCart.models.Cart;
import com.OBtest.shoppingCart.models.Product;
import com.OBtest.shoppingCart.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CartController {


    @Autowired
    CartService cartService;



    @PostMapping("/cart/create/")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCart(@RequestParam int id) {

        cartService.createCart(id);

    }

    @PutMapping("/cart/addProduct/")
    @ResponseStatus(HttpStatus.OK)
    public void addProduct(@RequestParam int id, @RequestBody Product product) {

        cartService.addProduct(id, product);


    }

    @GetMapping("/cart/info/")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getProducts(@RequestParam int id) {

        return cartService.getProducts(id);

    }

    @DeleteMapping("/cart/delete/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCart(@RequestParam int id) {

        cartService.deleteCart(id);

    }
}
