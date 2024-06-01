package vizehazırlık;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class forkod  extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton k;

    public forkod() {
        
        setLayout(new GridLayout(3,3,10,10));
        l1=new JLabel("1.sayı");
        l2=new JLabel("2. sayı");
        t1=new JTextField("1. sayıyı gir");
        t2=new JTextField("2.sayıyı gir");
        k=new JButton("topla");
        l3=new JLabel("sonuç");
        add(l1); add(t1);add(l2);add(t2);add(k);add(l3);
        
    }

        
    public void ActionPerformed(java.awt.event.ActionEvent e){
        k.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });int s1=Integer.parseInt(t1.getText());
     int s2=Integer.parseInt(t2.getText());
     int top=s1+s2;
     l3.setText("sonuç" + top);
    
 }

    public static void main(String[] args) {
        
    forkod k=new forkod();
    k.setVisible(true);
    
    }
}

   