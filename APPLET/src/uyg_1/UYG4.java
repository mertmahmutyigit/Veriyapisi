///sinnnnnn
package uyg_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JApplet;
import sun.invoke.util.ValueConversions;

/**
 *
 * @author MERT MAHMUT YİĞİT
 */
public class UYG4 extends JApplet{
    public void paint(Graphics g){
    super.paint(g);
        g.setColor(Color.BLACK);
       Polygon p=new Polygon();
       g.drawLine(50, 200, 400, 200);
       g.drawLine(50, 10, 50, 400);
        for (int i = 0; i < 350; i++) {
            p.addPoint(i+50,200-(int)(60*Math.sin((i/180.0)*8*Math.PI)));
        g.drawPolyline(p.xpoints, p.ypoints,p.npoints);
        }
        } 
    
    }

