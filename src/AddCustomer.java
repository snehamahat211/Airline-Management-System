import javax.swing.*;
import java.awt.*;


public class AddCustomer extends JFrame {
    JTextField nameTextField,nationfield,citizenfield;
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
        name.setFont(new Font("Arial", Font.BOLD, 15));
        name.setBounds(80, 140, 100, 20);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.BOLD, 20));
        nameTextField.setBounds(210, 140, 250, 30);
        add(nameTextField);

        JLabel nationality = new JLabel("Nationality:");
        nationality.setFont(new Font("Arial", Font.BOLD, 15));
        nationality.setBounds(80, 190, 100, 20);   //y=height of particular case +y axis
        add(nationality);

        nationfield= new JTextField();
        nationfield.setFont(new Font("Arial", Font.BOLD, 20));
        nationfield.setBounds(210, 190, 250, 30);
        add(nationfield);

        JLabel Citizenship = new JLabel("Citizenship no:");
        Citizenship.setFont(new Font("Arial", Font.BOLD, 15));
        Citizenship.setBounds(80, 240, 150, 20);
        add(Citizenship);

        citizenfield= new JTextField();
        citizenfield.setFont(new Font("Arial", Font.BOLD, 20));
        citizenfield.setBounds(210, 240, 250, 30);
        add(citizenfield);





    }
    public static void main (String[] args) {
        new AddCustomer();
    }

}

