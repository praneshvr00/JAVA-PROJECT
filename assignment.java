import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



import java.awt.*;
import java.sql.*;

public class assignment implements ActionListener{
	JLabel nameLabel, passwordLabel,titleLabel,titleLabel1,l1,bg;
	JTextField nameText, passwordText;
	JButton addButton,addbutton1,admin,b1;
	
    JFrame frame = new JFrame("FOOD ORDER LOGIN");
	public assignment(){
		/*
		frame.setLayout(new BorderLayout());
		ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\foodlogin.jpg");
		JLabel bg = new JLabel(icon1);
		bg.setSize(1000,1000);
		bg.setBounds(0, 0, 1550, 900);   
		frame.setLayout(new FlowLayout());
	   */
	  ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\foodlogin.jpg").getImage().getScaledInstance(1520, 900, Image.SCALE_DEFAULT));
        JLabel bg = new JLabel(imageIcon);
        bg.setBounds(0, 0, 1530, 870);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		titleLabel = new JLabel("LOGIN",JLabel.CENTER);
		titleLabel.setBounds(530, 300, 400, 50);
		titleLabel.setFont(new Font("Font.BOLD", 1, 30));
		
		nameLabel = new JLabel("USERNAME :");
		nameLabel.setBounds(550, 400, 140, 25);
		nameLabel.setFont(new Font("", 5, 20));
		nameText = new JTextField(20);
		nameText.setBounds(700, 400, 200, 25);
	   
		passwordLabel = new JLabel("PASSWORD :");
		passwordLabel.setBounds(550, 460, 140, 25);
		passwordLabel.setFont(new Font("", 5, 20));
		passwordText = new JPasswordField(30);
		passwordText.setBounds(700, 460, 200, 25);

		titleLabel1 = new JLabel("If you are new user, please register first",JLabel.CENTER);
		titleLabel1.setBounds(450, 500, 600, 50);
		titleLabel1.setFont(new Font("Font.ITALICS", 1, 30));
		
		addButton = new JButton("Register");
		addButton.setBounds(600, 580, 120, 30);
	
		addButton.addActionListener(this);
       addbutton1 = new JButton("Login");
       addbutton1.setBounds(725,580,120,30); 
	  
		
       admin = new JButton("ADMIN");
       admin.setBounds(1150,120,120,30);
	  
	   frame.add(titleLabel);
	   frame.add(nameLabel);
	   frame.add(nameText);
	   frame.add(passwordLabel);
	   frame.add(passwordText);
	   frame.add(titleLabel1);
	   frame.add(addButton);
	   frame.add(addbutton1);
	   frame.add(admin);
	  
admin.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e){

		
		new admin();
		frame.dispose();

	}
});

addButton.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e){

		
		new register();
		frame.dispose();

	}
});
	
		addbutton1.addActionListener(new ActionListener()
        {
           

            public void actionPerformed(ActionEvent e)
            {
				try{

			
				String sname=nameText.getText();
                String spass=passwordText.getText();
				
				Connection cond = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","praneshroot");
				PreparedStatement st = (PreparedStatement) cond.prepareStatement("Select username, password from logininfo where username=? and password=?");

			st.setString(1, sname);
			st.setString(2, spass);
			ResultSet rs = st.executeQuery();
			if (rs.next())
			 {
				frame.dispose();
			    new Billing();
				
				JOptionPane.showMessageDialog(addbutton1, "You have successfully logged in");
			} else
			 {
				JOptionPane.showMessageDialog(addbutton1, "<html>Wrong Username & Password<br><br><center><p style='color:red';>if you are new, Register Yourself!</p></center><html>");
			}

		}
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
			}
		});
		
		
		
		frame.add(bg);
		frame.setSize(1650,1080);
        frame.setLayout(null);
        frame.setVisible(true);

	}

	


	
	
	public static void main(String[] args) {
		new assignment();
		

	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==addButton){
			
			if(nameText.getText().length() ==0 && passwordText.getText().length()==0)
			{
				JOptionPane.showInternalMessageDialog(null,"ENTER LOGIN DETAILS TO PROCEED");
			}
			else if(nameText.getText().length() !=0 && passwordText.getText().length()==0){

				JOptionPane.showInternalMessageDialog(null,"PASSWORD CANNOT BE EMPTY!");
			}
			else if(nameText.getText().length() ==0 && passwordText.getText().length()!=0){

				JOptionPane.showInternalMessageDialog(null,"USERNAME CANNOT BE EMPTY!");
			}
			else if(nameText.getText().length() !=0 && passwordText.getText().length()!=0)
			{

		
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","praneshroot");
				
	
				PreparedStatement st1 = (PreparedStatement) con.prepareStatement("select username from logininfo where username=?");
				st1.setString(1, nameText.getText());
                ResultSet rs = st1.executeQuery();
				
					
                  if(rs.next())
				  {
 
					String user = rs.getString("username");
                    
					if(user.equals(nameText.getText()))
					{
						JOptionPane.showMessageDialog(nameText,"USERNAME ALREADY EXISTS! PLEASE CHOOSE DIFFERENT" );
					}
				  }
				  else{

					Statement stmt = con.createStatement();
	
					st1.executeUpdate("INSERT INTO logininfo values('"+nameText.getText()+"','"+passwordText.getText()+"')");
					frame.dispose();
					assignment assignment =  new assignment();
					JOptionPane.showMessageDialog(null,"<html>THANKYOU FOR REGISTERING!<br><br><center>USE IT TO LOGIN!</center</html>");
					st1.close();
					con.close();
				  }
				  }
					
					
					
				
				 catch (Exception e) {
					 System.out.println(e);
					
				}	
			
		}
		
	}
		
	}

}