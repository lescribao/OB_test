package com.OBtest.shoppingCart.models;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class Cart {

    private int id;
    private List<Product> productList;

    //constructor
    public Cart(int id, List<Product> productList) {
        this.id = id;
        this.productList = productList;
    }


    //getters
    public int getId() {
        return id;
    }
    public List<Product> getProductList() {
        return productList;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
