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
public class LatihanB2 {
  
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Membuat Variabel dan Scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        // Mengambil input
        System.out.print("Inputkan Nama Warna = ");
        lampu = scan.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("Lampu Merah, Berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, Harap Hati-hati!");
                break;    
            case "hijau":
                System.out.println("Lampu Hijau, Silahkan Jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah!");
        }
                
    }
}
