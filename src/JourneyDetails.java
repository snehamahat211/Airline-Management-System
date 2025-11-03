import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class JourneyDetails extends JFrame implements ActionListener {
    public JourneyDetails() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JTable table= new JTable();

        try{
            Conn conn = new Conn();
            ResultSet rs =conn.s.executeQuery("select * from flight ");
            table.setModel (DbUtils.resultSetToTableModel(rs));

        }catch(Exception e){
            e.printStackTrace();
        }
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,0,800,500);
        add(jsp);

        setSize(800,500);
        setLocation(400,200);
        setVisible(true);

    }
    public static void main(String[]args){

        new FlightInfo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
