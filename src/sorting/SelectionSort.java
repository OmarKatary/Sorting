/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Katary
 */
public class SelectionSort {
    
    public void selectionSort(int[] A){
        int min = 0;
        for(int j = 0; j < A.length ; j++){
            for(int i = j ; i< A.length ; i++){
                if(A[i] < A[min])
                    min = i;
            }
            swap(A, min, j);
        }
    }
    
    private void swap(int[] A, int x, int y){
         
         int temp = A[x];
         A[x] = A[y];
         A[y] = temp;
    }
    
}
