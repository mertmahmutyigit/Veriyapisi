 
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;

public class SEKENTOP extends JApplet implements Runnable{
int y;
    public void run(){
        while (true) {   try {
            Thread.sleep(50);
            y=y+5;
            if(y+20>getHeight()){
                while (true) { 
                    Thread.sleep(50);
                    y=y-5;
                    if(y+20<(getHeight()/2)){
                        while (true) {
                        Thread.sleep(50);
                            y=y+5;
                            if(y+20>getHeight()) {return;}
                            repaint();
                        }
}
                    repaint();
                }
            
            
            }
            repaint();
        
        } catch (InterruptedException ex) {
                Logger.getLogger(SEKENTOP.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        


}
    public void init() {
    y=0;
    Thread k=new Thread(this);
    k.start();
    }
public void paint(Graphics g){
super.paint(g);
g.setColor(Color.red);
g.fillOval(getWidth()/2, y,20,20);

}
}
