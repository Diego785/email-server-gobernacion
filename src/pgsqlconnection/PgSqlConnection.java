/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pgsqlconnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 59171
 */
public class PgSqlConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            SqlConnection sqlConnection = new SqlConnection("postgres", "Diego785", "127.0.0.1", "5432", "db_tecno");
            String query = "SELECT * FROM usuarios WHERE id = 1";
            PreparedStatement ps = sqlConnection.conect().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.println("resultado: " + rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(PgSqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
