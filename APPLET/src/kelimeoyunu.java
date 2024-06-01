
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class kelimeoyunu extends JApplet implements MouseMotionListener  {
    int endx,endy;
    private int x,y;
    int a;
    boolean res;
    public void init() {
        addMouseMotionListener(this);
        a=5;setSize(500, 500);
        
    }

    
    

   public void mouseClicked(MouseEvent e){
   
   if((e.getX()>=500&& e.getX()<=575)&&(e.getY()>=5 && e.getY()<=40)){
   
   res=true;
   
   }
   
   
   }
   public void mousePressed(MouseEvent e){
   
    x=e.getX();
  y=e.getY();
   }

public void mouseRelesed(MouseEvent e){

endx=e.getX();endy=e.getY();
repaint();
}
    
public void paint(Graphics g){
  super.paint(g);  
   
    
  g.drawString("puan"+a, 300, 400);
   
  Polygon o=new Polygon();
 g.drawOval(50, 50,20, 20);
 g.drawString("A", 55,63 );
 g.drawOval(100,100,20,20);
 g.drawString("b",108 ,115);
 
g.drawLine(x, y, endx,endy);

}

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}






