package tugasa;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class TugasC {
    
    public static void main(String[] args) {
        // Deklarasi Variabel dan Scanner
        int nilai[]; int jumlahdata; int Rata_rata; 
        int jumlahnilai = 0;
        Scanner scan = new Scanner(System.in);
        //Input
        System.out.print("Masukkan banyaknya data nilai = ");
        jumlahdata = scan.nextInt();
        nilai = new int[jumlahdata];
        
        for (int i=0; i<jumlahdata;i++) {
            System.out.print("Masukkan data nilai ke-" + (i+1) + " = ");
            nilai[i] = scan.nextInt();
            
            //Jumlah Nilai
            jumlahnilai += nilai[i];
        }
            
        //Deklarasi Nilai Min dan Max
        int max = nilai[0];
        int min = nilai[0];
            
        //Mencari Nilai Max
        for (int j = 0; j < jumlahdata; j++) {
            if (nilai[j] > max) {
                max = nilai[j];
            }
        }
        //Mencari Nilai Min
        for (int k = 0; k < jumlahdata; k++) {
            if (nilai[k] < min) {
                min = nilai[k];
            }
        }
        //Mencari Rata-rata
        Rata_rata = jumlahnilai / jumlahdata;
        System.out.println("");
        System.out.println("Nilai minimum = "+ min);
        System.out.println("Nilai maksimum = "+ max);
        System.out.println("Nilai rata-ratanya adalah = "+ Rata_rata);
    }    
}
        

