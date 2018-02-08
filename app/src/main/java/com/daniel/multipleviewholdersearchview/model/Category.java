package com.daniel.multipleviewholdersearchview.model;

/**
 * Created by daniel on 2/8/2018.
 */

public class Category {
    public int id;
    public String category;
    public String url;
    public String name;

    public Category(int id, String category, String url, String name) {
        this.id = id;
        this.category = category;
        this.url = url;
        this.name = name;
    }
}
