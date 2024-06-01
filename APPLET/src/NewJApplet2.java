
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JApplet;

public class NewJApplet2 extends JApplet {

    public void init() {
    }

public void paint(Graphics g){
super.paint(g);
Polygon p=new Polygon();
int x=0; int y=100; int işaret=1;
for(int i=0; i<15;i++){
p.addPoint(x, y);
x=x+20;
y=y+20*işaret;
işaret=işaret*(-1);
g.drawPolyline(p.xpoints, p.ypoints,p.npoints);
}

}
}
