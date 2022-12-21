package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.view.InputManager;

import java.awt.*;
public class House extends InteractiveGraphicalObject {

    private double speed;
    private double acceleration;
    private int timer;
    public House(double Xpos, double Ypos,double w,double h, double speed){
        x = Xpos;
        y = Ypos;
        width = w;
        height = h;
        this.speed = speed;
        acceleration = 1;
    }


    public void draw(DrawTool drawTool) {
        //wiese
        drawTool.setCurrentHSBColor(126, 99, 74);
        drawTool.drawFilledRectangle(0,500,800,160);
        //Haus
        //Schornstein
        drawTool.setCurrentHSBColor(0, 0, 30);
        drawTool.drawFilledRectangle(x+5,y-height*0.46875,width/4,height*0.46875);
        //Body von Haus
        drawTool.setCurrentHSBColor(0, 100, 100);
        drawTool.drawFilledRectangle(x,y,width,height);
        //Dach
        drawTool.setCurrentHSBColor(0, 0, 0);
        drawTool.drawFilledTriangle(x,y,x+width/2,y-height/3,x+width,y);
        //Umrandung von Dach
        drawTool.drawTriangle(x,y,x+width/2,y-height/3,x+width,y);
        //Umrandung von Body von Haus
        drawTool.drawRectangle(x,y,width,height);
        //DOOR
        drawTool.drawFilledRectangle(x+width/4,y+height/2,40,160);
        //Fenster
        drawTool.setCurrentHSBColor(0, 0, 50);
        drawTool.drawFilledRectangle(x+width/16,y+width/4,20,64);
        drawTool.drawFilledRectangle(x+width/1.45,y+width/4,20,64);
        //Umrandung von Fenster
        drawTool.setCurrentHSBColor(0, 0, 0);
        drawTool.drawRectangle(x+width/16,y+width/4,20,64);
        drawTool.drawRectangle(x+width/1.45,y+width/4,20,64);
        //Kreuz in Fenster
        drawTool.drawFilledRectangle(x+width/16,y+width/1.54,width/4,height/80);
        drawTool.drawFilledRectangle(x+width/6.15,y+width/4,width/20,height/5);
        drawTool.drawFilledRectangle(x+width/1.45,y+width/1.54,width/4,height/80);
        drawTool.drawFilledRectangle(x+width/1.27,y+width/4,width/20,height/5);
        /*wiese
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

         */
    }
    public void update(double dt){

        if(acceleration < 1){
            acceleration += 0.07*dt;
        }
    }

    @Override
    public void keyPressed(int key) {
        System.out.println(key);
        if(key == 32){
            y = y - speed * acceleration;
        }
    }
}
