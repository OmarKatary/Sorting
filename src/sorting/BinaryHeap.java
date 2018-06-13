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
public class BinaryHeap {
    
   

    
    private void heapify(int[] A, int parentIndex, int arraySize){
        int leftChild = 2*parentIndex+1;
        int rightChild = 2*parentIndex+2;
        int largest;
        int temp;
        
        if(leftChild < arraySize && A[leftChild] > A[parentIndex])
            largest = leftChild;
        else
            largest = parentIndex;
        
        if(rightChild < arraySize && A[rightChild] > A[largest])
            largest = rightChild;
        
        
        if(largest != parentIndex){
            //swap largest with the parent and heapify the new child (largest)
            temp = A[parentIndex];
            A[parentIndex] = A[largest];
            A[largest] = temp;
            
            heapify(A,largest,arraySize);
        }
    }
    
    public int[] buildMaxHeap(int[] A){
        
        for( int i = A.length/2 ; i >= 0 ; i--){          
            heapify(A, i, A.length);
        }     
        return A;
    }
    
    public int[] heapSort(int[] A){
        int temp;
        
        buildMaxHeap(A);
        for(int i = A.length-1 ; i > 0 ; i--){
            //swap root with last element then heapify the array but the last element
            temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            heapify(A, 0, i);
        }
        
        return A;
    }
    
}
