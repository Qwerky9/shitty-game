
package main;

/**
 *
 * @author Peemvit
 */
import javax.swing.ImageIcon;
import java.awt.Graphics;




public class Enemy extends Entity{
    private ImageIcon sprite;
    public int count = 0;
    
    Enemy (int x,int y,int width,int height){
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
             sprite = new ImageIcon(this.getClass().getResource("enemy.png"));  
    }
    
    public void updatePos(){
        this.x = this.x - 20;
        if(this.x == 0){
            this.x = 1280;
        }
    }
}
