import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddCustomer extends JFrame implements ActionListener {
    JTextField nameTextField,nationfield,citizenfield,addressfield,phonefield;
    JRadioButton male,female;
    JButton save;
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

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Arial", Font.BOLD, 15));
        address.setBounds(80, 290, 150, 20);
        add(address);

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
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.BOLD, 20));
        female.setBounds(340, 340, 100, 15);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);

        JLabel phone = new JLabel("Phone:");
        phone.setFont(new Font("Arial", Font.BOLD, 15));
        phone.setBounds(80, 390, 150, 20);
        add(phone);

        phonefield= new JTextField();
        phonefield.setFont(new Font("Arial", Font.BOLD, 20));
        phonefield.setBounds(210, 390, 250, 30);
        add(phonefield);

        save=new JButton("SAVE");
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        save.setBounds(220,440,150,30);
        save.addActionListener(this);
        add(save);

        ImageIcon image =new ImageIcon(ClassLoader.getSystemResource("employee.png"));
        JLabel lblimage=new JLabel(image);
        lblimage.setBounds(470,120,220,200);
        add(lblimage);

        getContentPane().setBackground(Color.WHITE);
        setSize(750, 750);
        setLocation(300,150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        String name=nameTextField.getText();
        String nationality=nationfield.getText();
        String citizenship=citizenfield.getText();
        String address=addressfield.getText();

        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }else{
            gender="Female";
        }
        String phone=phonefield.getText();

        try{
            Conn conn =new Conn();
            String query="insert into passenger values('"+name+"','"+nationality+"','"+address+"','"+citizenship+"','"+gender+"','"+phone+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Customer Added Successfully");
            setVisible(false);


        } catch(Exception ex){
            ex.printStackTrace();
        }

    }
    public static void main (String[] args) {
        new AddCustomer();
    }

}

