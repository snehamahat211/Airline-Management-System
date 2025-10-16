import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JPasswordField pw;
    JTextField user;
    JButton submit,reset,close;

    public Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);  //gives null layout

        JLabel username=new JLabel("Username:");
        username.setBounds(20,20,100,20);
        add(username);

        JLabel password=new JLabel("Password");
        password.setBounds(20,60,100,20);
        add(password);

        user=new JTextField();
        user.setBounds(130,20,200,20);
        add(user);

        pw=new JPasswordField();
        pw.setBounds(130,60,200,20);
        add(pw);

        reset=new JButton("Reset");
        reset.setBounds(100,120,110,20);
        reset.addActionListener(this);
        add(reset);

        submit=new JButton("Submit");
        submit.setBounds(220,120,110,20);
        submit.addActionListener(this);
        add(submit);

        close=new JButton("Close");
        close.setBounds(160,150,120,20);
        close.addActionListener(this);
        add(close);




        setSize(400,250);
        setLocation(600,250);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==submit){

        } else if (e.getSource()==reset){
            user.setText("");
            pw.setText("");

        }
        else if (e.getSource()==close){
            setVisible(false);
        }
    }
    public static void main (String[] args){
        new Login();

    }
}