
import java.awt.Graphics;
import javax.swing.JApplet;

public class İÇİÇEoval extends JApplet {

    public void init() {
       
    }
public void paint(Graphics g){

super.paint(g);
int say=1;
while(say<=10){

g.drawOval(210-say*10,100-say*10 ,say*20, say*20);
 
say++;
}


}
}
