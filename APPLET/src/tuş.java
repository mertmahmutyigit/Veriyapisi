 
import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import sun.net.www.content.audio.x_aiff;


public class tuş extends Canvas implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
   tuş=e.getKeyCode();
   if(tuş==KeyEvent.VK_RIGHT) x=x+5;
     if(tuş==KeyEvent.VK_UP)y=y-5;
     if(tuş==KeyEvent.VK_DOWN)y=y+5;
    if(tuş==KeyEvent.VK_LEFT)x=x-5;
    
    repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }int x=0,y=0,tuş;
    public tuş(){
    
        addKeyListener(this);
    }
    
    
    public void pain(Graphics g){
   g.fillRect(x, WIDTH, WIDTH, HEIGHT);
    
   
    }
    public static void main(String[] args) {
        TUŞileHAREKETettirme t=new TUŞileHAREKETettirme();
        JFrame f=new JFrame();
        f.add(t);
        f.setVisible(true);
                
    }
}













