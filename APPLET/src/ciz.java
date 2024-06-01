
import java.awt.Graphics;
import java.time.Year;
import javax.swing.JApplet;
import sun.net.www.content.audio.x_aiff;
public class ciz extends JApplet implements Runnable{
int y,x;
    
    
    
    public void init() {
Thread k=new Thread(this); k.start();  x=0;y=200;   }
   
    @Override
    public void run() {
while(true){
    try {
        Thread.sleep(100);
        x=x+5;y=y-5;
        if(y==0)return;
        repaint();
        
        
    } catch (Exception e) {
    }
}}
@Override
public void paint(Graphics g){

super.paint(g);
g.drawLine(10,200,200,10);
g.fillOval(x, y, 10, 10);

}
}