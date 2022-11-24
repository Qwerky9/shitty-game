/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Peemvit
 */
public class Sword extends Entity{
    Sword (int x,int y,int width,int height){
        super(x,y,width,height);
    }
    
    public void update(){
        updateHitbox();
    }
    
    public void render(Graphics g){
        g.setColor(new Color(255,0,0));
        g.fillRect(x,y,width,height);
        drawHitbox(g);
    }
    
    
}
