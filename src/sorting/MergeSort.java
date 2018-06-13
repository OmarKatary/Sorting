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
public class MergeSort {
    
    public int[] merge(int[] list, int[] auxList, int start, int mid, int end ){
        
       
        
        for (int i = start ; i <= end; i++ ){
            auxList [i] = list [i];
        }
        
        int i = start;
        int j = mid+1;
        for (int k = start ; k <= end ; k++ ){
           
            if(i > mid){
                list[k] = auxList[j];
                j++;
            }
            else if (j > end){
                list[k] = auxList[i];
                i++;
            }    
            else if (auxList[i] <= auxList[j]){
                list[k] = auxList[i];
                i++;
            }
            else if (auxList[i] > auxList[j]){
                list[k] = auxList[j];
                j++;
            }
                
        }
       
        return list;
    }
    
    private void mergeSort(int[] list, int[] auxList, int start, int end){
        
        if(end <= start)
            return;
        int mid = start + (end-start)/2;
        mergeSort(list, auxList, start, mid);
        mergeSort(list, auxList, mid + 1, end);
        
        merge(list, auxList, start, mid, end);
    }
    
    public void mergeSort(int [] A){
        int [] auxList = new int[A.length];
        mergeSort(A, auxList, 0, A.length-1);
    }
}
