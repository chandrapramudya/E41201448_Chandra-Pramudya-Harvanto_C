
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
public class TugasE {
    
    public static void main(String[] args) {
        // Deklarasi dan Membuat Scanner 
        String nama; String minuman;
        Scanner scan = new Scanner(System.in);
        // Bagian Atas
        System.out.println("                 CAFE CERIA                      ");
        System.out.println("               ANEKA MINUMAN                     ");
        System.out.println("-------------------------------------------------");
        System.out.println("               SPECIAL MENU :                    ");
        System.out.println("               1. Soft Drinks                    ");
        System.out.println("               2. Mix Juice                      ");
        System.out.println("               3. Nescafe                        ");
        System.out.println("               4. Soda Milk                      ");
        System.out.println("               5. Tea                            ");
        System.out.println("-------------------------------------------------");
        //Input
        System.out.print("Masukkan Nama Pembeli = ");
        nama = scan.nextLine();
        
        System.out.print("Silahkan Masukkan Pilihan Anda = ");
        minuman = scan.nextLine();
        
        switch (minuman) {
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih "+nama+" "+"telah berkunjung di Cafe Ceria");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih "+nama+" "+"telah berkunjung di Cafe Ceria");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih "+nama+" "+"telah berkunjung di Cafe Ceria");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda Milk ");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih "+nama+" "+"telah berkunjung di Cafe Ceria");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih "+nama+" "+"telah berkunjung di Cafe Ceria");
                break;
            default :
                System.out.println("Minuman Tidak Tersedia");
                System.out.println("Mohon Pilih Minuman yang Lain");
                System.out.println("Terima Kasih");
        
        }
    }    
}
