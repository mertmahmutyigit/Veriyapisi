package appletgece;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class uyg7  extends JPanel{
     public void paint(Graphics g){
         int renk=-1;
         for (int i = 0; i <400; i+=50) {
             for (int j = 0; j <400; j+=50) {
                 if(renk>0)
                     g.setColor(Color.white);
                 else g.setColor(Color.black);
                 g.fillRect(i, j, 50, 50);
                 renk=renk*(-1);}
             renk=renk*(-1);}
        
    }
    public static void main(String[] args) {
        uyg7 u7=new uyg7();
        JFrame f=new JFrame();
        f.add(u7);f.setSize(420,420);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }
}
