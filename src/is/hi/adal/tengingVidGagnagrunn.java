package is.hi.adal;

/**
 * Created by Alexander on 4/11/2017.
 */

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Alexander on 16.3.2017.
 */
//fuking magic
public class tengingVidGagnagrunn {
    public static java.sql.Connection connection(){
        try{
            //finn gagnagrunninn
            Class.forName("org.sqlite.JDBC");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlite:flight.sqlite");
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Flights");
            //skilar tengingu
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //skilar arry list með from
    public ArrayList<String> getFrom() {
        ArrayList<String> from = new ArrayList<>();

        try {
            java.sql.Connection con = connection();
            //tengist SQLite gagnagrunninum
            //gerir statement sem tekkur allt úr töfnunni
            Statement statement = con.createStatement();
            String s = "SELECT * " +
                    "FROM Flights"; //+

            //executar og finnur allt í töfnunni
            statement.execute(s);
            //hluur sem er með því sem kom út
            ResultSet rs = statement.getResultSet();
            //while sem fer í geggn um result göggnin
            while( rs.next() ) {
                String name = rs.getString("from");
                from.add(name);
            }
            // lokar gagnagruninnum svo hann geti verið nottaður afftur
            statement.close();
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return from;
    }
    //skilar arry lista með to
    public ArrayList<String> getTo() {
        ArrayList<String> to = new ArrayList<>();

        try {
            java.sql.Connection con = connection();
            //tengist SQLite gagnagrunninum
            //gerir statement sem tekkur allt úr töfnunni
            Statement statement = con.createStatement();
            String s = "SELECT * " +
                    "FROM Flights"; //+

            //executar og finnur allt í töfnunni
            statement.execute(s);
            //hluur sem er með því sem kom út
            ResultSet rs = statement.getResultSet();
            //while sem fer í geggn um result göggnin
            while( rs.next() ) {
                String name = rs.getString("to");
                to.add(name);
            }
            // lokar gagnagruninnum svo hann geti verið nottaður afftur
            statement.close();
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return to;
    }
    public ArrayList<String>getDate(){
        ArrayList<String> time = new ArrayList<>();

        try {
            java.sql.Connection con = connection();
            //tengist SQLite gagnagrunninum
            //gerir statement sem tekkur allt úr töfnunni
            Statement statement = con.createStatement();
            String s = "SELECT * " +
                    "FROM Flights"; //+

            //executar og finnur allt í töfnunni
            statement.execute(s);
            //hluur sem er með því sem kom út
            ResultSet rs = statement.getResultSet();
            //while sem fer í geggn um result göggnin
            while( rs.next() ) {
                String name = rs.getString("date");
                time.add(name);
            }
            // lokar gagnagruninnum svo hann geti verið nottaður afftur
            statement.close();
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return time;
    }

    public ArrayList<String>getTime(){
        ArrayList<String> time = new ArrayList<>();

        try {
            java.sql.Connection con = connection();
            //tengist SQLite gagnagrunninum
            //gerir statement sem tekkur allt úr töfnunni
            Statement statement = con.createStatement();
            String s = "SELECT * " +
                    "FROM Flights"; //+

            //executar og finnur allt í töfnunni
            statement.execute(s);
            //hluur sem er með því sem kom út
            ResultSet rs = statement.getResultSet();
            //while sem fer í geggn um result göggnin
            while( rs.next() ) {
                String name = rs.getString("time");
                time.add(name);
            }
            // lokar gagnagruninnum svo hann geti verið nottaður afftur
            statement.close();
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return time;
    }
    public ArrayList<Integer>getCost(){
        ArrayList<Integer> cost = new ArrayList<>();
        try {
            java.sql.Connection con = connection();
            //tengist SQLite gagnagrunninum
            //gerir statement sem tekkur allt úr töfnunni
            Statement statement = con.createStatement();
            String s = "SELECT * " +
                    "FROM Flights"; //+

            //executar og finnur allt í töfnunni
            statement.execute(s);
            //hluur sem er með því sem kom út
            ResultSet rs = statement.getResultSet();
            //while sem fer í geggn um result göggnin
            while( rs.next() ) {
                int peningur = rs.getInt("cost");
                cost.add(peningur);
            }
            // lokar gagnagruninnum svo hann geti verið nottaður afftur
            statement.close();
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return cost;
    }
    public ArrayList<Integer>getSeats(){
        ArrayList<Integer> seats = new ArrayList<>();
        try {
            java.sql.Connection con = connection();
            //tengist SQLite gagnagrunninum
            //gerir statement sem tekkur allt úr töfnunni
            Statement statement = con.createStatement();
            String s = "SELECT * " +
                    "FROM Flights"; //+

            //executar og finnur allt í töfnunni
            statement.execute(s);
            //hluur sem er með því sem kom út
            ResultSet rs = statement.getResultSet();
            //while sem fer í geggn um result göggnin
            while( rs.next() ) {
                int saeti = rs.getInt("seats");
                seats.add(saeti);
            }
            // lokar gagnagruninnum svo hann geti verið nottaður afftur
            statement.close();
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return seats;
    }
}
