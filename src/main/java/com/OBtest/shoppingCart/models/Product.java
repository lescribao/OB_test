package com.OBtest.shoppingCart.models;
import java.util.Timer;
import java.util.TimerTask;

public class Product {

    private int id;
    private String description;
    private int amount;


    //constructor
    public Product(int id, String description, int amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;

    }


    //getters
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public int getAmount() {
        return amount;
    }


    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }


}
