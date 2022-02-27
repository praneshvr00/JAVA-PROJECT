import javax.swing.*; 
import java.awt.*;
public class model  
{  
          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5;  
          model(){  
          JFrame f= new JFrame("modellab");  
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
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new model();  
}
}  
}
