import javax.swing.*;
import java.awt.*;


public class AddCustomer extends JFrame {
    JTextField nameTextField,nationfield,citizenfield,addressfield,phonefield;
    JRadioButton male,female;
    AddCustomer (){

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

        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Arial", Font.BOLD, 15));
        Address.setBounds(80, 290, 150, 20);
        add(Address);

        addressfield= new JTextField();
        addressfield.setFont(new Font("Arial", Font.BOLD, 20));
        addressfield.setBounds(210, 290, 250, 30);
        add(addressfield);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Arial", Font.BOLD, 15));
        gender.setBounds(80, 340, 150, 20);
        add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.BOLD, 20));
        male.setBounds(210, 340, 90, 15);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.BOLD, 20));
        female.setBounds(340, 340, 100, 15);
        add(female);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);











        getContentPane().setBackground(Color.WHITE);
        setSize(750, 750);
        setVisible(true);





    }
    public static void main (String[] args) {
        new AddCustomer();
    }

}

