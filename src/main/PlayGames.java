package main;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Peemvit
 */
public class PlayGames extends JFrame implements ActionListener {
        GamePanel home = new GamePanel();
	playstate1 state1 = new playstate1();
        
        public PlayGames(){
            this.setSize(1280,800);
            this.add(home);
            home.BExit1.addActionListener(this);
            home.BStart.addActionListener(this);
        }
    
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()==home.BExit1){
            System.exit(0);
        }else if(e.getSource()==home.BStart){
            this.remove(home);
            this.setSize(1280,800);
            this.add(state1);
            state1.requestFocusInWindow();
            state1.HP =3;
            state1.scores=0;
            state1.times = 100;
            state1.timestart=false;
        }
        }
        
        public static void main(String[] args) {
            JFrame jframe = new PlayGames();
        
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.setSize(1280,800);
            jframe.setTitle("Ninja Run");
            jframe.setLocationRelativeTo(null);
            jframe.pack();
            jframe.setVisible(true);
    } 
    }

