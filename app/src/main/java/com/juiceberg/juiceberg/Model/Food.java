package com.juiceberg.juiceberg.Model;

/**
 * Created by darshan on 30/12/17.
 */

public class Food {


    private String name, price, menuId;

    public Food() {
    }

    public Food(String name, String price, String menuId) {
        this.name = name;
        this.price = price;
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
