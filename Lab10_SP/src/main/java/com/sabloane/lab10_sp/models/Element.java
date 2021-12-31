package com.sabloane.lab10_sp.models;

public interface Element {
    void add(Element element) throws Exception;
    void remove(Element element);
}
