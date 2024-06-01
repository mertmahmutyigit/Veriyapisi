

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class NewJApplet extends JApplet {
double sum;
  
    public void init() {
    String firstNumber, secondNumber;
double number1, number2;
    
 firstNumber = JOptionPane.showInputDialog("enter");
    
    secondNumber = JOptionPane.showInputDialog("Enter second ");//bir panel aç ve bu panele string gir
    number1 = Double.parseDouble( firstNumber );
number2 = Double.parseDouble( secondNumber );
sum = number1 + number2;
    }
public void paint( Graphics g ){
// draw the results with g.drawString
g.drawRect( 15, 10, 270, 20 );
g.drawString( "The sum is " + sum, 25, 25 );
} //end of paint
} //end of AdditionApplet class
