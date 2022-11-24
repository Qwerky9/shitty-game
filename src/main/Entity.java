/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Peemvit
 */
public class Entity {
    
    protected int x,y;
    protected int width,height;
    protected Rectangle hitbox;
    
    public Entity(int x,int y,int width,int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        
        initHitbox();
    }
    
    private void initHitbox(){
        hitbox = new Rectangle((int) x, (int) y,width,height);
    }
    protected void updateHitbox(){
        hitbox.y = (int) y;
        hitbox.x = (int) x;
    }
    public Rectangle getHitbox(){
        return hitbox;
    }
    
    protected void drawHitbox(Graphics g){
        
    }
}
