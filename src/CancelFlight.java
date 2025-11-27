import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import com.toedter.calendar.JDateChooser;

import java.text.SimpleDateFormat;
import  java.util.*;

public class CancelFlight extends JFrame implements ActionListener {
    JTextField pnrfield;
    JButton fetch, flights, flight;
    JComboBox<String> chsource, chdest;
    JDateChooser dcdate;


    JLabel name, nationality, address, gender, source, pnr, destination, Flightn, Flightc, dot;

    CancelFlight() {

        setLayout(null);
        JLabel heading = new JLabel("CANCELLATION");
        heading.setBounds(450, 50, 500, 35);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(heading);

        pnr = new JLabel("PNR Number:");
        pnr.setFont(new Font("Arial", Font.BOLD, 15));
        pnr.setBounds(80, 140, 150, 20);
        add(pnr);

        pnrfield = new JTextField();
        pnrfield.setFont(new Font("Arial", Font.BOLD, 20));
        pnrfield.setBounds(210, 140, 250, 30);
        add(pnrfield);

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


        Flightc = new JLabel("Flight Code:");
        Flightc.setFont(new Font("Arial", Font.BOLD, 15));
        Flightc.setBounds(80, 540, 300, 20);
        add(Flightc);

        dot = new JLabel("Date:");
        dot.setFont(new Font("Arial", Font.BOLD, 15));
        dot.setBounds(80, 590, 150, 20);
        add(dot);

        dcdate = new JDateChooser();
        dcdate.setBounds(200, 590, 200, 25);
        add(dcdate);

        flight = new JButton("Cancel");
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


    public static void main (String[]args){
        new CancelFlight();
    }
}

