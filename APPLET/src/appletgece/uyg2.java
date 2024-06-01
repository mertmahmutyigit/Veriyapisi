package appletgece;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class uyg2 extends JPanel {
       public void paint(Graphics g){
       g.setColor(Color.red);
       Polygon p=new Polygon();
       g.drawLine(0, 200, 400, 200);
       int x=0,y=200,isaret=-1;
        for (int i = 0; i < 10; i++) {
            p.addPoint(x, y);
            x=x+50;
            y=y+isaret*50;
            isaret=isaret*(-1);
      g.drawPolyline(p.xpoints, p.ypoints, p.npoints); }
        
        
    }
    public static void main(String[] args) {
        uyg2 u1=new uyg2();
        JFrame f=new JFrame();
        f.add(u1);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }
}
