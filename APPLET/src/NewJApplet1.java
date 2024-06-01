

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;


public class NewJApplet1 extends JApplet implements  MouseMotionListener{
int x,y,endx,endy; boolean res;
  
    public void init() {
        addMouseMotionListener(this);

    }

    @Override
    public void mouseDragged(MouseEvent e) {endx=e.getX();endy=e.getY();
repaint();
}

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }









   public void mouseClicked(MouseEvent e){
   
    x=e.getX();
  y=e.getY();
   }

public void mouseRelesed(MouseEvent e){


}
    
public void paint(Graphics g){
  super.paint(g);  
   
    
  g.drawString("puan", 300, 400);
   
  Polygon o=new Polygon();
 g.drawOval(50, 50,20, 20);
 g.drawString("A", 55,63 );
 g.drawOval(100,100,20,20);
 g.drawString("b",108 ,115);
 
g.drawLine(x, y, endx,endy);

}



}