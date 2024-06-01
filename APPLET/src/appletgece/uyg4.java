package appletgece;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class uyg4  extends JPanel{
    public void paint(Graphics g){
       g.setColor(Color.BLACK);
       Polygon p=new Polygon();
       g.drawLine(50, 200, 400, 200);
       g.drawLine(50, 10, 50, 400);
        for (int x = 0; x < 350; x++) 
            p.addPoint(x + 50, 
        200 -(int)(60 * Math.sin((x / 180.0) * 8
                    * Math.PI)));
     g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
    }
    public static void main(String[] args) {
        uyg4 u3=new uyg4();
        JFrame f=new JFrame();
        f.add(u3);f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }
    
}
