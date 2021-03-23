
import java.util.Random;
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
public class RandomArray {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int angka = 0;
        Scanner scan = new Scanner(System.in);
        Random number = new Random();
        
        System.out.print("Jumlah Deret = ");
        angka = scan.nextInt();
        
        for (int i = 0; i <= angka - 1; i++) {
            int[]acak = new int[angka];
            acak[i] = number.nextInt(100);
            System.out.print(acak[i]+" ");
        }
        System.out.println("");
    }    
}
