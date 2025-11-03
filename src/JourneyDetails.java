import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class JourneyDetails extends JFrame implements ActionListener {
    JTable table;
    public JourneyDetails() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);



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
