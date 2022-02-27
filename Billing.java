import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Billing {
	
    
	public Billing(){
        JMenu menu, submenu;  
        JMenuItem i1, i2, i3, i4, i5;    
        JFrame f= new JFrame("modellab"); 
        JFrame f2 = new JFrame("syllabus"); 
        JMenuBar mb=new JMenuBar();  
        menu=new JMenu("Menu");  
        submenu=new JMenu("academics");  
        i1=new JMenuItem("department");  
        i2=new JMenuItem("others");  
        i3=new JMenuItem("curriculum");  
        i4=new JMenuItem("syllabus");  
        i5=new JMenuItem("timetable");  
        menu.add(i1); 
        menu.add(i2); 
        submenu.add(i3);  
        submenu.add(i4); 
        submenu.add(i5);  
        menu.add(submenu);  
        mb.add(menu); 
        i4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) 
            {
                // JOptionPane.showInternalMessageDialog(null, "ok");
                f2.setSize(1100,900);
                f2.setVisible(true);
                f.dispose();
                
            }
        });
        JLabel l1 = new JLabel("programme");
        JLabel l2 = new JLabel("department");
        JLabel l3 = new JLabel("semester");
        JTextField s1 = new JTextField();
        JTextField s2 = new JTextField();
        s1.setBounds(250,600,150,20);
        s2.setBounds(450,600,150,20);
f2.add(s1);
f2.add(s2);
        l1.setBounds(100,250,150,20);
        l2.setBounds(100,350,150,20);
        l3.setBounds(100,450,150,20);
        JTextField t1 =new JTextField();
        JTextField t2 =new JTextField();
        JTextField t3 =new JTextField();
        t1.setBounds(200,250,150,20);
        t2.setBounds(200,350,150,20);
        t3.setBounds(200,450,150,20);
      JButton getsyl = new JButton("GET SYLLABUS");
      getsyl.setBounds(300,500,150,20);
      f2.add(getsyl);

      getsyl.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) 
        {
           String a = t1.getText();
           String b = t2.getText();
           s1.setText(a);
           s2.setText(b);

            try{
                    
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","praneshroot");
                
                Statement stmt = con.createStatement();
               
    
               stmt.executeUpdate("INSERT INTO lab(programme,department)VALUES('"+t1.getText()+"','"+t2.getText()+"' )");

                JOptionPane.showInternalMessageDialog(null, "!! data stored!!");
                    stmt.close();
                    con.close(); 
                    
                }
                catch (Exception e1) {
                    JOptionPane.showInternalMessageDialog(null, "!! error!!");
                    e1.printStackTrace();
                        
                }
        }
    });
        f2.add(l1);
        f2.add(l2);
        // f2.add(l3);
        f2.add(t1);
        f2.add(t2);
        f2.add(t3);


        f.setJMenuBar(mb);  
        f.setSize(1500,1200);  
        f.setLayout(null);  
        f.setVisible(true);  
    }


        public static void main(String[] args) 
        {
            new Billing();
            
        }
    }







// import javax.swing.*; 
// import java.awt.*;
// public class mlab  
// {  
//           JMenu menu, submenu;  
//           JMenuItem i1, i2, i3, i4, i5;  
//           mlab(){  
//           JFrame f= new JFrame("modellab");  
//           JMenuBar mb=new JMenuBar();  
//           menu=new JMenu("Menu");  
//           submenu=new JMenu("academics");  
//           i1=new JMenuItem("department");  
//           i2=new JMenuItem("others");  
//           i3=new JMenuItem("curriculum");  
//           i4=new JMenuItem("syllabus");  
//           i5=new JMenuItem("timetable");  
//           menu.add(i1); 
//           menu.add(i2); 
//           submenu.add(i3);  
//           submenu.add(i4); 
//           submenu.add(i5);  
//           menu.add(submenu);  
//           mb.add(menu);  
//           f.setJMenuBar(mb);  
//           f.setSize(400,400);  
//           f.setLayout(null);  
//           f.setVisible(true);  
// }  
// public static void main(String[] args)  
// {  
// new mlab();  
// }
// }  



// import javax.swing.*;
// import javax.swing.border.EmptyBorder;
// import javax.swing.plaf.DimensionUIResource;
// import javax.swing.plaf.FontUIResource;
// import javax.swing.text.AbstractDocument.Content;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.event.ItemEvent;

