/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Peemvit
 */
public class Constant {
    public static class PlayerConstants{
        public static final int RUNNING = 0;
        public static final int JUMP = 10;
        public static final int ATTACK = 0;
        
        public static int GetSpriteAmount(int player_action){
            switch(player_action){
                default:
                    return 0;
            }
        }
    }
}
