package com.daniel.multipleviewholdersearchview.model;

/**
 * Created by daniel on 2/8/2018.
 */

public class Product {
    public int id;
    public String img;
    public String url;
    public String name;
    public int price;

    public Product(int id, String img, String url, String name, int price){
        this.id = id;
        this.img = img;
        this.url = url;
        this.name = name;
        this.price = price;
    }
}
