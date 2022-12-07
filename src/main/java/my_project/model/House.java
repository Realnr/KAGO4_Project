package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
public class House extends GraphicalObject {




    public void draw(DrawTool drawTool) {
        //wiese
        drawTool.setCurrentHSBColor(126, 99, 74);
        drawTool.drawFilledRectangle(0,500,800,160);
        //Haus
        //Schornstein
        drawTool.setCurrentHSBColor(0, 0, 30);
        drawTool.drawFilledRectangle(105,50,20,150);
        //Body von Haus
        drawTool.setCurrentHSBColor(0, 100, 100);
        drawTool.drawFilledRectangle(100,200,80,320);
        //Dach
        drawTool.setCurrentHSBColor(0, 0, 0);
        drawTool.drawFilledTriangle(100,200,140,40,180,200);
        //Umrandung von Dach
        drawTool.drawTriangle(100,200,140,40,180,200);
        //Umrandung von Body von Haus
        drawTool.drawRectangle(100,200,80,320);
        //DOOR
        drawTool.drawFilledRectangle(120,400,40,120);
        //Fenster
        drawTool.setCurrentHSBColor(0, 0, 50);
        drawTool.drawFilledRectangle(105,220,20,64);
        drawTool.drawFilledRectangle(155,220,20,64);
        //Umrandung von Fenster
        drawTool.setCurrentHSBColor(0, 0, 0);
        drawTool.drawRectangle(105,220,20,64);
        drawTool.drawRectangle(155,220,20,64);
        //Kreuz in Fenster
        drawTool.drawFilledRectangle(105,252,20,4);
        drawTool.drawFilledRectangle(113,220,4,64);
        drawTool.drawFilledRectangle(155,252,20,4);
        drawTool.drawFilledRectangle(163,220,4,64);
    }
}
