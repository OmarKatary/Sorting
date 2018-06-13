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
public class RadixSort {
    
        private void countingSort (int[] inputArr, int exp){
        
        
        int i;
        int [] outputArr = new int[inputArr.length];
        

        
        int [] positionArr = new int[10]; 
        
        for( i = 0 ; i < 10 ; i++)
            positionArr[i] = 0;
        
        for( i = 0 ; i < inputArr.length; i++)
            positionArr[(inputArr[i]/exp)%10]++;
        
        for( i = 1 ; i < 10 ; i++)
            positionArr[i] = positionArr[i] + positionArr[i-1];
               
        for( i = inputArr.length-1 ; i >= 0 ; i--){
            outputArr[positionArr[(inputArr[i]/exp)%10]-1] = inputArr[i];
            positionArr[(inputArr[i]/exp)%10]--;
        }
        
        for( i = 0 ; i < inputArr.length; i++)
            inputArr[i] = outputArr[i];
        
    }
        
        public void radixSort(int[] A){
            int maxVal = 0;
            for( int i = 0 ; i < A.length; i++)
                if(A[i] > maxVal)
                    maxVal = A[i];
            
            for(int exp = 1 ; maxVal/exp > 0 ; exp= exp * 10){
                countingSort(A, exp);
            }
            
        }
        
}
