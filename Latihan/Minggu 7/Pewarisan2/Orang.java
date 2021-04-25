/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan2;

/**
 *
 * @author user
 */
public class Orang {
    private String nama;
    private double tinggi;
    private double berat;
    
    public Orang (String nama, double tinggi, double berat){
        this.nama = nama;
        this.berat = berat;
        this.tinggi = tinggi;
    }
    
    public String toString(){
        return("Nama = " + nama + "\nTinggi = " + tinggi + "\nBerat = " + berat);
    }
}

