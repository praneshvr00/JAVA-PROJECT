import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;    
import java.awt.Font;
import java.awt.event.DocumentEvent;
import java.awt.event.DocumentListener ;
public class food implements ActionListener{
	
	JButton paynowButton,back;
    JLabel ownerLabel,totaldish,fooditems,amountLabel,text,mobile,email,city,selectfood,address,upi,act_no,card_no,total_amount;
    JLabel backgroundcolor,billText;
    JTextField tot_amt;
    JFrame frame = new JFrame("FOOD_PAYMENT");
    JFrame dframe = new JFrame("BILL");
    private JLabel xamount,xname,xno;
    Integer count=0,payCount=0,upiidcount=0,accountno=0,cardno=0;
    
	public food(){
       
		
		text = new JLabel("PAY YOUR AMOUNT!!");
        JTextField tf =new JTextField();
        JTextField tf1 =new JTextField();
        JTextField tf_amount =new JTextField();
        
        backgroundcolor =new JLabel();
        JRadioButton r1 = new JRadioButton("UPI");
        JRadioButton r2 = new JRadioButton("NET BANKING");
        JRadioButton r3 = new JRadioButton("CREDIT / DEBIT CARD");
        fooditems = new JLabel("SELECT PAYMENT METHOD");
        ownerLabel = new JLabel("CUSTOMER NAME");
        mobile = new JLabel("MOBILE NO");
        amountLabel =new JLabel("AMOUNT");
        upi = new JLabel("UPI ID");
        upi.setBounds(50,250,200,20);
        act_no = new JLabel("ACCOUNT NO");
        act_no.setBounds(50,250,200,20);
        card_no = new JLabel("CARD NO");
       card_no.setBounds(50,250,200,20);
        JTextField upi_id = new JTextField();
        upi_id.setBounds(210,250,200,20);
        JTextField ac_no = new JTextField();
       ac_no.setBounds(210,250,200,20);
        JTextField ca_no = new JTextField();
       ca_no.setBounds(210,250,200,20);
        text.setBounds(240,40,600,20);
        text.setFont(new Font("Arial",Font.BOLD,25));
        ownerLabel.setBounds(50,100,150,20);
        xname = new JLabel("");
        xname.setBounds(200,100,150,20);
        tf.setBounds(200,100,150,20);

        mobile.setBounds(50,150,150,20);
        tf1.setBounds(200,150,150,20);
        xno = new JLabel("");
        xno.setBounds(200,150,150,20);
        amountLabel.setBounds(50,310,150,20);
        tf_amount.setBounds(200,250,150,20);
        xamount = new JLabel("");
        xamount.setBounds(210,310,150,20);
       
        fooditems.setBounds(50,200,200,20);
        
         r1.setBounds(300,200,100,30);
         r2.setBounds(400,200,150,30);
         r3.setBounds(550,200,180,30); 

         
         ButtonGroup bg = new ButtonGroup();
        paynowButton = new JButton("PLACE ORDER");
        paynowButton.setBounds(280,400,150,30);
        
        back = new JButton("<--BACK");
        back.setBounds(280,650,150,30);
        
       r1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
               payCount++;
               upi.setVisible(true);
               upi_id.setVisible(true);
               act_no.setVisible(false);
               ac_no.setVisible(false);
               card_no.setVisible(false);
               ca_no.setVisible(false);
              
           }
       });

          
       r2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            payCount++;
            upi.setVisible(false);
            upi_id.setVisible(false);
            act_no.setVisible(true);
            ac_no.setVisible(true);
            card_no.setVisible(false);
            ca_no.setVisible(false);
           
        }
    });

      
    r3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            payCount++;
            upi.setVisible(false);
            upi_id.setVisible(false);
            act_no.setVisible(false);
            ac_no.setVisible(false);
            card_no.setVisible(true);
            ca_no.setVisible(true);
            
           
        }
    });
    upi_id.getDocument().addDocumentListener(new DocumentListener()
        {

            public void changedUpdate(DocumentEvent arg0) 
            {

            }
            public void insertUpdate(DocumentEvent arg0) 
            {
                if(upi_id.getText().length() >=8)
                {

                    upiidcount=1;
                }
                
            }

            public void removeUpdate(DocumentEvent arg0) 
            {
                JOptionPane.showMessageDialog(paynowButton,"TAKE YOUR TIME AND GIVE A VALID ID!!");
            }
        });
        ac_no.getDocument().addDocumentListener(new DocumentListener()
        {

            public void changedUpdate(DocumentEvent arg0) 
            {
              
            }
            public void insertUpdate(DocumentEvent arg0) 
            {
                if(ac_no.getText().length() >=10)
                {

                   
                   accountno=1;
                }
                
            }

            public void removeUpdate(DocumentEvent arg0) 
            {
                JOptionPane.showMessageDialog(paynowButton,"TAKE YOUR TIME AND GIVE A VALID ACCOUNT NO!!");
            }
        });
        ca_no.getDocument().addDocumentListener(new DocumentListener()
        {

            public void changedUpdate(DocumentEvent arg0) 
            {

            }
            public void insertUpdate(DocumentEvent arg0) 
            {
                if(ca_no.getText().length() >=12)
                {

                   cardno=1;
                }
                
            }

            public void removeUpdate(DocumentEvent arg0) 
            {
                JOptionPane.showMessageDialog(paynowButton,"TAKE YOUR TIME AND GIVE A VALID 12 DIGIT CARD NO!!");
            }
        });
       
        paynowButton.addActionListener(new ActionListener()
        {
           

            public void actionPerformed(ActionEvent e)
            {
              
               if(count==0 && payCount!=0 && upiidcount==1 || accountno==1 || cardno==1){
               

                count++;
                
                String end="\n\n\nORDERED ITEM WILL BE DELIVERED IN YOUR DOOR STEP SOON!\n\n\nTASTY FOOD IS ON IT'S WAY!\n\n\n------THANKS FOR ORDERING------";
               
               
        
                JOptionPane.showMessageDialog(paynowButton,"YOUR AMMOUNT IS PAID SUCCESSFULLY!!"+end);
                back.setVisible(true);
               
               }
               
               else if(count==0 && payCount !=0 && upiidcount !=1){
                JOptionPane.showMessageDialog(frame,"<html><p style='color:black'> PLEASE!! GIVE VALID</p>  <br><p style='color:red'> UPI ID <br> &emsp;or<br> ACCOUNT NO <br> &emsp;or<br> CARD NO!!</p></html>");
               }
              
               
               else if(count==0 && payCount==0){
                JOptionPane.showMessageDialog(paynowButton,"PLEASE!! SELECT YOUR PAYMENT OPTION!!");
               
               }
               else if(count!=0){
                JOptionPane.showMessageDialog(paynowButton,"YOU ALREADY PAID FOR YOUR ORDER!!");
                frame.dispose();
                Billing billing = new Billing();
               }

                back.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                       Billing billing = new Billing();
                       frame.setVisible(false);
                              
                    }
                });
            }
        
        });
        
     
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        frame.add(text);
        
        frame.add(paynowButton);
        frame.add(fooditems);
        frame.add(mobile);
        frame.add(ownerLabel);
        frame.add(amountLabel);
        frame.add(xname);
        frame.add(xno);
        frame.add(upi);
        frame.add(upi_id);
        frame.add(act_no);
        frame.add(ac_no);
        frame.add(card_no);
        frame.add(ca_no);
        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(back);
        dframe.setSize(800,500);
        dframe.setLayout(null);
        dframe.setVisible(false);
        frame.setSize(800,1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(xamount);
        upi.setVisible(false);
        upi_id.setVisible(false);
        act_no.setVisible(false);
        ac_no.setVisible(false);
        card_no.setVisible(false);
        ca_no.setVisible(false);
        back.setVisible(false);
	}   
	public static void main(String[] args)
    {
        
		new food();
    }
    public void my_update(String x2) {
       
		xamount.setText(x2);
	}
    public void my_update1(String x1){
        xname.setText(x1);
    }
    public void my_update3(String x3){
        xno.setText(x3);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        frame.dispose();
        
            
    }
}