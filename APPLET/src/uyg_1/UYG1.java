package uyg_1;

import java.awt.Frame;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UYG1 extends JPanel {
    
    public void paint(Graphics g){
        String isim=JOptionPane.showInputDialog("isimi gir ");
        String soy=JOptionPane.showInputDialog("soyad gir ");
        g.drawLine(10,20, 100,20);
        g.drawString(isim,10,40);
        g.drawLine(10,60,100, 60);
        g.drawString(soy,10,80 );
    }
    
    
    
    
    public static void main(String[] args) {
        UYG1 u=new UYG1();
        Frame j=new Frame();
        j.add(u);
        j.setSize(400,400);
        j.setVisible(true);
    }
    
}