// import java.awt.*;
// import java.awt.event.*;
// import java.awt.FlowLayout;
// import javax.swing.*;
// import java.sql.*;
// import javax.imageio.ImageIO;
// import java.awt.Graphics;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import java.io.IOException;
// import java.security.GeneralSecurityException;

// public class Billing {
	
//     JButton paymentButton,lout;
//     JLabel referalLabel,ownerLabel,totaldish,fooditems,amountLabel,text,mobile,email,city,selectfood,address;
//     JLabel backgroundcolor,billText;
//     JFrame frame = new JFrame("FOOD_DELIVERY");
//     JFrame dframe = new JFrame("BILL");
//     public BufferedImage image;
//     JLabel always = new JLabel("<html><h1 style='color: red;padding-top:220px'>CHOOSE A FOOD TO SEE<BR> <BR>&EMSP;&EMSP;&EMSP;&EMSP;&EMSP;ITS <BR><BR>&EMSP;PRICE AND QUALITY!</h1></html>");
    
// 	public Billing(){
//         //ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\billbg5.jpg").getImage().getScaledInstance(950, 900, Image.SCALE_DEFAULT));
//         //JLabel bggg = new JLabel(imageIcon);
//         //bggg.setBounds(0, 0, 950, 870);
		
// 		text = new JLabel("<html><p 'style=color:white;'>WELCOME TO FOOD ORDER SYSTEM !!</p></html>");
//         JTextField tf =new JTextField();
//         JTextField tf1 =new JTextField();
//         JTextField tf2 =new JTextField();
//         JTextField tf3 =new JTextField();
//         JTextField tf4 =new JTextField();
//         JTextField tf_amount =new JTextField();
//         backgroundcolor =new JLabel();
//         JRadioButton r1 = new JRadioButton("CHICKEN 65");
//         JRadioButton r2 = new JRadioButton("FULL GRILL");
//         JRadioButton r3 = new JRadioButton("BBQ CHICKEN");
//         JCheckBox cb = new JCheckBox("DOSA");
//         JCheckBox cb1 = new JCheckBox("IDLY");
//         JCheckBox cb2 = new JCheckBox("NOODLES");
//         JCheckBox cb3 = new JCheckBox("POORI");
//         JCheckBox cb4 = new JCheckBox("CHAPATHI");
//         JCheckBox cb5 = new JCheckBox("BIRIYANI");
//         JCheckBox cb6 = new JCheckBox("PARROTA");
//         selectfood = new JLabel("<html><p 'style=color:white;'>SELECT FOOD    :</p></html>");
//         fooditems = new JLabel("<html><p 'style=color:white;'>SELECT SIDE DISH    :</p></html>");
//         ownerLabel = new JLabel("<html><p 'style=color:white;'>CUSTOMER NAME    :</p></html>");
//         totaldish = new JLabel("<html><p 'style=color:white;'>TOTAL DISHES   :</p></html>");
//         mobile = new JLabel("<html><p 'style=color:white;'>MOBILE NO    :</p></html>");
//         email = new JLabel("<html><p 'style=color:white;'>E-MAIL-ID   :</p></html>");
//         referalLabel = new JLabel("<html><p 'style=color:white;'>REFERAL NO    :</p></html>");
//         amountLabel =new JLabel("<html><p 'style=color:white;'>AMOUNT   :</p></html>");
//         billText = new JLabel();
//         ButtonGroup bg = new ButtonGroup();
//         address = new JLabel("<html><p 'style=color:white;'>ADDRESS   :</p></html>");
//         JTextArea addr = new JTextArea(); 
//        JPanel p0 = new JPanel();
//        JTabbedPane tp = new JTabbedPane();
//        lout = new JButton("Log out");
//        lout.setBounds(800,750,90,20); 

         
       
//         try{

       
//          image = ImageIO.read(new File("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\advjava.jpg"));
//         }
//         catch (IOException e){

//         }
//         JPanel p1 = new JPanel(){
//            @Override
//             public void paintComponent(Graphics g){
//                 super.paintComponent(g);
//                 g.drawImage(image,0,0, null);
//                 g.drawLine(0, 425, 600, 425);
//             }
            
//         };
    
