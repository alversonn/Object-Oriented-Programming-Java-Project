/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import Execute.ExecuteUsers;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ConverterUser {
    public String[][] getUser(){
        List<User> Arruser = new ArrayList<User>();
        Execute.ExecuteUsers ExU = new ExecuteUsers();
        Arruser = ExU.getAllUser();
        String[][] dataUser = new String[Arruser.size()][6];
        int i = 0;
        for (User u : Arruser){
            dataUser[i][0] = u.getId();
            dataUser[i][1] = u.getNama();
            dataUser[i][2] = u.getEmail();
            dataUser[i][3] = u.getNotelp();
            dataUser[i][4] = u.getUsername();
            dataUser[i][5] = u.getPassword();
            i++;
        }
        return dataUser;
}
}
