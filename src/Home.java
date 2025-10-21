import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends JFrame implements ActionListener{
    public Home (){
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("front.jpg"));
        JLabel image =new JLabel(i1);
        image.setBounds(0,0,1600,800);

        add(image);

        JLabel heading=new JLabel("AIR NEPAL WELCOMES YOU");
        heading.setBounds(550,20,450,40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Times New Roman",Font.BOLD,30));

        image.add(heading);


        JMenuBar menubar=new JMenuBar();
        setJMenuBar(menubar);

        JMenu details=new JMenu("Details");
        menubar.add(details);

        JMenuItem FlightDetails=new JMenu("Flight Details");
        details.add(FlightDetails);

        JMenuItem customerDetails=new JMenu("Add Customer Details");
        details.add(customerDetails);

        JMenuItem bookFlight =new JMenu("Book Flight");
        details.add(bookFlight);

        JMenuItem journeyDetails=new JMenu("Journey Details");
        details.add(journeyDetails);

        JMenuItem ticketCancel =new JMenu("Cancel Ticket");
        details.add(ticketCancel);

        JMenu ticket=new JMenu("Ticket");
        menubar.add(ticket);

        JMenuItem boardingPass =new JMenu("Boarding Pass");
        ticket.add(boardingPass);























        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

    }
public static void main (String[] args){
        new Home();

    }

}
