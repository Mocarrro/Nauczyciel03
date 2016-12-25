package com.project.mcr.nauczyciel02.model;

/**
 * Created by MCR on 24.11.2016.
 */
public class Category {

    private int category_id;
    private String name;

    public Category(int category_id, String name) {
        this.category_id = category_id;
        this.name = name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
