
package appletgece;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class uyg9 extends JPanel implements Runnable{
    int x,posx=0,posy=0;
            Font f=new Font(" ",Font.ITALIC,25);
    public uyg9(){
        x=1;
        (new Thread(uyg9.this)).start();
    }
    @Override
    public void run() {
     while(true){
         try {
          //   x=x*(-1);
             posy=posy+20;
             Thread.sleep(500);
             repaint();
         } catch (Exception e) {}
         x=x+1;
         if(x==10) return;
     }}
    public void paint(Graphics g){
        g.setFont(f);
            g.drawString("ilhan", posx, posy);
            g.drawString("AYDIN", posx+50, posy);
    }
    public static void main(String[] args) {
        uyg9 u9=new uyg9();
        JFrame f=new JFrame();
        f.add(u9);f.setSize(420,420);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }
    
}
