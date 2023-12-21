/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Execute;

import com.Admin;
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

public class ExecuteAdmin {
    public List<Admin> getAllAdmin(){
        List<Admin> arrAdmin = new ArrayList<Admin>();
        String query = "SELECT * FROM admin";   
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Admin adm = new Admin();
                adm.setId(rs.getInt("id"));
                adm.setNama(rs.getString("nama"));
                adm.setEmail(rs.getString("email"));
                adm.setNotelp(rs.getString("notelp"));
                adm.setUsername(rs.getString("username"));
                adm.setPassword(rs.getString("password"));
     
                arrAdmin.add(adm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return arrAdmin;
}
}
