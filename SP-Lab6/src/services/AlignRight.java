package services;

import models.Context;
import models.Paragraph;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Right: " + paragraph);
    }
}
