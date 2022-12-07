package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Tree extends GraphicalObject {
    private int x;
    private int y;
    private int w;
    private int h;
    private double r;

    public void draw(DrawTool drawTool) {
        for(int i = 0; i <= 4; i++){
            x = 50+i*120;
            y = 450;
            w = 40;
            h = 120;
            r = 40;

            //Baum
            //Stamm
            drawTool.setCurrentHSBColor(40, 99, 54);
            drawTool.drawFilledRectangle(x, y, w, h);
            //Blyatter
            drawTool.setCurrentHSBColor(126, 99, 54);
            drawTool.drawFilledCircle(x+(w/2),y-(r/2),w*1.5);
        }
    }
}
