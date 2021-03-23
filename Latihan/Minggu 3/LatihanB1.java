/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.b1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LatihanB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Variabel dan Scanner
        int Nilai;
        String Grade;
        Scanner scan = new Scanner(System.in); 
        // Mengambil Input
        System.out.print("Inputkan Nilai = ");
        Nilai = scan.nextInt();
        
        // Hitung Grade
        if (Nilai >= 90) {
            Grade = "A";
        } else if (Nilai >= 80) {
            Grade = "B+";
        } else if (Nilai >= 70) {
            Grade = "B";
        } else if (Nilai >= 60) {
            Grade = "C+";
        } else if (Nilai >= 50) {
            Grade = "C";
        } else if (Nilai >= 40) {
            Grade = "D";
        } else {
            Grade = "E";
        }
        
        // Cetak hasil
        System.out.println("Grade = "+Grade);
    }
    
}
