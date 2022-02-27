import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class mlab {
	
    
	public mlab(){
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
            new mlab();
            
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