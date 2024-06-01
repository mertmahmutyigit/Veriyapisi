
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class dünya extends JApplet {

    public void init() {
   
    
     setBackground(Color.red);
    }
    public void paint(Graphics g){
    
    super.paint(g);
       
        g.drawString("merhaba", 50, 50);
    }

}
