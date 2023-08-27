package QuizeApplication;

import javax.swing.*;
import java.awt.*;
import java .awt.event;

public class Login extends JFrame implements ActionListener {
    JButton rule, back;
    JTextField tf;

    Login() {
        getContentPane().setBackground(Color.black);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));

        JLabel image = new JLabel(i1);
        image.setBounds(0, -10, 500, 500);
        add(image);

        JLabel heading = new JLabel("Quize Time");
        heading.setBounds(600, 40, 300, 40);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 45));
        heading.setForeground(Color.pink);
        add(heading);

        JLabel name = new JLabel("Enter Your NAME");
        name.setBounds(620, 100, 300, 40);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        name.setForeground(Color.ORANGE);
        add(name);

        tf = new JTextField();
        tf.setBounds(610, 170, 230, 30);
        tf.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        add(tf);

        rule = new JButton("RULES");
        rule.setBounds(600, 250, 80, 20);
        rule.setFont(new Font("TimesNewRoman", Font.BOLD, 13));
        rule.setBackground(Color.pink);
        rule.setForeground(Color.black);
        rule.addActionListener(this);
        add(rule);


        back = new JButton("BACK");
        back.setBounds(800, 250, 80, 20);
        back.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
        back.setBackground(Color.pink);
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);


        setSize(1000, 500);
        setLocation(250, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rule) {
            String name = tf.getText();
            setVisible(false);
            new Rules(name);

        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }
}
