import java.awt.Graphics;
import javax.swing.JApplet;

public class labörnek5 extends JApplet implements Runnable{
 public String yazı="aplet";
private int y=100;

    public void init() {
        Thread k=new Thread();
        k.start();
    }

    public void run() {
      
      try {
            while(true) {
                if(yazı.equals(""))
                
                 yazı="aplet";
               
                else yazı="";
                repaint();
                Thread.sleep(200);
            }
        } catch (Exception e) {}
        
        
    }
public void paint(Graphics g){
super.paint(g);g.drawRect(50, 90,100, 250);
g.drawString(yazı,150, y);

}
}