//         JLabel head = new JLabel("<html><h1 style='color:red;padding-top:320px'>WHAT  WE  EXACTLY  DO  HERE!</h1><BR><BR><p> WE JUST PROCESS THE CUSTOMER'S ORDER AND OUR AGENTS<BR><BR>WHO WORK FOR OUR FOOD DELIVERIES WILL FURTHER PROCEED TO <BR><BR>DELIVER THE ORDER TO THE CUSTOMER'S RESIDENTIAL ADDRESS <BR><BR><mark >AS SOON AS POSSIBLE!!</mark><BR><BR><BR>WE DELIVER FOOD FROM THE TOP QUALITY RESTAURANTS LIKE</p><ul><li>DIMORA</li><li>BARBEQUE NATION</li><li>L'ATTITUDE 49</li></ul><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR><BR></html>");
        
//         cb.addItemListener(new ItemListener() {
//             @Override
//             public void itemStateChanged(ItemEvent e) {
//                 if (cb.isSelected()) {
                   
//                     p0.removeAll();
//                     p0.revalidate();
//                     tp.setSelectedIndex(1);
//                     tp.setSelectedIndex(0);
//                     p0.revalidate();
//                     ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\dosa1.jpg");
//         JLabel cbi = new JLabel("<html><h1 style='color:green;padding-top:40px;'><center> Rs.20 </center></h1>  <br><br>   <h3> A dosa (also dosai or dosha or dose or thosai) is a thin pancake or crepe,<br><br> originating from South India, made from a fermented batter <br><br> predominantly consisting of lentils   and rice. ...<br><br> Its main ingredients are  rice and black gram,  ground together in a  fine,<br><br> smooth batter with a dash of salt, then fermented.</h3><br><br> <br><div style='padding-left:87px;font-size:larger;'>  <h3 style='color:green;'>Variations: Masala dosa, rava dosa, ghee roast ...<br><br> <br>Main ingredients: Rice and black gram <br><br><br>Place of origin: South India</div><br><br><br><br><br><br><br><br><br><br><br><br><br><br></h3></html>",icon1,JLabel.CENTER);
//                     cbi.setVerticalTextPosition(JLabel.BOTTOM);
//                     cbi.setHorizontalTextPosition(JLabel.CENTER);
//                    p0.add(cbi);
                    
                    

//                     p0.revalidate();
//                 } 
//                 else {
                   
//                     p0.revalidate();
                    
//                    p0.removeAll();
//                    p0.revalidate();
//                    p0.add(always);
//                    tp.setSelectedIndex(1);
//                    tp.setSelectedIndex(0);
                  
//                 }
               
//             }
//         });
//         cb1.addItemListener(new ItemListener() {
//             @Override
//             public void itemStateChanged(ItemEvent e) {
//                 if (cb1.isSelected()) {
//                     p0.removeAll();
//                     p0.revalidate();
//                     tp.setSelectedIndex(1);
//                     tp.setSelectedIndex(0);

//                     ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\idly.jpg");
//                     JLabel cbi = new JLabel("<html><h1 style='color:green;padding-top:40px;'>Rs.10</h1></html>",icon1,JLabel.CENTER);
//                     cbi.setVerticalTextPosition(JLabel.BOTTOM);
//                     cbi.setHorizontalTextPosition(JLabel.CENTER);
//                     p0.add(cbi);
//                     p0.revalidate();
//                 } 
//                 else {
//                     p0.revalidate();
//                    p0.removeAll();
//                    p0.revalidate();
//                    p0.add(always);

                
//                    p0.revalidate();
//                 }
//             }
//         });
//         cb2.addItemListener(new ItemListener() {
//             @Override
//             public void itemStateChanged(ItemEvent e) {
//                 if (cb2.isSelected()) {
//                     p0.removeAll();
//                     p0.revalidate();
//                     tp.setSelectedIndex(1);
//                     tp.setSelectedIndex(0);
//                     ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\noodles.jpg");
//                     JLabel cbi = new JLabel("<html><h1 style='color:green;padding-top:40px;'>Rs.60</h1></html>",icon1,JLabel.CENTER);
//                     cbi.setVerticalTextPosition(JLabel.BOTTOM);
//                     cbi.setHorizontalTextPosition(JLabel.CENTER);
//                     p0.add(cbi);
//                     p0.revalidate();
//                 } 
//                 else {
//                     p0.revalidate();
//                    p0.removeAll();
//                    p0.revalidate();
//                    p0.add(always);

