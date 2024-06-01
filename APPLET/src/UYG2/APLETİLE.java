package UYG2;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JApplet;

public class APLETİLE extends JApplet {

    public void init() {
    }
public void paint(Graphics g){
super.paint(g);
Polygon p=new Polygon();
g.drawLine(10,200,400,200);
g.drawLine(10,10,10,400);
int x=10, y=200,işaret=-1;
    for (int i = 0; i < 10; i++) {
        p.addPoint(x, y);
        x=x+50;
        y=y+işaret*50;
        işaret=işaret*(-1);
        g.drawPolyline(p.xpoints, p.ypoints,p.npoints);
    }
}
}
