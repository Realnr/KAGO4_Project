package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Clouds extends GraphicalObject {
    private int x;
    private int y;
    private double r;

    public void draw(DrawTool drawTool) {
        for (int i = 0; i <= 4; i++) {
            x = 50+i*200;
            y = 200;
            r = 35;
            drawTool.setCurrentHSBColor(0, 0, 0);
            drawTool.drawFilledCircle(x, y, r+2);
            drawTool.drawFilledCircle(x + r, y - r/2, r+2);
            drawTool.drawFilledCircle(x + r * 2, y, r+2);
            drawTool.setCurrentHSBColor(0, 0, 100);
            drawTool.drawFilledCircle(x, y, r);
            drawTool.drawFilledCircle(x + r, y - r/2, r);
            drawTool.drawFilledCircle(x + r * 2, y, r);
        }
    }
}

