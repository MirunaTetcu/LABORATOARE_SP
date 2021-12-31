package com.sabloane.lab10_sp.services;

import com.sabloane.lab10_sp.models.Context;
import com.sabloane.lab10_sp.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph, Context context);
}