package com.sabloane.lab10_sp.models;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
    }
}
