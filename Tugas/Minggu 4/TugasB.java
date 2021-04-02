package tugasa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TugasB {
    
    public static void main(String[] args) {
        // Deklarasi Variabel
        int i = 1; 
        System.out.println("                  Do__While                      ");
        System.out.println("             Bilangan Perkalian 2                ");
        System.out.println("                   (1-100)                       ");
        System.out.println("=================================================");
        //Coding
        do {
            System.out.print(i+" " );
            i = i * 2;
            System.out.print(" ");
        } while (i<=100);
        System.out.println(" ");

        // Deklarasi Variabel
        int j = 2;
        System.out.println("                  Do__While                      ");
        System.out.println("             Bilangan Kelipatan 2                ");
        System.out.println("                   (1-100)                       ");
        System.out.println("=================================================");
        //Coding
        do {
            System.out.print(j+" " );
            j +=2;
            System.out.print(" ");
        } while (j<=100);
    }
}



