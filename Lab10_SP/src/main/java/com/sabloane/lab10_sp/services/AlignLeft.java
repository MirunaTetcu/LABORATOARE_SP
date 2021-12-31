package com.sabloane.lab10_sp.services;

import com.sabloane.lab10_sp.models.Context;
import com.sabloane.lab10_sp.models.Paragraph;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Left: " + paragraph);
    }
}
