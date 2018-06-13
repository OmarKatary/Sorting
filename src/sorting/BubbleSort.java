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
public class BubbleSort {
    
    public void bubbleSort(int[] A){
        for(int j = 0 ; j < A.length ; j++){
            for( int i = 0 ; i < A.length -j -1 ; i++){
                if(A[i] > A[i+1])
                    swap(A, i, i+1);
            }
        }
    }
    
    private void swap(int[] A, int x, int y){
         
         int temp = A[x];
         A[x] = A[y];
         A[y] = temp;
    }
}
