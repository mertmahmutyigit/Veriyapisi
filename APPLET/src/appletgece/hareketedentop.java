
package appletgece;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;


public class hareketedentop extends JApplet implements Runnable{
int a,b,is;
    public void init() {
 Thread t=new Thread(this);
 t.start();
 a=0;b=200;is=-1;
    }

   

    @Override
    public void run() {
        for(int i=0;i<400;i++){
            try {a=a+1;b=b+is;
           if(b==150){is=is*(-1);}
           if(b==200){is=-1;}     Thread.sleep(100);
                repaint();
                
                
                
            } catch (InterruptedException ex) {
            }
        
        
        }
    }
    @Override
    
    
        public void paint(Graphics g){
         super.paint(g);
            g.setColor(Color.red);
       Polygon p=new Polygon();
       g.drawLine(0, 200, 400, 200);
       int x=0,y=200,isaret=-1;
        for (int i = 0; i < 9; i++) {
            p.addPoint(x, y);
            x=x+50;
            y=y+isaret*50;
            isaret=isaret*(-1);
        }
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
        g.fillOval(a,b, 10, 10);
    }
    
    
    }
