package appletgece;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class uyg5 extends JPanel {
    public void paint(Graphics g){
        Polygon p=new Polygon();
        p.addPoint(0, 200);
        p.addPoint(100, 100);
        p.addPoint(200, 200);
        p.addPoint(100, 300);
        p.addPoint(0, 200);
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
    }
    public static void main(String[] args) {
        uyg5 u5=new uyg5();
        JFrame f=new JFrame();
        f.add(u5);f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }
    
}
