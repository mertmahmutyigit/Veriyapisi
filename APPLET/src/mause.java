
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;

public abstract class mause extends JApplet implements MouseMotionListener{
int x,y;
boolean basılımı;
    public void init() {
        addMouseMotionListener(this);
        x=0;y=0;basılımı=false;
    }
    
    public void mauseDraqqed(MouseEvent me){
    
    basılımı=true;
    x=me.getX()-40;
    y=me.getY()-40;
    repaint();
    
    }
    public void mauseMoved(MouseEvent me){
    basılımı=false;
      x=me.getX()-40;
    y=me.getY()-40;
    repaint();
    
    }
    
   public void paint(Graphics g){
       super.paint(g);
   if(basılımı)
   {g.setColor(Color.red);}
   else 
   { g.setColor(Color.blue);}
       g.fillOval(x, y, 40, 40);
   } 

    
    
    
}
