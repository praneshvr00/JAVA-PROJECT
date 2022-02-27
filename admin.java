
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import java.sql.*;




public class admin  {
    JLabel nameLabel, passwordLabel,titleLabel,l1,bg;
	JTextField nameText, passwordText;
	JButton addButton,addbutton1,admin,b1,back;
    JFrame frame = new JFrame("ADMIN PANEL");
    public  admin(){


      /* 
        frame.setLayout(new BorderLayout());


		ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\adminbg.jpg");
		JLabel bg = new JLabel(icon1);
		bg.setSize(1000,1000);
		bg.setBounds(0, 0, 1550, 900);
		

		
		
		
		
		frame.setLayout(new FlowLayout());
		
     */
	ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\adminbg.jpg").getImage().getScaledInstance(1520, 900, Image.SCALE_DEFAULT));
        JLabel bg = new JLabel(imageIcon);
        bg.setBounds(0, 0, 1530, 870);
	
	


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JLabel titleLabel = new JLabel("ADMIN LOGIN",JLabel.CENTER);
		titleLabel.setBounds(530, 300, 400, 50);
		titleLabel.setFont(new Font("Font.BOLD", 1, 30));
		
		JLabel nameLabel = new JLabel("USERNAME :");
		nameLabel.setBounds(550, 400, 140, 25);
		nameLabel.setFont(new Font("", 5, 20));
		JTextField nameText = new JTextField(20);
		nameText.setBounds(700, 400, 200, 25);
	   
		JLabel passwordLabel = new JLabel("PASSWORD :");
		passwordLabel.setBounds(550, 460, 140, 25);
		passwordLabel.setFont(new Font("", 5, 20));
		JTextField passwordText = new JPasswordField(30);
		passwordText.setBounds(700, 460, 200, 25);
		
		JButton addButton = new JButton("CHANGE PASS");
		addButton.setBounds(600, 580, 120, 30);
    
		
       JButton addbutton1 = new JButton("Login");
       addbutton1.setBounds(725,580,120,30); 
	   JButton back = new JButton("back--->");
       back.setBounds(1200,130,120,30); 
	  
     
      
	  
	   frame.add(titleLabel);
	   frame.add(nameLabel);
	   frame.add(nameText);
	   frame.add(passwordLabel);
	   frame.add(passwordText);
	   frame.add(addButton);
	   frame.add(addbutton1);
	   frame.add(back);
	  

         back.addActionListener(new ActionListener()
	       {
		      public void actionPerformed(ActionEvent e){
				  new assignment();
				  frame.dispose();
			  }

	       }
        );
       
		addbutton1.addActionListener(new ActionListener()
        {
           

            public void actionPerformed(ActionEvent e)
            {
				try{

			
				String sname=nameText.getText();
                String spass=passwordText.getText();
				
				Connection cond = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","praneshroot");
				PreparedStatement st = (PreparedStatement) cond.prepareStatement("Select adminname,adminpass from admininfo where adminname=? and adminpass=?");

			st.setString(1, sname);
			st.setString(2, spass);
			ResultSet rs = st.executeQuery();
			if (rs.next())
			 {
				frame.dispose();
			    new admincontent();
				
				JOptionPane.showMessageDialog(addbutton1, "You have successfully logged in");
			}
             else
			 {
				JOptionPane.showMessageDialog(addbutton1, "<html>Wrong Username & Password<br><br><center><p style='color:red';>if you are new admin, Register Yourself!</p></center><html>");
			}

		}
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
			}
		});
		
		
        addButton.addActionListener(new ActionListener()
        {
           
    
            public void actionPerformed(ActionEvent e1)
        {
            try{

			
				String sname=nameText.getText();
                String spass=passwordText.getText();
				
				Connection cond = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","praneshroot");
				PreparedStatement st = (PreparedStatement) cond.prepareStatement("Select adminpass from admininfo where adminname=? ");

			st.setString(1, sname);
			
			ResultSet rs = st.executeQuery();   
            String oldpass = JOptionPane.showInputDialog(null, "ENTER YOUR OLD PASSWORD");
             if(rs.next())
             {
                String oldpassret = rs.getString("adminpass");
                if(oldpassret.equals(oldpass))
                {

                    String newpass= JOptionPane.showInputDialog(null,"ENTER YOUR NEW PASS" );

                    
					Statement st1 = cond.createStatement();
	
					st1.executeUpdate(" Update admininfo SET adminpass = '"+newpass+"' Where adminname='"+nameText.getText()+"' ");
                    st1.close(); 
                }
                else{
                    JOptionPane.showMessageDialog(null, "YOUR PASSWORD IS WRONG!");
                }

             }
             else{
                JOptionPane.showMessageDialog(null, "YOUR USERNAME DOESNOT EXIST!");
 
             }  
             st.close();
             
             cond.close();
            }
            catch (Exception e2){
                System.out.println(e2);
            }

        }
        });


        
        
        frame.setBackground(Color.RED);
        frame.setLayout(null);
        frame.add(bg);
        frame.setSize(1650,1080);
        frame.setVisible(true);
       

    }
    public static void main(String[] args){
        new admin();
    }

   

	
}
