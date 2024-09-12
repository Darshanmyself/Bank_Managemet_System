package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener{
    JLabel label1, label2, label3;
    JTextField textfield;
    JPasswordField passwordfield;
    JButton button1,button2,button3;
    login(){
        super("Bank Management System");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);
        
        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3= new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);
        
         label1=new JLabel("Welcome To Atm");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Avanta Garde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);
        
        label2 = new JLabel("Card No : ");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,375,30);
        add(label2);
        
        textfield=new JTextField(15);
        textfield.setBounds(325,190,230,30);
        textfield.setFont(new Font("Arial",Font.BOLD,14));
        add(textfield);
        
        label3 = new JLabel("PIN : ");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,375,30);
        add(label3);
        
        passwordfield = new JPasswordField(15);
        passwordfield.setBounds(325,250,230,30);
        passwordfield.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordfield);
        
        button1 = new  JButton("Sign In");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);
        
        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);
        
        button3 = new JButton("Sign Up");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);
        
        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850, 480,Image.SCALE_DEFAULT);
        ImageIcon iii3= new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850, 480);
        add(iiimage);
        
       
        
        setSize(850, 480);
        setLocation(450, 200);
        setUndecorated(true);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if (e.getSource()==button1){
                concn c = new concn();
                String cardno=textfield.getText();
                String pin = passwordfield.getText();
                String q="select * from login where cardNumber='"+cardno+"' and pin='"+pin+"'";
                ResultSet resultSet =c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }
                
            }
            else if (e.getSource()==button2){
                textfield.setText("");
                passwordfield.setText("");
            }
            else if (e.getSource()==button3){
                new Signup();
                setVisible(false);
            }
        }
        catch(Exception E){
            
        }
    }
    public static void main(String[] args){
        new login();
    }
    
}
