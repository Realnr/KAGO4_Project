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
/*package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Sun extends GraphicalObject {
    public Sun(double xPos,double yPos,double r, double w,double h){
        x = yPos;
        y = yPos;
        radius = r;
        width = w;
        height = h;
    }
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentHSBColor(188,100,100);
        drawTool.drawFilledRectangle(x,y,width,height);
        drawTool.setCurrentHSBColor(61,100,100);
        drawTool.drawFilledCircle(x,y,radius);
    }
}
*/
