/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikaskasir_yesi;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author OWNER
 */
public class Koneksi {
    Connection koneksi = null;
    
    public static Connection koneksiDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir_yesi","root","");
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "tidak terkoneksi ke database");
            return null;
}
    }
}