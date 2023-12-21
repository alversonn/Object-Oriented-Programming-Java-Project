/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author User
 */
public class Sepatu {
    private String id_sepatu;
    private String nama;
    private int harga;

    public Sepatu() {
    }

    public Sepatu(String id_sepatu) {
        this.id_sepatu = id_sepatu;
    }

    public Sepatu(String id_sepatu, String nama, int harga) {
        this.id_sepatu = id_sepatu;
        this.nama = nama;
        this.harga = harga;
    }

    public String getId_sepatu() {
        return id_sepatu;
    }

    public void setId_sepatu(String id_sepatu) {
        this.id_sepatu = id_sepatu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Sepatu{" + "id_sepatu=" + id_sepatu + ", nama=" + nama + ", harga=" + harga + '}';
    }
    
    
}
