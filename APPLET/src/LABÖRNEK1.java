//İKİ SAYI AL KARE İÇİNE YAZDIR TOPLAMINI
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class LABÖRNEK1 extends JApplet {
double toplam;
Font f=new Font("ea",Font.ITALIC, 20);
    public void init() {
        String x=JOptionPane.showInputDialog("sayı gir");
        String y=JOptionPane.showInputDialog("sayı gir");
        double x1=Double.parseDouble(x);
        double y1=Double.parseDouble(y);
        toplam=x1+y1;
    }
public void paint(Graphics g){
super.paint(g);
setBackground(Color.ORANGE);
g.drawRect(40, 100, 150, 100);
g.setColor(Color.red);g.setFont(f);//yazı boyutu

g.drawString("toplam = "+toplam,50, 120);

}
}
