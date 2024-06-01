
import java.awt.Graphics;
import javax.swing.JApplet;
public class merdiven extends JApplet {

public void paint(Graphics g){

    super.paint(g);
    int say=1;
    while(say<=10){
    
    g.drawLine(20,20,250, say*10);
        ++say;
        
    }

}
}
