/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author Katary
 */
public class Manager {
    
   public int[] generateArray(int size){
       int[] A =  new int[size];
       for(int i = 0 ; i < size ; i++){
           A[i] = 0 + (int)(Math.random() * ((size - 0) + 1));
       }
       
       return A;
   }
   public int[] cloneArray(int [] A){
       
       int [] clone = new int[A.length];
        for(int i = 0 ; i < A.length ; i++)
            clone[i] = A[i];
               
      return clone; 
   }
   
   public void printArray(int[] A, int size){
       
       System.out.print("[");
       for(int i=0 ; i<size ; i++){
          System.out.print(A[i]);
          if(i < size-1)
              System.out.print(" ,"); 
       }
      System.out.println("]");
   }
   
   public void runAllSorts(int [] A){
       
       int [] A1 = cloneArray(A);
       sort(A1, "quick");
       
       int [] A2 = cloneArray(A);
       sort(A1, "heap");
       
       int [] A3 = cloneArray(A);
       sort(A3, "merge");
       
       int [] A4 = cloneArray(A);
       sort(A4, "insertion");
       
       int [] A5 = cloneArray(A);
       sort(A5, "selection");
       
       int [] A6 = cloneArray(A);
       sort(A6, "bubble");
       
       int [] A7 = cloneArray(A);
       sort(A7, "count");
       
       int [] A8 = cloneArray(A);
       sort(A8, "radix");
       
       int [] A9 = cloneArray(A);
       sort(A9, "java");
       
   }
   public void sort(int[] A, String type){
       
       long start = 0;
       long finish = 0;
       double secondsTaken;
       
       switch(type){
            case "quick":
               QuickSort qs = new QuickSort();
               start = System.nanoTime();
               qs.quickSort(A, 0, A.length-1);
               finish = System.nanoTime();
               printArray(A, A.length);
               break;
            case "merge":
               MergeSort ms = new MergeSort();
               start = System.nanoTime();
               ms.mergeSort(A);
               finish = System.nanoTime();
               printArray(A, A.length);
               break;
            case "heap":
               BinaryHeap hs = new BinaryHeap();
               start = System.nanoTime();
               hs.heapSort(A);
               finish = System.nanoTime();
               printArray(A, A.length);
               break;
            case "selection":
               SelectionSort ss = new SelectionSort();
               start = System.nanoTime();
               ss.selectionSort(A);
               finish = System.nanoTime();
               printArray(A, A.length);
               break;
            case "insertion":
               InsertionSort is = new InsertionSort();
               start = System.nanoTime();
               is.insertionSort(A);
               finish = System.nanoTime();
               printArray(A, A.length);
               break;
            case "bubble":
               BubbleSort bs = new BubbleSort();
               start = System.nanoTime();
               bs.bubbleSort(A);
               finish = System.nanoTime();
               printArray(A, A.length);
               break;
            case "count":
               CountingSort cs = new CountingSort();
               start = System.nanoTime();
               cs.countingSort(A);
               finish = System.nanoTime();
               printArray(A, A.length);
               break;
            case "radix":
               RadixSort rs = new RadixSort();
               start = System.nanoTime();
               rs.radixSort(A);
               finish = System.nanoTime();
               printArray(A, A.length);
               break;
               case "java":
               start = System.nanoTime();
               Arrays.sort(A);
               finish = System.nanoTime();
               printArray(A, A.length);
               break;
            default:
                System.out.println("Unavailable sorting technique.");
       }
       secondsTaken = (double)(finish-start)/ 1000000;
       System.out.println("Time taken to "+ type + " sort is: " + secondsTaken + " ms\n" );
       
   }
    
}
