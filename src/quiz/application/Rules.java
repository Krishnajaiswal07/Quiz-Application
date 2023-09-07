
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         JLabel head=new JLabel("Welcome "+ name + " to JAVA QUIZ");
        head.setBounds(50,20,700,50);
        head.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        head.setForeground(Color.BLUE);
        add(head);
          JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,14));
        rules.setText(    "<html>"+ 
                "1. You are trained to be a programmer,so read well before answer. " + "<br><br>" +
                "2. Only Single participation is allowed." + "<br><br>" +
                "3. The medium of the questions will be only English." + "<br><br>" +
                "4. There are Multiple choice Questions." + "<br><br>" +
                "5. There will be certain time span for each Question,15 second for each question. "+ "<br><br>" +
                "6. Move to the next question by clicking on Next Button. " + "<br><br>" +
                "7. Score will be Awarded after submitting the Quiz." + "<br><br>" +
                "8.you can Submit the Quiz after Attempting all the Questions." + "<br><br>" +
            "<html>");
        add(rules);
        
          back =new JButton("Back");
        back.setBounds(200,500,100,30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
         add(back);
           start=new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
         add(start);
        
        
        setSize(800,650);
        setLocation(300,50);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }else if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[]){
        new Rules("User");
    }
}
