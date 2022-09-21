package com.OBtest.shoppingCart;

import com.OBtest.shoppingCart.models.Cart;

import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class CartManager {

    HashMap<Integer, Cart> cartList = new HashMap<Integer, Cart>();

    public CartManager() {}

    public void deleteCart(int id) {

        //for this scenario, as I wasn't completely used to deleting items after a set time after it's creation
        //I used google to research for an option that seemed to fit my needs, in this case a TimerTask with a delay of
        //600 minutes (600000 milliseconds) that simply executes the remove method with the given id from the service.
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                cartList.remove(id);
                timer.cancel();
            }
        };

        timer.scheduleAtFixedRate(task, 600000, 600000);
    }

    public HashMap<Integer, Cart> getCartList() {
        return cartList;
    }

    public void setCartList(HashMap<Integer, Cart> cartList) {
        this.cartList = cartList;
    }
}
