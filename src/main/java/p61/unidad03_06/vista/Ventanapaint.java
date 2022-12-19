/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_06.vista;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author LAB-2
 */
public class Ventanapaint extends JFrame {
    private PanlePint panelpain;
    
    public Ventanapaint(){
    this.setSize(800,500);
    this.setLocation(100,100);
    this.setTitle("VEntanaXD");
  this.panelpain=new PanlePint ();
    this.panelpain.setBackground(Color.CYAN);
    this.setContentPane(this.panelpain);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    
    
    }
    public static void main(String args[]){
    var ventana=new Ventanapaint();
    
    }


}

