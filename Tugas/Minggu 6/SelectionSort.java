/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class SelectionSort {
    
    public static void selectionSort (int[] myList) {
        for (int i = 0; i < myList.length - 1; i++) {
            int nilaiMinimum = myList[i];
            int indexNilaiMinimum = i;
            
        for(int j = i + 1; j < myList.length; j++) {
            if(nilaiMinimum > myList[j]) {
                nilaiMinimum = myList[j];
                indexNilaiMinimum = j;
            }
        }
        
        if(indexNilaiMinimum != i) {
            myList[indexNilaiMinimum] = myList[i];
            myList[i] = nilaiMinimum;
        }
        }
    } 
    
    public static void main(String args []) { 
        int myArray [] = {27, 35, 12, 10, 44, 51, 62, 21, 77, 50};
        
        System.out.println("Before Selection Sort");
    for (int i = 0; i < myArray.length; i++) {
        System.out.print(myArray[i] + " ");
    }
        System.out.println();
        
    // Menampilkan array
    SelectionSort.selectionSort(myArray);
        System.out.println("After Selection Sort");
    for (int i = 0; i < myArray.length; i++) { 
        System.out.print(myArray[i] + " ");
    }
    }
}
