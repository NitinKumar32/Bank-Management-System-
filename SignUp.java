package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4,r5,r6;
    JButton next;

    JTextField textName, textfname,textGender,textEmail,textMs,textA,textCt,textPC,textST;
    JDateChooser dateChooser;
    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);

    SignUp(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/Bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        //APPLICATION FORM NUMBER
        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);

        //PAGE 1 DETAILS
        JLabel label2 = new JLabel("Page 1 : ");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(430,70,600,30);
        add(label2);

        //PERSONAL DETAILS ADDING
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(375,100,600,30);
        add(label3);


        //NAME ADDING
        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);


        //FATHERS'S NAME ADDING
        JLabel labelfName = new JLabel("Father's Name : ");
        labelfName.setFont(new Font("Ralway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textfname = new JTextField();
        textfname.setFont(new Font("Ralway",Font.BOLD,14));
        textfname.setBounds(300,240,400,30);
        add(textfname);

        //Date Of Birth ADDING
        JLabel labelDOB = new JLabel("Date of birth : ");
        labelDOB.setFont(new Font("Ralway",Font.BOLD,20));
        labelDOB.setBounds(100,290,200,30);
        add(labelDOB);

        //CALENDER ADDING
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        //GENDER ADDING
        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(100,340,200,30);
        add(labelG);

        //MALE BUTTON
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,340,100,30);
        add(r1);

        //FEMALE BUTTON
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,340,100,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Ralway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(600,340,100,30);
        add(r3);

        //ADDING BUTTON
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);


        //EMAIL ADDING
        JLabel labelE = new JLabel("Email : ");
        labelE.setFont(new Font("Ralway",Font.BOLD,20));
        labelE.setBounds(100,390,200,30);
        add(labelE);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        //MARRIED STATUS
        JLabel labelMs = new JLabel("Martial Status : ");
        labelMs.setFont(new Font("Ralway", Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        //MARRIED BUTTON
        r4 = new JRadioButton("Married");
        r4.setFont(new Font("Ralway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(300,440,100,30);
        add(r4);

        //SINGLE BUTTON
        r5 = new JRadioButton("Unmarried");
        r5.setFont(new Font("Ralway",Font.BOLD,14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(450,440,100,30);
        add(r5);

        r6 = new JRadioButton("Other");
        r6.setFont(new Font("Ralway",Font.BOLD,14));
        r6.setBackground(new Color(222,255,228));
        r6.setBounds(600,440,100,30);
        add(r6);

        //ADDING BOTH BUTTON
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r4);
        buttonGroup2.add(r5);
        buttonGroup2.add(r6);

        //ADDRESS ADDING
        JLabel labelA = new JLabel("Address : ");
        labelA.setFont(new Font("Ralway",Font.BOLD,20));
        labelA.setBounds(100,490,200,30);
        add(labelA);

        textA = new JTextField();
        textA.setFont(new Font("Ralway",Font.BOLD,14));
        textA.setBounds(300,490,400,30);
        add(textA);

        //CITY ADDING
        JLabel lableCt = new JLabel("City : ");
        lableCt.setFont(new Font("Ralway",Font.BOLD,20));
        lableCt.setBounds(100,540,200,30);
        add(lableCt);

        textCt = new JTextField();
        textCt.setFont(new Font("Ralway",Font.BOLD,14));
        textCt.setBounds(300,540,400,30);
        add(textCt);

        //PINCODE
        JLabel labelPC = new JLabel("Pin Code : ");
        labelPC.setFont(new Font("Ralway",Font.BOLD,20));
        labelPC.setBounds(100,590,200,30);
        add(labelPC);

        textPC = new JTextField();
        textPC.setFont(new Font("Ralway",Font.BOLD,14));
        textPC.setBounds(300,590,400,30);
        add(textPC);

        //STATE ADDING
        JLabel labelST = new JLabel("State : ");
        labelST.setFont(new Font("Ralway",Font.BOLD,20));
        labelST.setBounds(100,640,200,30);
        add(labelST);

        textST = new JTextField();
        textST.setFont(new Font("Ralway",Font.BOLD,14));
        textST.setBounds(300,640,400,30);
        add(textST);


        //NEXT BUTTON ADDING
        next = new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
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
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textfname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }else if (r3.isSelected()){
            gender = "Other";
        }
        String email = textEmail.getText();
        String martial = null;
        if(r4.isSelected()){
            martial = "Married";
        } else if (r5.isSelected()) {
            martial = "Unmarried";
        } else if (r6.isSelected()) {
            martial = "Other";
        }
        String address = textA.getText();
        String city = textCt.getText();
        String pincode = textPC.getText();
        String state = textST.getText();

        try {
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con con1 = new Con();
                String q = "INSERT INTO signup VALUES('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new SignUp2(first);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SignUp();
    }
}
