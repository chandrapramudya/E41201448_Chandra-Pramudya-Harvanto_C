/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.d;

import java.util.Scanner;
        
public class LatihanD {

    public static void main(String[] args) {
// Membuat Scanner
        Scanner S1 = new Scanner(System.in);
        
// Pengambilan Nilai dari Keyboard
        System.out.println("===Input Nilai===");
        System.out.print("Nilai1 = ");
        int Nilai1 = S1.nextInt();
        System.out.print("Nilai2 = ");
        int Nilai2 = S1.nextInt();
        
// Hasil Penjumlahan Nilai
        System.out.println("===Hasil===");
        int jumlah = Nilai1 + Nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
    
}
