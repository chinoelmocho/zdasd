/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_06.vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author LAB-2
 */
public class PanlePint extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 400, 75);
        g.setColor(Color.white);
        g.fillRect(0, 75, 400, 75);
        g.setColor(Color.CYAN);
        g.fillRect(0, 150, 400, 75);
        
        
       for(var i=0;i<10;i++){
        g.setColor(Color.yellow);
        g.drawLine(180,100 ,70+i*2 , 100+i*2);
    
    }
        
        
        
        
        g.setColor(Color.yellow);
        g.fillOval(160, 80, 50, 50);
        
        g.setColor(Color.black );
        g.fillOval(175, 90, 10, 10);
        g.setColor(Color.black );
        g.fillOval(185, 90, 10, 10);
        
        
        g.drawArc(170,90, 25, 30, 200, 80);
        
        
        g.setColor(Color.yellow);
        g.drawLine(160,100 ,100 , 100);
         g.setColor(Color.yellow);
        g.drawLine(210,100 ,280 , 100);
         g.setColor(Color.yellow);
        g.drawLine(190,80 ,190 , 50);
         g.setColor(Color.yellow);
        g.drawLine(190,130 ,190 , 160);
    }
    
    
    
    
    
}
