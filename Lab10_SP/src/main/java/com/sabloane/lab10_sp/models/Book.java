package com.sabloane.lab10_sp.models;

import com.sabloane.lab10_sp.models.Author;
import com.sabloane.lab10_sp.services.Visitee;
import com.sabloane.lab10_sp.services.Visitor;

import java.util.ArrayList;

public class Book implements Visitee {
    private String title;
    private ArrayList<Element> elements;
    private ArrayList<Author> authors;

    public Book(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
        this.authors = new ArrayList<Author>();
    }

    public void addContent (Element element) {
        this.elements.add(element);
    }

    public void addAuthor (Author author) {
        this.authors.add(author);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}
