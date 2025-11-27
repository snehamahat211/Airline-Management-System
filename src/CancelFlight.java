import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class CancelFlight extends JFrame implements ActionListener {

    JTextField pnrfield;
    JButton fetch, flight;
    JDateChooser dcdate;

    JLabel name, pnr, Flightc, cancelt, dot, canceltext;

    CancelFlight() {

        setLayout(null);
        JLabel heading = new JLabel("CANCELLATION");
        heading.setBounds(250, 50, 500, 35);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(heading);

        pnr = new JLabel("PNR Number:");
        pnr.setFont(new Font("Arial", Font.BOLD, 15));
        pnr.setBounds(80, 140, 150, 20);
        add(pnr);

        pnrfield = new JTextField();
        pnrfield.setFont(new Font("Arial", Font.BOLD, 20));
        pnrfield.setBounds(210, 140, 200, 30);
        add(pnrfield);

        fetch = new JButton("Fetch");
        fetch.setBackground(Color.RED);
        fetch.setForeground(Color.WHITE);
        fetch.setBounds(420, 140, 130, 30);
        fetch.addActionListener(this);
        add(fetch);

        name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD, 15));
        name.setBounds(80, 190, 500, 20);
        add(name);

        cancelt = new JLabel("Cancel Ticket:");
        cancelt.setFont(new Font("Arial", Font.BOLD, 15));
        cancelt.setBounds(80, 240, 300, 20);
        add(cancelt);

        canceltext = new JLabel("" + new Random().nextInt(1000000));
        canceltext.setFont(new Font("Arial", Font.BOLD, 15));
        canceltext.setBounds(200, 240, 300, 20);
        add(canceltext);

        Flightc = new JLabel("Flight Code:");
        Flightc.setFont(new Font("Arial", Font.BOLD, 15));
        Flightc.setBounds(80, 290, 300, 20);
        add(Flightc);

        dot = new JLabel("Date:");
        dot.setFont(new Font("Arial", Font.BOLD, 15));
        dot.setBounds(80, 340, 150, 20);
        add(dot);


        flight = new JButton("Cancel");
        flight.setBackground(Color.GREEN);
        flight.setForeground(Color.BLACK);
        flight.setBounds(380, 380, 130, 30);
        flight.addActionListener(this);
        add(flight);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 460);
        setLocation(100, 30);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fetch) {
            try {
                String pnrValue = pnrfield.getText();
                Conn c = new Conn();
                String query = "select * from reservation where pnr = '" + pnrValue + "'";
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    name.setText("Name: " + rs.getString("name"));
                    Flightc.setText("Flight Code: " + rs.getString("flight_code"));
                    dot.setText("Date: " + rs.getString("Date_of_travel"));
                } else {
                    JOptionPane.showMessageDialog(null, "No record found");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new CancelFlight();
    }
}
