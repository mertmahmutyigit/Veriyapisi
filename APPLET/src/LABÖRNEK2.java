
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;

public class LABÖRNEK2 extends JApplet {
Font f=new Font("",Font.ITALIC,50);
    public void init() {
    }
public void paint(Graphics g){
setFont(f);
g.drawLine(10,20, 100, 20);//cizgi
g.drawOval(10, 10, 30, 30);//çizgioval
g.drawRect(50,50,100, 100);//cizgi kare
g.fill3DRect(150, 150, 200, 200, rootPaneCheckingEnabled);
g.setColor(Color.red);
g.fillOval(250, 250, 350, 350);//içi dolu oval
}
}
