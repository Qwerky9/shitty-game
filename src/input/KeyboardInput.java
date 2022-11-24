/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import main.playstate1;
/**
 *
 * @author Peemvit
 */
public class KeyboardInput implements KeyListener{
    
    private playstate1 play1;
    
    public KeyboardInput(playstate1 play1){
        this.play1 = play1;
    }
    
    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_SPACE:
                System.out.println("UP");
                play1.getPlayer().setJump(true);
                play1.getPlayer().updatePos();
                break;
            case KeyEvent.VK_CONTROL:
                play1.getPlayer().setAttack(true);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
}
