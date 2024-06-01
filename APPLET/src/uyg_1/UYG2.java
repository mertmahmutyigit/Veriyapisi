package uyg_1;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

 public class UYG2 extends JPanel{
    public void paint(Graphics g){
    
        Polygon p=new Polygon();
        g.drawLine(10,250,500,250);
        g.drawLine(10,10 ,10,500);
        int x=10,y=250,işaret=-1;
        for (int i = 0; i <= 10; i++) {
           p.addPoint(x, y); 
           x=x+50;
            y=y+(işaret*50);
           işaret=işaret*(-1);
           
        } g.drawPolyline(p.xpoints, p.ypoints,p.npoints);
    }
     public static void main(String[] args) {
         UYG2 u=new UYG2();
         JFrame j=new JFrame();
         j.add(u);
         j.setSize(600, 700);
         j.setVisible(true);
     }
 
     
     
}
