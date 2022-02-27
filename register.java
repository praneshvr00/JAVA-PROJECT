import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.event.*;


public class register implements ActionListener{
	JLabel fnameLabel,nameLabel,emailLabel,phoneLabel,passwordLabel,otpLabel,titleLabel,l1,bg,confirmpasslabel;
	JTextField fnameText,nameText,emailText,phoneText,passwordText,otpText,confirmpasstext;
	JButton addButton0,addButton,addbutton1,b1;
	Integer count=0;
    JFrame frame = new JFrame("ONLINE FOOD ORDER APP REGISTER");
	public register(){
		
		/*
		frame.setLayout(new BorderLayout());


		ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\registerbg1.jpg");
		JLabel bg = new JLabel(icon1);

		
		bg.setBounds(10, 10, 1600, 730);


		frame.setLayout(new FlowLayout());

		*/
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\registerbg1.jpg").getImage().getScaledInstance(1520, 900, Image.SCALE_DEFAULT));
        JLabel bg = new JLabel(imageIcon);
        bg.setBounds(0, 0, 1530, 870);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		titleLabel = new JLabel("<html><p 'style=color:white;'>REGISTER :</p></html>",JLabel.CENTER);
		titleLabel.setBounds(530, 50, 400, 50);
		titleLabel.setFont(new Font("Font.BOLD", 1, 30));

        fnameLabel = new JLabel("<html><p 'style=color:white;'>FULL-NAME :</p></html>");
		fnameLabel.setBounds(550, 175, 140, 25);
		fnameLabel.setFont(new Font("", 5, 20));
		fnameText = new JTextField(20);
		fnameText.setBounds(700, 175, 200, 25);
		
		nameLabel = new JLabel("<html><p 'style=color:white;'>USERNAME :</p></html>");
		nameLabel.setBounds(550, 230, 140, 25);
		nameLabel.setFont(new Font("", 5, 20));
		nameText = new JTextField(20);
		nameText.setBounds(700, 230, 200, 25);

        emailLabel = new JLabel("<html><p 'style=color:white;'>E-MAIL    :</p></html>");
		emailLabel.setBounds(550, 285, 140, 25);
		emailLabel.setFont(new Font("", 5, 20));
		emailText = new JTextField(20);
		emailText.setBounds(700,  285, 200, 25);

        phoneLabel = new JLabel("<html><p 'style=color:white;'>PHONE-NO :</p></html>");
		phoneLabel.setBounds(550, 340, 140, 25);
		phoneLabel.setFont(new Font("", 5, 20));
		phoneText = new JTextField(20);
		phoneText.setBounds(700, 340, 200, 25);
	   
		passwordLabel = new JLabel("<html><p 'style=color:white;'>PASSWORD :</p></html>");
		passwordLabel.setBounds(550, 395, 140, 25);
		passwordLabel.setFont(new Font("", 5, 20));
		passwordText = new JPasswordField(30);
		passwordText.setBounds(700, 395, 200, 25);

		confirmpasslabel = new JLabel("<html><p 'style=color:white;'>RE-TYPE :</p></html>");
		confirmpasslabel.setBounds(550, 450, 140, 25);
        confirmpasslabel.setFont(new Font("",5,20));
        confirmpasstext = new JPasswordField(30);
		confirmpasstext.setBounds(700, 450, 200, 25);

		JLabel errormssg = new JLabel("<html><p 'style=color:red;'>password does not match!!</p></html>");
		errormssg.setBounds(700, 476, 200, 25);
        errormssg.setFont(new Font("",5,15));
		

        otpLabel = new JLabel("<html><p 'style=color:white;'>ENTER-OTP :</p></html> :");
		otpLabel.setBounds(550, 500, 140, 25);
		otpLabel.setFont(new Font("", 5, 20));
		otpText = new JTextField(20);
		otpText.setBounds(700, 500, 200, 25);

        addButton0 = new JButton("Get-OTP");
		addButton0.setBounds(575, 620, 120, 30);
		
		addButton = new JButton("Register");
		addButton.setBounds(700, 620, 120, 30);
	
		addButton.addActionListener(this);
       addbutton1 = new JButton("<---Login");
       addbutton1.setBounds(825,620,190,30); 
	  
	  
	   frame.add(titleLabel);
       frame.add(fnameLabel);
	   frame.add(nameLabel);
       frame.add(emailLabel);
       frame.add(phoneLabel);
       frame.add(fnameText);
	   frame.add(nameText);
       frame.add(emailText);
       frame.add(phoneText);
	   frame.add(passwordLabel);
	   frame.add(confirmpasslabel);
	   frame.add(confirmpasstext);
       frame.add(otpLabel);
	   frame.add(passwordText);
       frame.add(otpText);
       frame.add(addButton0);
	   frame.add(addButton);
	   frame.add(addbutton1);
	   frame.add(errormssg);
	   errormssg.setVisible(false);
       addbutton1.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e){

		
		new assignment();
		frame.dispose();

	}
});
confirmpasstext.getDocument().addDocumentListener(new DocumentListener() {
	public void changedUpdate(DocumentEvent e) {
	  warn();
	}
	public void removeUpdate(DocumentEvent e) {
	  warn();
	}
	public void insertUpdate(DocumentEvent e) {
	  warn();
	}
  
	public void warn() 
	{
		String p1,p2;
	
      p1=passwordText.getText();
	  p2=confirmpasstext.getText();
	   if (p1.equals(p2))
	   {
		errormssg.setVisible(false);
		count++;
	   }
	   else
	   {
        errormssg.setVisible(true);

	   }
	
	}
  });

	
		frame.add(bg);
		frame.setSize(1650,1080);
        frame.setLayout(null);
        frame.setVisible(true);

	}

	


	
	
	public static void main(String[] args) {
		new register();
		

	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==addButton){
			
			if(nameText.getText().length() ==0 && passwordText.getText().length()==0)
			{
				JOptionPane.showInternalMessageDialog(null,"ENTER LOGIN DETAILS TO REGISTER NEW ACCOUNT");
			}
			 if(nameText.getText().length() !=0 && passwordText.getText().length()==0){

				JOptionPane.showInternalMessageDialog(null,"PASSWORD CANNOT BE EMPTY!");
			}
             if(fnameText.getText().length() ==0 && passwordText.getText().length()!=0){

				JOptionPane.showInternalMessageDialog(null,"FULLNAME CANNOT BE EMPTY!");
			}
			 if(nameText.getText().length() ==0 && passwordText.getText().length()!=0){

				JOptionPane.showInternalMessageDialog(null,"USERNAME CANNOT BE EMPTY!");
			}
             if(emailText.getText().length() ==0 && passwordText.getText().length()!=0){

				JOptionPane.showInternalMessageDialog(null,"EMAIL CANNOT BE EMPTY!");
			} if(phoneText.getText().length() ==0 && passwordText.getText().length()!=0){

				JOptionPane.showInternalMessageDialog(null,"PHONE-NUMBER CANNOT BE EMPTY!");
			}
			if(count<1){
				JOptionPane.showInternalMessageDialog(null,"RETYPED PASSWORD DOES NOT MATCH!");

			}
			else{


			
			
			 if(nameText.getText().length() !=0 && passwordText.getText().length()!=0)
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
	
					st1.executeUpdate("INSERT INTO logininfo values('"+fnameText.getText()+"','"+nameText.getText()+"','"+emailText.getText()+"','"+phoneText.getText()+"','"+passwordText.getText()+"')");
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

}
