
package main;

/**
 *
 * @author Peemvit
 */
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static main.Constant.PlayerConstants.*;

public class Player extends Entity{
    private ImageIcon[] runAni = new ImageIcon[3];
    private int aniTick,aniIndex,aniSpeed=3;
    private int playerAction = RUNNING;
    private boolean moving,attacking = false;
    private boolean jump;
    public int count = 0;
    
    Player (int x,int y,int width,int height){
        super(x,y,width,height);
        loadAnimations();
    }
    
    public void update(){
        updateAnimationTick();
        updateHitbox();
        updatePos();
    }
    
    public void render(Graphics g){
        if(moving){
        g.drawImage(runAni[aniIndex].getImage(), (int) x, (int) y,110,160, null);}
        drawHitbox(g);
    }
    
    private void loadAnimations() {
         for(int i =0;i<runAni.length;i++){
             runAni[i] = new ImageIcon(this.getClass().getResource("ryuwalk"+(i+1)+".png"));
         }
         
    }
    
    public void setRunning(boolean run){
        this.moving = run;
    }
    
    public void updatePos(){
        
        if(jump){
            if(this.y!=150)
            this.y = y - 200;
        }
    }
    
    private void updateAnimationTick() {
      aniTick++;
      if(aniTick>=aniSpeed){
          aniTick = 0;
          aniIndex++;
          if(aniIndex>=runAni.length){
              aniIndex =0;
              attacking = false;
              if(y<=550){
                            y =550;
                        }
          }
      }
      jump  = false;
    }
    
    public void setAttack(boolean attacking){
        this.attacking = attacking;
                this.y = 550;
    }
    public boolean getAttack(){
        return attacking;
    }
    
    public void setJump(boolean jump){
        this.jump = jump;
    }
}