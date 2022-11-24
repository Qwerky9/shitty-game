
package main;


import javax.swing.ImageIcon;
import java.awt.Graphics;





public class Tree extends Entity{
    private ImageIcon sprite;
    public int count = 0;
    
    Tree(int x,int y,int width,int height){
        super(x,y,width,height);
        loadImg();
    }
    
    public void update(){
        updateHitbox();
    }
    
    public void render(Graphics g){
        g.drawImage(sprite.getImage(), (int) x, (int) y,110,160, null);
        drawHitbox(g);
    }
    
    private void loadImg() {
             sprite = new ImageIcon(this.getClass().getResource("tree.png"));  
    }
    
    public void updatePos(){
        this.x = this.x - 5;
        if(this.x == 0){
            this.x = 1280;
        }
    }
}

