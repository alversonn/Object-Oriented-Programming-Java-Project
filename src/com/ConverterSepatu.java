/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import Execute.ExecuteSepatu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ConverterSepatu {
    public String[][] getSepatu(){
        List<Sepatu> Arrspt = new ArrayList<Sepatu>();
        ExecuteSepatu ExS = new ExecuteSepatu();
        Arrspt = ExS.getAllSepatu();
        String[][] dataSptu = new String[Arrspt.size()][3];
        int i = 0;
        for (Sepatu k : Arrspt){
            dataSptu[i][0] = k.getId_sepatu();
            dataSptu[i][1] = k.getNama();
            dataSptu[i][2] = ""+k.getHarga();
            i++;
        }
        return dataSptu;
    }
}
