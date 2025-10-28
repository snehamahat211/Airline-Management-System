import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BookFlight extends JFrame implements ActionListener {
    JTextField citizenfield;
    JRadioButton male,female;
    JButton fetch;
     BookFlight (){

        setLayout(null);
        JLabel heading=new JLabel("Book Flight");
        heading.setBounds(450,50,500,35);
        heading.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(heading);

         JLabel Citizenship = new JLabel("Citizenship no:");
         Citizenship.setFont(new Font("Arial", Font.BOLD, 15));
         Citizenship.setBounds(80, 140, 150, 20);
         add(Citizenship);

         citizenfield= new JTextField();
         citizenfield.setFont(new Font("Arial", Font.BOLD, 20));
         citizenfield.setBounds(210, 140, 250, 30);
         add(citizenfield);

         fetch=new JButton("Fetch");
         fetch.setBackground(Color.RED);
         fetch.setForeground(Color.WHITE);
         fetch.setBounds(480,140,130,30);
         fetch.addActionListener(this);
         add(fetch);



        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD, 15));
        name.setBounds(80, 190, 100, 20);
        add(name);



        JLabel nationality = new JLabel("Nationality:");
        nationality.setFont(new Font("Arial", Font.BOLD, 15));
        nationality.setBounds(80, 240, 100, 20);   //y=height of particular case +y axis
        add(nationality);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Arial", Font.BOLD, 15));
        address.setBounds(80, 290, 150, 20);
        add(address);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Arial", Font.BOLD, 15));
        gender.setBounds(80, 340, 150, 20);
        add(gender);

        JLabel source = new JLabel("Source:");
        source.setFont(new Font("Arial", Font.BOLD, 15));
        source.setBounds(80, 390, 150, 20);
        add(source);

         JLabel destination = new JLabel("Destination:");
         destination.setFont(new Font("Arial", Font.BOLD, 15));
         destination.setBounds(80, 440, 150, 20);
         add(destination);

         JLabel Flightn = new JLabel("Flight Name:");
         Flightn.setFont(new Font("Arial", Font.BOLD, 15));
         Flightn.setBounds(80, 490, 150, 20);
         add(Flightn);

         JLabel Flightc = new JLabel("Flight Code:");
         Flightc.setFont(new Font("Arial", Font.BOLD, 15));
         Flightc.setBounds(80, 540, 150, 20);
         add(Flightc);

         JLabel dot = new JLabel("Date of Travel:");
         dot.setFont(new Font("Arial", Font.BOLD, 15));
         dot.setBounds(80, 590, 150, 20);
         add(dot);



        ImageIcon image =new ImageIcon(ClassLoader.getSystemResource("details.jpg"));
        Image img = image.getImage().getScaledInstance(350, 250, Image.SCALE_DEFAULT);
        ImageIcon image1 = new ImageIcon(img);
        JLabel image2=new JLabel(image1);
        image2.setBounds(620,80,400,600);
        add(image2);

        getContentPane().setBackground(Color.WHITE);
        setSize(1100, 750);
        setLocation(300,150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {


    }
    public static void main (String[] args) {
        new BookFlight();
    }

}

