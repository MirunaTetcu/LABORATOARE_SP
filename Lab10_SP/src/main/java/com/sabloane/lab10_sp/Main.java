package com.sabloane.lab10_sp;

import com.sabloane.lab10_sp.models.Paragraph;
import com.sabloane.lab10_sp.models.Section;
import com.sabloane.lab10_sp.services.OpenCommand;
import com.sabloane.lab10_sp.services.SaveCommand;
import com.sabloane.lab10_sp.services.StatisticsCommand;

public class Main {
    public static void main(String[] args) throws Exception {
        OpenCommand openCommand = new OpenCommand("Titlu amuzant");

        Section sectionToSave = new Section("Capitol 14");
        sectionToSave.add(new Paragraph("Acesta este un capitol adaugat printr-un Command"));
        SaveCommand saveCommand = new SaveCommand(sectionToSave);

        StatisticsCommand statisticsCommand = new StatisticsCommand();

        openCommand.execute();
        saveCommand.execute();
        statisticsCommand.execute();
    }
}
