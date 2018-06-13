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
public class QuickSort {
    
    public int partition(int[] A, int start, int end){
        int pivot = medianOfThreePivot(A, start, end);
        //pivot is the last element
        swap(A, pivot, end);

        int i = start;
        int j = end-1;
        
        
        while (j >= i){
            if( A[i] < A[end])
                i++;
            else if(A[j] > A[end])
                j--;
            else{
                swap(A, i, j);
                i++;
                j--;
            }
        }
        swap(A, i, end);
        return i;
    }
    
    public void quickSort(int[] A, int start, int end){
        if(end > start){
            int pivot = partition(A, start, end);
            quickSort(A, start, pivot-1);
            quickSort(A, pivot+1, end);
        }
        
    }
    
    
    private int medianOfThreePivot(int[] A, int start, int end){
        int mid = (end+start)/2;
        
        if(A[start] > A[end])
            swap(A, start, end);
        if(A[mid] > A[end])
            swap(A, mid, end);
        if(A[start] > A[mid])
            swap(A, start, mid);
            
        
     return mid;       
    }
    
     private void swap(int[] A, int x, int y){
         
         int temp = A[x];
         A[x] = A[y];
         A[y] = temp;
    }
}
