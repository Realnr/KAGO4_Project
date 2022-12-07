package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Sun extends GraphicalObject {
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentHSBColor(188,100,100);
        drawTool.drawFilledRectangle(0,0,600,600);
        drawTool.setCurrentHSBColor(61,100,100);
        drawTool.drawFilledCircle(0,0,100);
    }
}
