import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import com.toedter.calendar.JDateChooser;
import  java.util.*;

public class BookFlight extends JFrame implements ActionListener {
    JTextField citizenfield;
    JButton fetch, flights, flight;
    JComboBox<String> chsource, chdest;
    JDateChooser dcdate;


    JLabel name, nationality, address, gender, source, Citizenship, destination, Flightn, Flightc, dot;

    BookFlight() {

        setLayout(null);
        JLabel heading = new JLabel("Book Flight");
        heading.setBounds(450, 50, 500, 35);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(heading);

        Citizenship = new JLabel("Citizenship no:");
        Citizenship.setFont(new Font("Arial", Font.BOLD, 15));
        Citizenship.setBounds(80, 140, 150, 20);
        add(Citizenship);

        citizenfield = new JTextField();
        citizenfield.setFont(new Font("Arial", Font.BOLD, 20));
        citizenfield.setBounds(210, 140, 250, 30);
        add(citizenfield);

        fetch = new JButton("Fetch");
        fetch.setBackground(Color.RED);
        fetch.setForeground(Color.WHITE);
        fetch.setBounds(480, 140, 130, 30);
        fetch.addActionListener(this);
        add(fetch);

        name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD, 15));
        name.setBounds(80, 190, 500, 20);
        add(name);

        nationality = new JLabel("Nationality:");
        nationality.setFont(new Font("Arial", Font.BOLD, 15));
        nationality.setBounds(80, 240, 500, 20);
        add(nationality);

        address = new JLabel("Address:");
        address.setFont(new Font("Arial", Font.BOLD, 15));
        address.setBounds(80, 290, 500, 20);
        add(address);

        gender = new JLabel("Gender:");
        gender.setFont(new Font("Arial", Font.BOLD, 15));
        gender.setBounds(80, 340, 500, 20);
        add(gender);

        source = new JLabel("Source:");
        source.setFont(new Font("Arial", Font.BOLD, 15));
        source.setBounds(80, 390, 150, 20);
        add(source);

        chsource = new JComboBox<>();
        chsource.setFont(new Font("Arial", Font.PLAIN, 14));
        chsource.setBounds(220, 390, 200, 30);
        add(chsource);

        destination = new JLabel("Destination:");
        destination.setFont(new Font("Arial", Font.BOLD, 15));
        destination.setBounds(80, 440, 150, 20);
        add(destination);

        chdest = new JComboBox<>();
        chdest.setFont(new Font("Arial", Font.PLAIN, 14));
        chdest.setBounds(220, 440, 200, 30);
        add(chdest);

        try {
            Conn c = new Conn();
            String query = "select * from flight";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()) {
                chsource.addItem(rs.getString("Source"));
                chdest.addItem(rs.getString("Dest"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        flights = new JButton("Flights");
        flights.setBackground(Color.RED);
        flights.setForeground(Color.WHITE);
        flights.setBounds(480, 440, 130, 30);
        flights.addActionListener(this);
        add(flights);

        Flightn = new JLabel("Flight Name:");
        Flightn.setFont(new Font("Arial", Font.BOLD, 15));
        Flightn.setBounds(80, 490, 300, 20);
        add(Flightn);

        Flightc = new JLabel("Flight Code:");
        Flightc.setFont(new Font("Arial", Font.BOLD, 15));
        Flightc.setBounds(80, 540, 300, 20);
        add(Flightc);

        dot = new JLabel("Date of Travel:");
        dot.setFont(new Font("Arial", Font.BOLD, 15));
        dot.setBounds(80, 590, 150, 20);
        add(dot);

        dcdate = new JDateChooser();
        dcdate.setBounds(200, 590, 200, 25);
        add(dcdate);

        flight = new JButton("Book Flights");
        flight.setBackground(Color.GREEN);
        flight.setForeground(Color.BLACK);
        flight.setBounds(480, 640, 130, 30);
        flight.addActionListener(this);
        add(flight);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("details.jpg"));
        Image img = image.getImage().getScaledInstance(350, 250, Image.SCALE_DEFAULT);
        ImageIcon image1 = new ImageIcon(img);
        JLabel image2 = new JLabel(image1);
        image2.setBounds(620, 80, 400, 600);
        add(image2);

        getContentPane().setBackground(Color.WHITE);
        setSize(1100, 760);
        setLocation(100, 30);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fetch) {
            try {
                String id = citizenfield.getText();
                Conn c = new Conn();
                String query = "select * from passenger where citizenship = '" + id + "'";
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    name.setText("<html>Name :&nbsp;&nbsp;&nbsp;" + rs.getString("name") + "</html>");
                    nationality.setText("<html>Nationality :&nbsp;&nbsp;&nbsp;" + rs.getString("nationality") + "</html>");
                    address.setText("<html>Address :&nbsp;&nbsp;&nbsp;" + rs.getString("address") + "</html>");
                    gender.setText("<html>Gender :&nbsp;&nbsp;&nbsp;" + rs.getString("gender") + "</html>");
                } else {
                    JOptionPane.showMessageDialog(null, "No record found");
                }

            } catch (Exception ae) {
                ae.printStackTrace();
            }
        } else if (e.getSource() == flights) {
            try {
                String src = (String) chsource.getSelectedItem();
                String dest = (String) chdest.getSelectedItem();

                Conn c = new Conn();
                String query = "select * from flight where source='" + src + "' and dest='" + dest + "'";
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    Flightn.setText("Flight Name: " + rs.getString("f_name"));
                    Flightc.setText("Flight Code: " + rs.getString("f_code"));
                } else {
                    JOptionPane.showMessageDialog(null, "No flights found for selected route.");
                }

            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        else if (e.getSource() == flight) {
            String citizenship = citizenfield.getText();
            String name1 = name.getText();
            String nationality1 = nationality.getText();
            String flightname = Flightn.getText();
            String flightcode = Flightc.getText();
            String src = (String) chsource.getSelectedItem();
            String dest = (String) chdest.getSelectedItem();
            String gender1 = gender.getText();
            String ddate = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();

            try {
                Conn conn = new Conn();
                Random random = new Random();
                int pnr = random.nextInt(1000000);

                String query = "insert into reservation values('PNR-" + pnr + "', '" + name1 + "', '" + nationality1 +
                        "', '" + flightname + "', '" + flightcode + "', '" + src + "', '" + dest + "', '" +
                        gender1 + "', '" + citizenship + "', '" + ddate + "')";

                conn.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Ticket Booked Successfully!");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

    }

        public static void main (String[]args){
            new BookFlight();
        }
    }
