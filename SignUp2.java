package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;

    JTextField textPan , textAdhar;

    JRadioButton r1,r2,r3,r4;
    JButton next;
    String formno;
    SignUp2(String first){


        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel label1 = new JLabel("Page 2 : ");
        label1.setFont(new Font("Ralway",Font.BOLD,22));
        label1.setBounds(300,30,600,40);
        add(label1);

        JLabel label2 = new JLabel("Additional Details");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(300,60,600,40);
        add(label2);

        //RELIGION ADDING
        JLabel label3 = new JLabel("Religion : ");
        label3.setFont(new Font("Ralway",Font.BOLD,18));
        label3.setBounds(100,120,100,30);
        add(label3);

        String religion[] = {"Hindu" , "Muslim" , "Sikh" , "Christian" , "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(211,255,234));
        comboBox.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel label4 = new JLabel("Category : ");
        label4.setFont(new Font("Ralway",Font.BOLD,18));
        label4.setBounds(100,170,100,30);
        add(label4);

        String Category [] = {"General","OBC","SC","SC","ST","Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(211,255,234));
        comboBox2.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel label5 = new JLabel("Income : ");
        label5.setFont(new Font("Ralway",Font.BOLD,18));
        label5.setBounds(100,220,100,30);
        add(label5);

        String Income [] = {"Null","<1,50,000","<2,50,500","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(211,255,234));
        comboBox3.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel label6 = new JLabel("Educational : ");
        label6.setFont(new Font("Ralway",Font.BOLD,18));
        label6.setBounds(100,270,150,30);
        add(label6);

        String Educational [] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBox4 = new JComboBox(Educational);
        comboBox4.setBackground(new Color(211,255,235));
        comboBox4.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel label7 = new JLabel("Occupation : ");
        label7.setFont(new Font("Ralway",Font.BOLD,18));
        label7.setBounds(100,320,150,30);
        add(label7);

        String Occupation [] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(211,255,235));
        comboBox5.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel label8 = new JLabel("PAN Number : ");
        label8.setFont(new Font("Ralwat",Font.BOLD,18));
        label8.setBounds(100,370,150,30);
        add(label8);

        textPan = new JTextField();
        textPan.setFont(new Font("Ralway",Font.BOLD,16));
        textPan.setBounds(350,370,320,30);
        add(textPan);

        JLabel label9 = new JLabel("Adhar Number : ");
        label9.setFont(new Font("Ralwat",Font.BOLD,18));
        label9.setBounds(100,420,150,30);
        add(label9);

        textAdhar = new JTextField();
        textAdhar.setFont(new Font("Ralway",Font.BOLD,16));
        textAdhar.setBounds(350,420,320,30);
        add(textAdhar);

        JLabel lable10 = new JLabel("Sennior Citizen : ");
        lable10.setFont(new Font("Ralway",Font.BOLD,18));
        lable10.setBounds(100,470,180,30);
        add(lable10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(211,255,235));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(211,255,235));
        r2.setBounds(460,470,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel lable11 = new JLabel("Exiting Account : ");
        lable11.setFont(new Font("Ralway",Font.BOLD,18));
        lable11.setBounds(100,520,180,30);
        add(lable11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Ralway",Font.BOLD,14));
        r3.setBackground(new Color(211,255,235));
        r3.setBounds(350,520,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Ralway",Font.BOLD,14));
        r4.setBackground(new Color(211,255,235));
        r4.setBounds(460,520,100,30);
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel label12 = new JLabel("Form No : ");
        label12.setFont(new Font("Ralway",Font.BOLD,18));
        label12.setBounds(700,10,180,30);
        add(label12);

        JLabel label13 = new JLabel(formno);
        label13.setFont(new Font("Ralway",Font.BOLD,18));
        label13.setBounds(760,10,60,30);
        add(label13);
        next = new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(211, 255, 234));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String adhar = textAdhar.getText();

        String Sc = " ";
        if((r1.isSelected())){
            Sc = "Yes";
        } else if (r2.isSelected()){
            Sc = "No";
        }

        String ac = " ";
        if((r1.isSelected())){
            ac = "Yes";
        } else if(r2.isSelected()) {
            ac = "No";
        }

        try{
            if(textPan.getText().equals("") || textAdhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con c1 = new Con();
                String q = "Insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+Sc+"','"+ac+"')";
                c1.statement.executeUpdate(q);
                new SignUp3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp2("");
    }
}
