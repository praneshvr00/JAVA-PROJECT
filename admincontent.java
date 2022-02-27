import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import java.sql.*;


public class admincontent  {
    JLabel bg;
	JTextField n;
	JButton back;
    JFrame frame = new JFrame("ADMIN");
    public  admincontent(){


       
       
		/* frame.setLayout(new BorderLayout());

        ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\adminbg.jpg");

		JLabel bg = new JLabel(icon1);
		
		bg.setBounds(1, 1, 1550, 900);
      
		
		
		frame.setLayout(new FlowLayout());
        */
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\adminbg.jpg").getImage().getScaledInstance(1520, 900, Image.SCALE_DEFAULT));
        JLabel bg = new JLabel(imageIcon);
        bg.setBounds(0, 0, 1530, 870);
		
 
	
	


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

   
    
        Container c = frame.getContentPane();
        c.setBackground(Color.black); 
        frame.setLayout(null);
        frame.add(bg);
        frame.setSize(1650,1080);
        frame.setVisible(true);
       

    }
    public static void main(String[] args){
        new admincontent();
    }

   

	
}
