/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Execute;

import com.Sepatu;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ExecuteSepatu {
    public List<Sepatu> getAllSepatu(){
        List<Sepatu> arrSptu = new ArrayList<Sepatu>();
        String query = "Select * from sepatu";   // tabelnya sepatu
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Sepatu spt = new Sepatu();
                spt.setId_sepatu(rs.getString("id_sepatu"));
                spt.setNama(rs.getString("Nama"));
                spt.setHarga(rs.getInt("Harga"));
     
                arrSptu.add(spt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteSepatu.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return arrSptu;
}
    public int createSepatu(Sepatu spt){
        int hasil = 0;
        // buka koneksi
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "INSERT INTO sepatu(id_sepatu, nama, harga)"
                + "values('"+spt.getId_sepatu()+"','" + spt.getNama() +"', '"
                + spt.getHarga() +"')";
        
        try {
            Statement stm =conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteSepatu.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateSepatu(Sepatu Updspt){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update sepatu set nama='"+  Updspt.getNama() +"',harga=" + 
                Updspt.getHarga()+" where id_sepatu='"+ Updspt.getId_sepatu()
                +"'";
        try {
            Statement stm =conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteSepatu.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int deleteSepatu(String DelId_spt){
        String query = "Delete from sepatu where id_sepatu='"+ DelId_spt +"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm =conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteSepatu.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
}
}
