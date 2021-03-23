
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
public class TugasD {
    
        public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi Variabel dan Scanner
        String nama;
        int harga1; int harga2; int harga3; int harga4; int harga5; int Jumlah;
        Scanner scan = new Scanner(System.in);
        //Bagian Atas
        System.out.println("-------------------------------------------------");
        System.out.println("         Kharisma  Agung Plaza ( KAP )           ");
        System.out.println("            Promo Belanja Berhadiah              ");
        System.out.println("       Khusus Pembelian 5 Barang Pertama         ");
        System.out.println("       Dengan Harga Minimum Rp. 10.000,00        ");
        System.out.println("-------------------------------------------------");
        //Input 
        System.out.print("Masukkan Nama Pembeli = ");
        nama = scan.nextLine();
        System.out.print("Masukkan harga barang ke-1    = ");
        harga1 = scan.nextInt();
        System.out.print("Masukkan harga barang ke-2    = ");
        harga2 = scan.nextInt();
        System.out.print("Masukkan harga barang ke-3    = ");
        harga3 = scan.nextInt();
        System.out.print("Masukkan harga barang ke-4    = ");
        harga4 = scan.nextInt();
        System.out.print("Masukkan harga barang ke-5    = ");
        harga5 = scan.nextInt();
        Jumlah = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total harga pembelian atas nama "+nama+" "+"adalah Rp."+" "+Jumlah);
        
        if (Jumlah >= 10000) {
            System.out.println("Selamat...");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
            
        System.out.println("-------------------------------------------------");
        System.out.println("                 Terima Kasih                    ");
        System.out.println("   Anda sudah belanja di Kharisma Agung Plaza    ");
        }
    }   
}
