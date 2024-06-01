import java.awt.Graphics;
import javax.swing.*;
public class test3 extends JPanel {
  //hocanın fan yapımı
  private int angle1=-15;
  private int angle2=75;
  private int angle3=165;
  private int angle4=255;

  public static void main(String[] args) {
    JFrame f = new JFrame();
    test3 n = new test3();
    f.setSize(400,400);
    f.add(n);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

  public test3(){
    (new Thread(new ileri())).start();
  }
  
  public void paint(Graphics g){
    super.paint(g);
    g.drawOval(200,150,150,150);
    g.fillArc(210, 160, 130, 130, angle1, 30);
    g.fillArc(210, 160, 130, 130, angle2, 30);
    g.fillArc(210, 160, 130, 130, angle3, 30);
    g.fillArc(210, 160, 130, 130, angle4, 30);
  }


  class ileri implements Runnable{

    @Override
    public void run() {
      
      try{
        while(true){
          angle1= (angle1-1)%360;
          angle2= (angle2-1)%360;
          angle3= (angle3-1)%360;
          angle4= (angle4-1)%360;
          repaint();
          Thread.sleep(50);
        }
  
      }catch(Exception e){}
    }
    
  }
  

}