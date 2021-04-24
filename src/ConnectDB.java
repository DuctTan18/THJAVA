/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADM
 */
public class ConnectDB {
    public Connection conn = null;
        public void connectDB() throws SQLException{
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = ("jdbc:sqlserver://DESKTOP-S1U5F99:1433;databaseName=QL_SANPHAM;");
            String userName ="sa";
            String password = "nguyenductan18";
            conn = java.sql.DriverManager.getConnection(url,userName,password);
            
        }
        catch (ClassNotFoundException e) {
        JOptionPane.showMessageDialog(null,"Ket noi CSDL that bai","Thong bao",1);
}   
    }
        public ResultSet LoadData(String sql){
            ResultSet result = null;
            try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
            } catch (SQLException e) {
            e.printStackTrace();
            return null ;
            }
    }
        public void UpdateData(String sql){
        try {
        Statement statement = conn.createStatement();
        statement.executeUpdate(sql);
        }
        catch (SQLException e) {
        e.printStackTrace();
        }
    }
}
