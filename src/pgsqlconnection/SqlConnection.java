/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pgsqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 59171
 */
public class SqlConnection {

    private static final String DRIVER = "jdbc:postgresql://";
    private Connection connection;
    private String password;
    private String host;
    private String user;
    private String port;
    private String name;
    private String url;

    public SqlConnection(String user, String password, String host, String port, String name) {
        this.user = user;
        this.password = password; //Diego785
        this.host = host;
        this.port = port;
        this.name = name;
        this.url = DRIVER + host + ":" + port + "/" + name;  //127.0.0.1:5432/tecno_bd
    }

    public Connection conect() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.err.println("class sqlconection.java dice:"
                    + "Ocurrió un error al momento de establecer una conexión Connect()");
        }
        return connection;
    }

    public void closecConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.err.println("class sqlconection.java dice:"
                    + "Ocurrió un error al momento de cerrar una conexión closeConnection()");
        }
    }

}
