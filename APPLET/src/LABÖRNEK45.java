import com.sun.prism.Graphics;
import com.sun.prism.paint.Color;
import javax.swing.JApplet;

public class LABÖRNEK45 extends JApplet implements Runnable{
    
 int []dizi=new int[30];
    public void init() {
       
    Thread k=new Thread();k.start();
        for (int i = 0; i <dizi.length; i++) {
            dizi[i]=(int)(Math.random()*200);
        }
  
    }
public void run(){

    for (int i = 0; i <dizi.length; i++) {
        for (int j = 0; j <dizi.length; j++) {
            if(dizi[j]<dizi[i]){
            int ara=dizi[i];
            dizi[i]=dizi[j];
            dizi[j]=ara;
            
            }
        }
        repaint();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }



}

public void paint(Graphics g){
int y=10;
for(int i=0;i<dizi.length;i++){
g.drawLine(0, y, dizi[i], y);
y+=10;
}
}
}
