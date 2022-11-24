package input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import main.playstate1;

public class MouseInputs implements MouseListener,MouseMotionListener{
    
    private playstate1 play1;
    
    public MouseInputs(playstate1 play1){
        this.play1 = play1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      if(e.getButton() == MouseEvent.BUTTON1){
          play1.getPlayer().setAttack(true);
      }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
}
