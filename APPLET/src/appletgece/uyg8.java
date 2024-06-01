package appletgece;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class uyg8 extends JPanel{
    private Polygon p;
    String S;
    public uyg8(String S){
        this.S=S;
        p=new Polygon();
    }
    double f(double x){
        if(S.equals("sin"))
            return 20*Math.sin((x/180)*Math.PI*8);
        else if(S.equals("cos")) 
            return 20*Math.cos((x/180)*Math.PI*8);
        else if(S.equals("kare"))
            return 20*x*x;
        else 
            return 20*(Math.log(x));
        
    }
    void cizfonksiyon(){
        for (int i = -100; i < 100; i++) {
            p.addPoint(i+200, 200-(int)f(i));
        }
    }
    public void paint(Graphics g){
        cizfonksiyon();
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
    }
    
    public static void main(String[] args) {
         uyg8 u8=new uyg8("cos");
        JFrame f=new JFrame();
        f.add(u8);f.setSize(420,420);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }
    
}
