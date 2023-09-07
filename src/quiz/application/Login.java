

package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login  extends  JFrame implements ActionListener {
    
    JButton Rules,back;
    JTextField fname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
       setLayout(null);
      
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel head=new JLabel("JAVA QUIZ");
        head.setBounds(750,60,300,45);
        head.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        head.setForeground(Color.BLUE);
        add(head);
        
         JLabel name=new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(Color.RED);
        add(name);
        
         fname=new JTextField();
        fname.setBounds(735,200,300,25);
        fname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(fname);
        
        Rules=new JButton("Rules");
        Rules.setBounds(735,270,120,25);
        Rules.setBackground(Color.BLUE);
        Rules.setForeground(Color.WHITE);
        Rules.addActionListener(this);
        add(Rules);
        
        back=new JButton("Back");
        back.setBounds(935,270,120,25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
         add(back);
        
         setVisible(true);
        setSize(1200,500);
        setLocation(100,100);
       
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==Rules){
            String name=fname.getText();
            setVisible(false);
           new Rules(name);
        }else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new Login();
    }
}
