/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Execute;

import db.ConnectionManager;
import com.User;
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
public class ExecuteUsers {
    public List<User> getAllUser(){
        List<User> arrUser = new ArrayList<User>();
        String query = "SELECT * FROM user";   // nama tabelnya user
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                User user = new User();
                user.setId(rs.getString("id"));
                user.setNama(rs.getString("nama"));
                user.setEmail(rs.getString("email"));
                user.setNotelp(rs.getString("notelp"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
     
                arrUser.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return arrUser;
}
        
public int insertUser(User usr) {
    int hasil = 0;
    ConnectionManager conMan = new ConnectionManager();
    Connection conn = conMan.logOn();
    String query = "INSERT INTO user(nama, email, notelp, username, password) " +
                    "VALUES('" + usr.getNama() + "', '" + usr.getEmail() + "', '" +
                    usr.getNotelp() + "', '" + usr.getUsername() + "', '" + usr.getPassword() + "')";

    try {
        Statement stm = conn.createStatement();
        hasil = stm.executeUpdate(query);
    } catch (SQLException ex) {
        Logger.getLogger(ExecuteUsers.class.getName()).log(Level.SEVERE, null, ex);
    }
    conMan.logOff();
    return hasil;
}

    
    public int updateUser(User UpdUser){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update user set Nama='"+  UpdUser.getNama() +"',Email='" + 
                UpdUser.getEmail() +"',Notelp='" + UpdUser.getNotelp()+"',Username='" + 
                UpdUser.getUsername()+ "',Password='" + UpdUser.getPassword()+"' where ID='"+ UpdUser.getId()
                +"'";
        try {
            Statement stm =conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int deleteUser(String DelId_user){
        String query = "Delete from user where ID='"+ DelId_user +"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm =conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
}
}
