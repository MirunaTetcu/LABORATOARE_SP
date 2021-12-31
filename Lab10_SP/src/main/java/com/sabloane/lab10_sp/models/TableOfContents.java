package com.sabloane.lab10_sp.models;

import com.sabloane.lab10_sp.models.Element;
import com.sabloane.lab10_sp.services.Visitee;
import com.sabloane.lab10_sp.services.Visitor;

public class TableOfContents implements Element, Visitee {
    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}
