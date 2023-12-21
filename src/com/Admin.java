/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author User
 */
public class Admin {
    private int id;
    private String nama;
    private String email;
    private String notelp;
    private String username;
    private String password;

    public Admin() {
    }

    
    public Admin(String nama, String email, String notelp, String username, String password) {
        this.nama = nama;
        this.email = email;
        this.notelp = notelp;
        this.username = username;
        this.password = password;
    }

    public Admin(int id, String nama, String email, String notelp, String username, String password) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.notelp = notelp;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
