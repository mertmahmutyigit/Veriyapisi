
import java.awt.Graphics;
import javax.swing.JApplet;
public class TOP extends JApplet implements Runnable{
int y;
    
    
    
    public void init() {
Thread k=new Thread(this); k.start();    }

    @Override
    public void run() {
while(true){
    try {
        Thread.sleep(100);
        y=y+5;
        if(y+40>getHeight())return;
        repaint();
        
        
    } catch (Exception e) {
    }
}}
@Override
public void paint(Graphics g){

super.paint(g);
g.fillOval(200, y, 40, 40);

}


    

}
