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
public class InsertionSort {
    
    public void insertionSort(int[] A){
        for(int j = 0; j < A.length ; j++){
            for(int i = j ; i > 0 ; i--){
                if(A[i-1] > A[i])
                    swap(A, i, i-1);
                else
                    break;
            
            }
        }
    }
    private void swap(int[] A, int x, int y){
         
         int temp = A[x];
         A[x] = A[y];
         A[y] = temp;
    }
    
}

