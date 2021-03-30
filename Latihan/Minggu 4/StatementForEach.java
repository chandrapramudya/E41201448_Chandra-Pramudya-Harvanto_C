/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class StatementForEach {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //membuat array
        int angka [] = {3,1,42,24,12};
        
        //menggunakan perulangan For each untuk menampilkan angka 
        for ( int x : angka ) {
            System.out.println(x +" ");
        }
        
        
    }    
}
