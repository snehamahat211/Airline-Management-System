import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class JourneyDetails extends JFrame implements ActionListener {
    JTable table;
    JTextField pnrfield;
    JButton show;

    public JourneyDetails() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel pnr= new JLabel("PNR:");
        pnr.setForeground(Color.BLACK);
        pnr.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pnr.setBounds(20,15,80,20);
        add(pnr);

        pnrfield=new JTextField();
        pnrfield.setBounds(70,10,160,30);
        add(pnrfield);


        show=new JButton("Show");
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
        show.setFont(new Font("Times New Roman", Font.BOLD, 20));
        show.setBounds(280,10,100,30);
        add(show);







        table= new JTable();


        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,60,800,300);
        add(jsp);

        setSize(800,500);
        setLocation(400,200);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Conn conn = new Conn();
            ResultSet rs =conn.s.executeQuery("select * from reservation");
            table.setModel (DbUtils.resultSetToTableModel(rs));

        }catch(Exception ae){
            ae.printStackTrace();
        }

    }
    public static void main(String[]args){

        new JourneyDetails();
    }

}
