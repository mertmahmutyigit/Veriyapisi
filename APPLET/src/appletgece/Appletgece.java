package appletgece;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Appletgece  extends JPanel 
        implements Runnable{
    int x=180,y=180,w=20,h=20;
    public Appletgece() {
        new Thread(Appletgece.this).start();
    }
    public void paint(Graphics g){
       g.drawOval(x, y, w, h);
    }
    public static void main(String[] args) {
        Appletgece a=new Appletgece();
        JFrame f=new JFrame();
        f.add(a);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
     while(true){
        try {
                Thread.sleep(200);               
                x=x-20;
                y=y-20;
                w=w+40;
                h=h+40;
                if (x<0) return;
                repaint();
            } catch (Exception e) {
            }
     }
    }
    
}
