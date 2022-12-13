package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Cloud extends GraphicalObject {
    public Cloud(double Xpos,double Ypos, double r){
        x = Xpos;
        y = Ypos;
        radius = r;
    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentHSBColor(0, 0, 0);
        drawTool.drawFilledCircle(x, y, radius+2);
        drawTool.drawFilledCircle(x + radius, y - radius/2, radius+2);
        drawTool.drawFilledCircle(x + radius * 2, y, radius+2);
        drawTool.setCurrentHSBColor(0, 0, 100);
        drawTool.drawFilledCircle(x, y, radius);
        drawTool.drawFilledCircle(x + radius, y - radius/2, radius);
        drawTool.drawFilledCircle(x + radius * 2, y, radius);
    }
}
