package appletgece;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppletGece2 extends JPanel implements Runnable{
int x,y,w,h;
    public AppletGece2() {
   x=180;y=180;w=20;h=20;
    Thread k=new Thread(this);k.start();
    }

    @Override
    public void run() {
      
        while (true) {   
            try {       
                Thread.sleep(500);
                x=x-20;
                y=y-20;
                w=w+40;
                h=h+40;
                if(x==0) return;
                repaint();
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(AppletGece2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
          
    }
public void paint(Graphics g){
g.drawOval(x, y,w,h);

}
    public static void main(String[] args) {
        AppletGece2 a=new AppletGece2();
        JFrame j=new JFrame();
        j.add(a);
        j.setVisible(true);
        j.setSize(400,400);
    }
}




