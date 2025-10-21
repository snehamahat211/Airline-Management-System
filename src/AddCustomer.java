import javax.swing.*;
import java.awt.*;


public class AddCustomer extends JFrame {
    JTextField nameTextField;
    AddCustomer (){
        getContentPane().setBackground(Color.WHITE);
        setSize(650, 650);
        setVisible(true);

        setLayout(null);
        JLabel l1=new JLabel("ADD CUSTOMER DETAILS");
        l1.setBounds(150,50,350,20);
        l1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(l1);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(80, 140, 100, 30);   //y=height of particular case +y axis
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.BOLD, 20));
        nameTextField.setBounds(190, 140, 220, 30);
        add(nameTextField);




    }
    public static void main (String[] args) {
        new AddCustomer();
    }

}

