/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasa;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TugasA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi
        int angka1; int angka2;
        Scanner scan = new Scanner(System.in);
        //Input
        System.out.print("Batas Awal = ");
        angka1 = scan.nextInt();
        System.out.print("Batas Akhir = ");
        angka2 = scan.nextInt();
        for ( int  i = angka1; i <= angka2; i+=2) {
                System.out.print(i +" ");
            }
            System.out.println("");
        }
    }


