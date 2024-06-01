
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class KAREovalÇİZGİ extends JApplet {
int c;
public void init(){
String input;
input=JOptionPane.showInputDialog("1 sayısı kare " + "2 sayısı oval "+ "3 sayısı çizgi");
c=Integer.parseInt(input);



}
public void paint(Graphics g){

super.paint(g);
    for (int i = 0; i < 10; i++) {
     switch(c)  {
         case 1:
             g.drawRect(10+i*10, 10+i*10,50+i*10, 50+i*10);
         break;
         case 2:
             g.drawOval(10+i*10, 50+i*10, 50+i*10, 50+i*10);
          break;
         case 3:
        g.drawLine(10, 10, 250, 10+i*10);
        break;
        default:
        
        
     
     } 
    }
}
}
