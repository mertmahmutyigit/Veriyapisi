
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class adsoyad extends JApplet {
    Font f= new Font("red",Font.ITALIC,30);

    String a,s;
    public void init(){
        setSize(500,500);
    a=JOptionPane.showInputDialog("ad");
    s=JOptionPane.showInputDialog("SOYADINIZ");
    }
    public void paint(Graphics g){
    super.paint(g);
    
    setBackground(Color.cyan);
    g.setFont(f);
    g.setColor(Color.red);
 

    g.drawString("ADINIZ = " + a,25,25);
     g.drawString("SOYADINIZ = "+s, 25,50);

}



}
