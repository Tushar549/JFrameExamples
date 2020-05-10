
package basicawtconcepts;

/**
 *
 * @author tushar
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

class CreatingFrame extends JFrame implements ActionListener
{
    JButton subButton,addButton;
    JLabel num1Label,num2Label,resultLabel;
    JTextField num1,num2,result;
    void showUI()
    {
       super.setBounds(150,90,300,400);
       super.setResizable(false);
       
        
        num1Label=new JLabel("Enter Num1: ");
        num1Label.setBounds(10,10,80,30);
        super.add(num1Label);
        
        num1=new JTextField();
        num1.setBounds(90,10,50,30);
        super.add(num1);
        
        num2Label=new JLabel("Enter Num2: ");
        num2Label.setBounds(10,50,80,30);
        super.add(num2Label);
        
        num2=new JTextField();
        num2.setBounds(90,50,50,30);
        super.add(num2);
        
        resultLabel=new JLabel("Result: ");
        resultLabel.setBounds(10,90,80,30);
        super.add(resultLabel);
        
        result=new JTextField();
        result.setBounds(90,90,50,30);
        result.setEditable(false);
        super.add(result);
        
        addButton= new JButton("Add");
        addButton.setBounds(10,140,70,20);
        addButton.addActionListener(this);
        super.add(addButton);
        
        subButton=new JButton("Sub");
        subButton.setBounds(90,140,70,20);
        subButton.addActionListener(this);
        super.add(subButton);
        
        super.setLayout(null);
        super.setDefaultCloseOperation(3);
        super.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        double value1,value2;
        if(e.getSource()==addButton)
        {
          value1=Integer.valueOf(num1.getText());
          value2=Integer.valueOf(num2.getText());
          result.setText(String.valueOf(value1+value2));
          
        }
        if(e.getSource()==subButton)
        {
            value1=Integer.valueOf(num1.getText());
            value2=Integer.valueOf(num2.getText());
            result.setText(String.valueOf(value1-value2));
        
        }
        
    }
    
}

public class AdditionSubtractionProgram 
{
    public static void main(String[] args) {
        CreatingFrame cf=new CreatingFrame();
        cf.showUI();
    }
}