//                    p0.revalidate();
//                 }
//             }
//         });
//         cb3.addItemListener(new ItemListener() {
//             @Override
//             public void itemStateChanged(ItemEvent e) {
//                 if (cb3.isSelected()) {
//                     p0.removeAll();
//                     p0.revalidate();
//                     tp.setSelectedIndex(1);
//                     tp.setSelectedIndex(0);
//                     ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\poori.jpg");
//                     JLabel cbi = new JLabel("<html><h1 style='color:green;padding-top:40px;'>Rs.40</h1></html>",icon1,JLabel.CENTER);
//                     cbi.setVerticalTextPosition(JLabel.BOTTOM);
//                     cbi.setHorizontalTextPosition(JLabel.CENTER);
//                     p0.add(cbi);
//                     p0.revalidate();
//                 } 
//                 else {
//                     p0.revalidate();
//                    p0.removeAll();
//                    p0.revalidate();
//                    p0.add(always);

//                    p0.revalidate();
//                 }
//             }
//         });
//         cb4.addItemListener(new ItemListener() {
//             @Override
//             public void itemStateChanged(ItemEvent e) {
//                 if (cb4.isSelected()) {
//                     p0.removeAll();
//                     p0.revalidate();
//                     tp.setSelectedIndex(1);
//                     tp.setSelectedIndex(0);
//                     ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\chapati.jpg");
//                     JLabel cbi = new JLabel("<html><h1 style='color:green;padding-top:40px;'>Rs.30</h1></html>",icon1,JLabel.CENTER);
//                     cbi.setVerticalTextPosition(JLabel.BOTTOM);
//                     cbi.setHorizontalTextPosition(JLabel.CENTER);
//                     p0.add(cbi);
//                     p0.revalidate();
//                 } 
//                 else {
//                     p0.revalidate();
//                    p0.removeAll();
//                    p0.revalidate();
//                    p0.add(always);

//                    p0.revalidate();
//                 }
//             }
//         });
//         cb5.addItemListener(new ItemListener() {
//             @Override
//             public void itemStateChanged(ItemEvent e) {
//                 if (cb5.isSelected()) {
//                     p0.removeAll();
//                     p0.revalidate();
//                     tp.setSelectedIndex(1);
//                     tp.setSelectedIndex(0);
//                     ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\biriyani.jpg");
//                     JLabel cbi = new JLabel("<html><h1 style='color:green;padding-top:40px;'>Rs.65</h1></html>",icon1,JLabel.CENTER);
//                     cbi.setVerticalTextPosition(JLabel.BOTTOM);
//                     cbi.setHorizontalTextPosition(JLabel.CENTER);
//                     p0.add(cbi);
//                     p0.revalidate();
//                 } 
//                 else {
//                     p0.revalidate();
//                    p0.removeAll();
//                    p0.revalidate();
//                    p0.add(always);

//                    p0.revalidate();
//                 }
//             }
//         });
//         cb6.addItemListener(new ItemListener() {
//             @Override
//             public void itemStateChanged(ItemEvent e) {
//                 if (cb6.isSelected()) {
//                     p0.removeAll();
//                     p0.revalidate();
//                     tp.setSelectedIndex(1);
//                     tp.setSelectedIndex(0);
//                     ImageIcon icon1 = new ImageIcon("C:\\Users\\prane\\Documents\\ADV_ JAVA\\ADV_LAB\\porotta.jpg");
//                     JLabel cbi = new JLabel("<html><h1 style='color:green;padding-top:40px;'>Rs.30</h1></html>",icon1,JLabel.CENTER);
//                     cbi.setVerticalTextPosition(JLabel.BOTTOM);
//                     cbi.setHorizontalTextPosition(JLabel.CENTER);
//                     p0.add(cbi);
//                     p0.revalidate();
//                 } 
//                 else {
//                     p0.revalidate();
//                    p0.removeAll();
//                    p0.revalidate();
//                    p0.add(always);

//                    p0.revalidate();
//                 }
//             }
//         });
         

    
        
//         JPanel p2 = new JPanel();
//         final JScrollPane scrollpane  = new JScrollPane(p1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//         final JScrollPane scrollpane2  = new JScrollPane(p2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//         final JScrollPane scrollpane0  = new JScrollPane(p0,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//         scrollpane.getVerticalScrollBar().setUnitIncrement(16);
//         scrollpane0.getVerticalScrollBar().setUnitIncrement(16);
//         p1.add(head);
         
