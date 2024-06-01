
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;

public class renk extends JApplet {
    Font f=new Font("SACXZC ", Font.ITALIC, 20);
    public void paint(Graphics g){
   
    super.paint(g);  setSize(500,500);
        setBackground(Color.red);
       g.setFont(f);
       g.setColor(Color.blue);
       g.drawString("mert mahmut yiğit", 200,250);
     //  g.fillRect(WIDTH, WIDTH, WIDTH, HEIGHT); içidolu kare
    
    }
    
    
}
