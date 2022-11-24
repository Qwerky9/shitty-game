package main;

import input.KeyboardInput;
import input.MouseInputs;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Peemvit
 */
public class GamePanel extends JPanel{
    
    private MouseInputs mouseInputs;
    private ImageIcon bg = new ImageIcon(this.getClass().getResource("bg.png"));
    private ImageIcon exit = new ImageIcon(this.getClass().getResource("exit.png"));
    private ImageIcon starts = new ImageIcon(this.getClass().getResource("start.png"));
    private ImageIcon title = new ImageIcon(this.getClass().getResource("title.png"));
    public JButton BStart = new JButton(starts);
    public JButton BExit1 = new JButton(exit);

    GamePanel(){
        
        setPanelSize();
        setLayout(null);
        BExit1.setBounds(500, 600, 370,175);
        add(BExit1);
        BStart.setBounds(500,300,370,175);
        add(BStart);
        
    }
    
    private void setPanelSize(){
        Dimension size = new Dimension(1280,800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg.getImage(),0,0,1280,800,this);
        g.drawImage(title.getImage(),500,0,350,350,this);
    }
}