//         head.setBounds(200,800,400,100);
        
//         tp.setBounds(1000,20,530,900);
       
//         tp.addTab("DISPLAY",scrollpane0);
//         tp.add("ABOUT US",scrollpane);
//         tp.add("HELP",scrollpane2); 
//         frame.add(tp);
       
        
        
       
       
        

        
//         text.setBounds(400,40,600,20);
//         text.setFont(new Font("Arial",Font.BOLD,25));
       
//         ownerLabel.setBounds(50,100,150,20);
//         tf.setBounds(200,100,150,20);
//         tf.setToolTipText("<html><b><font color=red>" + "initals at last" + "</font></b></html>");

        

//         mobile.setBounds(50,150,150,20);
//         tf1.setBounds(200,150,150,20);
//         tf1.setToolTipText("<html><b><font color=red>" + "only number" + "</font></b></html>");

//         email.setBounds(50,200,150,20);
//         tf2.setBounds(200,200,150,20);
//         tf2.setToolTipText("<html><b><font color=red>" + "eg:xyz@gmail.com" + "</font></b></html>");
        
//         address.setBounds(50,250,150,20);
//         addr.setBounds(200,250,200,30);

//         referalLabel.setBounds(50,300,150,20);
//         tf3.setBounds(200,300,50,20);
       
//         selectfood.setBounds(50,350,150,20);
//         cb.setBounds(200,350,100,20);
//         cb1.setBounds(200,380,100,20);
//         cb2.setBounds(200,410,100,20);
//         cb3.setBounds(300,350,100,20);
//         cb4.setBounds(300,380,100,20);
//         cb5.setBounds(300,410,100,20);
//         cb6.setBounds(400,350,100,20);



//         fooditems.setBounds(50,450,150,20);
//          r1.setBounds(200,450,100,30);
//          r2.setBounds(300,450,100,30);
//          r3.setBounds(400,450,150,30); 
       
        
//        totaldish.setBounds(50,500,150,20);
//         tf4.setBounds(200,500,150,20);

//         amountLabel.setBounds(50,550,150,20);
//         tf_amount.setBounds(200,550,150,20);
        
       
       
       
        
        
        
//         billText.setBounds(50,220,150,20);

      
		
//         JButton addButton = new JButton("GET BILL");
//         paymentButton = new JButton("PAY NOW");
//         addButton.setBounds(230,650,95,30);
//         paymentButton.setBounds(200,700,150,30);
         
    
//         addButton.addActionListener(new ActionListener()
//         {
//             public void actionPerformed(ActionEvent e)
//             {
//                 if(cb.isSelected()==false && cb1.isSelected()==false && cb2.isSelected()==false  && cb2.isSelected()==false && cb3.isSelected()==false  && cb4.isSelected()==false && cb5.isSelected()==false && cb6.isSelected()==false ){
//                     JOptionPane.showInternalMessageDialog(null,"OOPS ! PLEASE SELECT A FOOD!");
//                 }
//                 else{

                
//                 float amount=0;
//                 String msg=" ";
//                 Integer count=0;
//                 if(cb.isSelected())
//                 {
//                     amount+=20;
//                     msg+="dosa       :20\n";
//                     count++;
//                 }

//                 if(cb1.isSelected())
//                 {
//                     amount+=10;
//                     msg+="idly       :10\n";
//                     count++;
//                 }
//                 if(cb2.isSelected())
//                 {
//                     amount+=60;
//                     msg+="noodles    :60\n";
//                     count++;
//                 }
//                 if(cb3.isSelected())
//                 {
//                     amount+=40;
//                     msg+="poori      :40\n";
//                     count++;
//                 }
//                 if(cb4.isSelected())
//                 {
//                     amount+=30;
//                     msg+="chapathi   :30\n";
//                     count++;
//                 }
//                 if(cb5.isSelected())
//                 {
//                     amount+=65;
//                     msg+="biriyani   :65\n";
//                     count++;
//                 }
//                 if(cb6.isSelected())
//                 {
//                     amount+=30;
//                     msg+="parrota    :30\n";
//                     count++;
//                 }
//                 if(r1.isSelected())
//                 {
//                     amount+=100;
//                     msg+="chicken-65 :100\n";
//                     count++;
//                 }
//                 if(r2.isSelected())
//                 {
//                     amount+=110;
//                     msg+="full grill :110\n";
//                     count++;
//                 }
//                 if(r3.isSelected())
//                 {
//                     amount+=80;
//                     msg+="chicken bbq:80\n";
//                     count++;
//                 }
            
                
                


