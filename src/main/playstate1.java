/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import input.KeyboardInput;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class playstate1 extends JPanel implements ActionListener {
    
    private final ImageIcon bg = new ImageIcon(this.getClass().getResource("bg.png"));
    private final ImageIcon gameo = new ImageIcon(this.getClass().getResource("gameover.png"));
    
    
    Player p = new Player(200,550,128,160);
    Enemy e = new Enemy(800,550,100,160);
    Tree tre = new Tree(1000,550,100,160);
    Sword sao = new Sword(260,550,128,15);
    
    
    private ImageIcon tree = new ImageIcon(this.getClass().getResource("tree.png"));
    private int aniTick,aniIndex,aniSpeed=5;
    
    public int times ;
    boolean timestart = true;
    
    public int HP = 3;
    public int scores = 0;
    
    private JLabel score = new JLabel(); 
    private JLabel Health = new JLabel();

    Thread time = new Thread(new Runnable(){
            public void run(){
		while(true){
                    try{
			Thread.sleep(10);
                    }catch(Exception e){ }
                    
                    if(timestart == false){
			repaint();
                    }
		}
            }
	});
    Thread actor = new Thread(new Runnable(){
            public void run(){
		while(true){
                	try{
                            Thread.sleep(250);
			}catch(Exception e){}
                        p.update();
                        p.updateHitbox();
                                if(p.getHitbox().intersects(e.getHitbox())){
                            e.x = 1280;
                            HP--;
                }
                               if(sao.getHitbox().intersects(e.getHitbox())){
                                   e.x = 1280;
                                   scores = scores +10;
                               } 
                               if(p.getHitbox().intersects(tre.getHitbox())){
                                   tre.x = 1280;
                            HP--;
                }
                        repaint();
		}
            }
	});
    
    Thread enemy = new Thread(new Runnable(){
        public void run(){
            while(true){
                try{
                    Thread.sleep(30);
                }
                catch(Exception e){}
                e.updatePos();
                e.update();
                repaint();
            }
        }
    });
    
    Thread treethread = new Thread(new Runnable(){
        public void run(){
            while(true){
                try{
                    Thread.sleep(30);
                }
                catch(Exception e){}
                tre.updatePos();
                tre.update();
                repaint();
            }
        }
    });
    
    
    Thread t = new Thread(new Runnable(){
            public void run() {
		while(true){
                	if(timestart == false){
                            times = (times-1) ;
                                    scores ++;
			}
			try{
                            Thread.sleep(1000);
			}catch(InterruptedException e)
			{
                            e.printStackTrace();
			}
		}
            }
	});
    
    playstate1(){
        addKeyListener(new KeyboardInput(this));
        this.setFocusable(true);
	this.setLayout(null);
        this.requestFocus();
        score.setText("Scores :"+String.valueOf(scores));
        score.setBounds(640,1,100,50);
        Health.setText("Health :"+String.valueOf(HP));
        Health.setBounds(640,10,100,50);
        add(score);
        add(Health);
        p.setRunning(true);
        time.start();
        t.start();
        actor.start();
        enemy.start();
        treethread.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D grass = (Graphics2D) g;
        Graphics2D dirt = (Graphics2D) g;
        Graphics2D sword = (Graphics2D) g;
        g.drawImage(bg.getImage(),0,0,1280,800,this);
        dirt.setColor(new Color(167,93,41));
        dirt.fillRect(0, 701, 1280, 100);
        grass.setColor(new Color(51,178,14));
        grass.fillRect(0, 700, 1280, 12);
        if(HP<=0){ 
            time.suspend();
            t.suspend();
            actor.suspend();
            enemy.suspend();
            treethread.suspend();
            p.y = -500;
            e.y = -500;
            tre.y = -500;
            Health.setBounds(0,-500,0,0);
            score.setBounds(640,400,500,50);
            score.setFont(new Font("Serif" , Font.PLAIN, 50));
            g.drawImage(gameo.getImage(), 500, 70, null);
        }
        p.render(g);
        e.render(g);
        tre.render(g);
        sao.getHitbox().y =350;
        if(p.getAttack()){
        sao.getHitbox().y =550;
        sao.render(g);
        }
        score.setText("Scores :"+String.valueOf(scores));
        Health.setText("Health :"+String.valueOf(HP));
    }
    
    public Player getPlayer(){
        return p;
    }
    
    
    
}
