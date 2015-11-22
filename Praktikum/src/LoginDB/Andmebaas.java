package LoginDB;

import java.sql.*;

/**
 * Created by maus on 22.11.15.
 */
public class Andmebaas {
    Connection conn = null;

    public Andmebaas() {
        seadistaAndmebaas();
    }

    private void seadistaAndmebaas() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:login.db");
            System.out.println("Andmebaas käivitus!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sulgeYhendus() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void seadistaTabel() {
        try {
            Statement stat = conn.createStatement();
            String sql = "CREATE TABLE USER (ID INT AUTO_INCREMENT, USERNAME TEXT, PASSWORD TEXT, FULLNAME TEXT, PHONE TEXT, ADDRESS TEXT)";
            stat.executeUpdate(sql);
            stat.close();
            System.out.println("Tabel on loodud");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registerUser(String username, String password) {
        try {
            Statement stat = conn.createStatement();
            String sql = "INSERT INTO USER (USERNAME, PASSWORD) VALUES ('" + username + "', '" + password + "')";
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace(); //See annab errori konsooli
        }
    }

    public void kuvaRead(String username) {
        try {
            Statement stat = conn.createStatement();
            String sql = "SELECT * FROM USER WHERE USERNAME= '" + username +"'";

            ResultSet results =  stat.executeQuery(sql);

            String abUser = results.getString("USERNAME");

            System.out.println(abUser);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace(); //See annab errori konsooli
        }
    }
}

