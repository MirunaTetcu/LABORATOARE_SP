package com.sabloane.lab10_sp.services;

import com.sabloane.lab10_sp.models.Context;
import com.sabloane.lab10_sp.models.Paragraph;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Center: " + paragraph);
    }
}
