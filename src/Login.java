import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
    public Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);  //gives null layout

        JLabel username=new JLabel("Username:");
        username.setBounds(20,20,100,20);
        add(username);

        JLabel password=new JLabel("Password");
        password.setBounds(20,60,100,20);
        add(password);

        JTextField user=new JTextField();
        user.setBounds(130,20,200,20);
        add(user);

        JPasswordField pw=new JPasswordField();
        pw.setBounds(130,60,200,20);
        add(pw);



        setSize(400,250);
        setLocation(600,250);
        setVisible(true);






    }
    public static void main (String[] args){
        new Login();

    }
}