//                 msg+="------------------\n";
//                 tf4.setText(Integer.toString(count));
//                 tf_amount.setText(Double.toString(amount)); 
//                 billText.setText(Double.toString(amount)); 
//                 JOptionPane.showMessageDialog(frame,msg+"TOTAL:"+amount);
//                 tf_amount.setText(Double.toString(amount)); 
//                 billText.setText(Double.toString(amount)); 
//                 tf_amount.setEditable(false);
//                 tf4.setEditable(false);
//             }
//             }
        
                
//     });
     
               

       
//         paymentButton.addActionListener(new ActionListener(){
//             public void actionPerformed(ActionEvent e) 
//             {

                
                      
                
//                if(tf_amount.getText().length()==0){
//                 JOptionPane.showInternalMessageDialog(null,"GET A BILL AND THEN MAKE YOUR PAYMENT!");
//                }
//                else{

                    
//                 try{
                    
//                     Class.forName("com.mysql.cj.jdbc.Driver");
                    
//                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","praneshroot");
                    
//                     Statement stmt = con.createStatement();
                   
        
// stmt.executeUpdate("INSERT INTO customerinfo(customer_name,phone,email_id,address,referal_no)VALUES('"+tf.getText()+"','"+tf1.getText()+"','"+tf2.getText()+"','"+addr.getText()+"','"+tf3.getText()+"' )");
//                     JOptionPane.showInternalMessageDialog(null, "!!success!!");
//                         stmt.close();
//                         con.close();
                        
//                         String x1 = tf.getText();
//                         String x2 = tf_amount.getText();
//                         String x3 = tf1.getText();
//                         food food =new food();
//                         food.my_update1(x1);
//                         food.my_update(x2);
//                         food.my_update3(x3);
                        
//                     }
//                      catch (Exception e2) {
                        
                        
//                     }	
                
                  
//                }
               
//             }
//         });
//         lout.addActionListener(new ActionListener()
//         {
//             public void actionPerformed(ActionEvent e)
//             {

//                 int a = JOptionPane.showConfirmDialog(null, "Are you sure?");
                
//                 if (a == JOptionPane.YES_OPTION) {
//                     frame.dispose();
//                    assignment assignment =  new assignment();
                    
//                 }
//                 else{

               
//             }


//             }
//         });
//         Container c = frame.getContentPane();
//         c.setBackground(Color.blue); 
//         bg.add(r1);
//         bg.add(r2);
//         bg.add(r3);
//         frame.add(text);
//         frame.add(paymentButton);
       
// 		frame.add(addButton);
//         frame.add(fooditems);
//         frame.add(mobile);
//         frame.add(email);
//         frame.add(ownerLabel);
//         frame.add(selectfood);
//         frame.add(totaldish);
//         frame.add(referalLabel);
//         frame.add(amountLabel);
//         frame.add(tf);
//         frame.add(tf1);
//         frame.add(tf2);
//         frame.add(tf3);
//         frame.add(tf4);
//         frame.add(tf_amount);
//         frame.add(r1);
//         frame.add(r2);
//         frame.add(r3);
//         frame.add(cb);
//         frame.add(cb1);
//         frame.add(cb2);
//         frame.add(cb3);
//         frame.add(cb4);
//         frame.add(cb5);
//         frame.add(cb6);
//         frame.add(address);
//         frame.add(addr);
//         dframe.setSize(800,500);
//         dframe.setLayout(null);
//         dframe.setVisible(false);
//         frame.setSize(1650,1080);
//         frame.setLayout(null);
//         frame.setVisible(true);
//         tf_amount.setEditable(false);
//         tf4.setEditable(false);
//         p0.add(always);
//         frame.add(lout);
//        // frame.add(bggg);
//         addButton.setBackground(Color.RED);
//         paymentButton.setBackground(Color.RED);
// 	}   
// 	public static void main(String[] args) 
//     {
// 		new Billing();
        
//     }
//     @Override
//     public void actionPerformed(ActionEvent e) 
//     {
//         frame.dispose();
        
            
//     }
   
// }