package appletgece;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class uyg3  extends JPanel{
    public void paint(Graphics g){
       g.setColor(Color.BLACK);
       Polygon p=new Polygon();
       g.drawLine(50, 200, 300, 200);
       g.drawLine(50, 10, 50, 300);
        for (int i = 0; i < 10; i++) {
            p.addPoint(50+i*10, 200-4*i*i);
            
        }
        g.drawPolyline(p.xpoints, p.ypoints, 10);
    }
    public static void main(String[] args) {
        uyg3 u3=new uyg3();
        JFrame f=new JFrame();
        f.add(u3);f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }
    
}
