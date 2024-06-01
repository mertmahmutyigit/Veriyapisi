
import java.awt.Graphics;
import javax.swing.JApplet;

public class oval extends JApplet {

    
public void paint(Graphics g){
   super.paint(g);setSize(500, 500);
int say=1;
while(say<=110){
g.drawOval( 110-say*10,110-say*10, say*20, say*20);

++say;
}

}

}
