package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,m1,m2,m3;
    
    JButton next;
    
    JTextField textName, textFname, textEmail, textMs,textAdd,textCity,textpin,textState;
    
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4=(ran.nextLong() % 9000L)+1000L;
    String first = " "+Math.abs(first4);
    
    
    Signup(){
        super("Application Form");
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
        
        JLabel label1 = new JLabel("Application Form No."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);
        
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);
        
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);
        
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Ralway",Font.BOLD,22));
        labelName.setBounds(100,190,100,30);
        add(labelName);
        
        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);
        
         JLabel labelFname = new JLabel("Fateher's Name :");
        labelFname.setFont(new Font("Ralway",Font.BOLD,22));
        labelFname.setBounds(100,240,200,30);
        add(labelFname);
        
        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);
        
         JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Ralway",Font.BOLD,22));
        dob.setBounds(100,340,200,30);
        add(dob);
        
        dateChooser =new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);
        
        JLabel labelg = new JLabel("Gender :");
        labelg.setFont(new Font("Raleway",Font.BOLD,20));
        labelg.setBounds(100,290,200,30);
        add(labelg);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        
         JLabel labelemail = new JLabel("Email :");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20));
        labelemail.setBounds(100,390,200,30);
        add(labelemail);
        
         textEmail = new JTextField();
         textEmail.setFont(new Font("Raleway",Font.BOLD,14));
         textEmail.setBounds(300,390,400,30);
         add( textEmail);
         
         
         JLabel labeleMs= new JLabel("Marital Status :");
        labeleMs.setFont(new Font("Raleway",Font.BOLD,20));
       labeleMs.setBounds(100,440,200,30);
        add(labeleMs);
        
         m1 = new JRadioButton("Married");
          m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);
        
        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add(m2);
        
         m3 = new JRadioButton("Others");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(600,440,100,30);
        add(m3);
        
         ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
         buttonGroup1.add(m3);
         
         
         JLabel labeleAdd= new JLabel("Address :");
       labeleAdd.setFont(new Font("Raleway",Font.BOLD,20));
       labeleAdd.setBounds(100,490,200,30);
        add(labeleAdd);
        
         textAdd = new JTextField();
         textAdd.setFont(new Font("Raleway",Font.BOLD,14));
         textAdd.setBounds(300,490,400,30);
         add( textAdd);
        
         JLabel labeleCity= new JLabel("City :");
      labeleCity.setFont(new Font("Raleway",Font.BOLD,20));
      labeleCity.setBounds(100,540,200,30);
        add(labeleCity);
        
         textCity = new JTextField();
         textCity.setFont(new Font("Raleway",Font.BOLD,14));
         textCity.setBounds(300,540,400,30);
         add( textCity);
         
         JLabel labelepin= new JLabel("PIN Code :");
      labelepin.setFont(new Font("Raleway",Font.BOLD,20));
      labelepin.setBounds(100,590,200,30);
        add(labelepin);
        
         textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
         textpin.setBounds(300,590,400,30);
         add( textpin);
         
         JLabel labeleState= new JLabel("State :");
      labeleState.setFont(new Font("Raleway",Font.BOLD,20));
      labeleState.setBounds(100,640,200,30);
        add(labeleState);
        
         textState = new JTextField();
         textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
         add( textState);

         next=new JButton("Next");
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBackground(Color.BLACK);
         next.setForeground(Color.white);
         next.setBounds(620,710,80,30);
         next.addActionListener(this);
         add(next);
         
        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent e){
        
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()) gender = "Male";
        else if (r2.isSelected()) gender = "Female";
        
        String email = textEmail.getText();
        
        String marital = null;
        if (m1.isSelected()) marital = "Married";
        else if (m2.isSelected())marital="Unmarried";
        else if (m3.isSelected())marital="Other";
        
        String address = textAdd.getText();
        String city = textCity.getText();
        String state = textState.getText();
        String pincode = textpin.getText();
        
        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }
            else {
                concn con1 = new concn();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            
        }
    }
    public static void main(String[ ] args){
        new Signup();
    
}}