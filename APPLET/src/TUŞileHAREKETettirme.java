
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JApplet;

public class TUŞileHAREKETettirme extends JApplet implements KeyListener{
int x=0,y=0; int en=30,boy=20;
int penx,peny;
int c;
@Override
    public void init(){
    penx=getSize().width;
    peny=getSize().height;
    
        addKeyListener(this);
        
    
    }
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
   c=e.getKeyCode();
    if(c==KeyEvent.VK_RIGHT) x=x+5;
     if(c==KeyEvent.VK_UP)y=y-5;
     if(c==KeyEvent.VK_DOWN)y=y+5;
    if(c==KeyEvent.VK_LEFT)x=x-5;
   
          
 
   repaint();
    
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
public void paint(Graphics g){
super.paint(g);
g.setColor(Color.red);
g.fill3DRect(x, y, en, boy, true);
}
}