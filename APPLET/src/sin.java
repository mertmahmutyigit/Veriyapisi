

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.net.www.content.audio.x_aiff;


public class sin extends JPanel{
 


    public void paint(Graphics g){
    super.paint(g);
    
   
       g.setColor(Color.BLACK);
         Polygon p=new Polygon();
       g.drawLine(50, 200, 400, 200);
       g.drawLine(50, 10, 50, 400);
      for (int x = 0; x < 350; x++)
           p.addPoint(x +50,200 -(int)(60 * Math.sin((x / 180.0) * 8* Math.PI)));
      
     g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
   
    
    }

    public static void main(String[] args) {
        sin s=new sin();
           JFrame f=new JFrame();
           f.add(s);
           f.setSize(500,500);
           f.setVisible(true);
    }
}
