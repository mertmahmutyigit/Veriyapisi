package uyg_1;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UYG3 extends JPanel {
    
    @Override
    public void paint(Graphics g){
    super.paint(g);
    Polygon p=new Polygon();
    g.drawLine(10,10,10,400);
    g.drawLine(10,200,400,200);
    int x=10,y=200;
        for (int i = 0; i <5; i++) {
         p.addPoint(10+i*20, 200-8*i*i);
         
         g.drawPolyline(p.xpoints,p.ypoints,p.npoints);
        }
    }
    public static void main(String[] args) {
        UYG3 u=new UYG3();
        JFrame J=new JFrame();
        J.add(u);
        J.setSize(700,700);
        J.setVisible(true);
    }
}
