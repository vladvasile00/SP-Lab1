package com.sabloane.services;

import com.sabloane.models.Paragraph;
import com.sabloane.models.Section;

public class SaveCommand implements Command {
    private Section section;

    public SaveCommand(Section section) {
        this.section = section;
    }

    @Override
    public void execute() throws Exception {
        this.section.add(new Paragraph("Ceva frumos!"));

        DocumentManager.getInstance().getBook().addContent(this.section);
    }
}
