package com.sabloane.lab10_sp.models;

import com.sabloane.lab10_sp.services.AlignStrategy;
import com.sabloane.lab10_sp.services.Visitee;
import com.sabloane.lab10_sp.services.Visitor;

public class Paragraph implements Element, Visitee {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph(Paragraph paragraph) {
        this.text = paragraph.text;
    }

    public String getText() {
        return text;
    }

    public AlignStrategy getAlignStrategy() {
        return alignStrategy;
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    public void setAlign(AlignStrategy align) {
        this.alignStrategy = align;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}