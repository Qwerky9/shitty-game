/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JFrame;
/**
 *
 * @author Peemvit
 */
public class GameWindow extends JFrame {
    public GameWindow(GamePanel gamePanel){
        JFrame jframe = new JFrame();
        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setTitle("Ninja Run");
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setVisible(true);
    }
}
