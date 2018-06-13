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
public class CountingSort {
    
    public void countingSort (int[] inputArr){
        
        
        int i;
        int rangeMax = 0;
        int [] outputArr = new int[inputArr.length];
        
        for( i = 0 ; i < inputArr.length; i++)
            if(inputArr[i] > rangeMax)
                rangeMax = inputArr[i];
        
        rangeMax++;
        
        int [] positionArr = new int[rangeMax]; 
        
        for( i = 0 ; i < rangeMax ; i++)
            positionArr[i] = 0;
        
        for( i = 0 ; i < inputArr.length; i++)
            positionArr[inputArr[i]]++;
        
        for( i = 1 ; i < rangeMax ; i++)
            positionArr[i] = positionArr[i] + positionArr[i-1];
               
        for( i = inputArr.length-1 ; i >= 0 ; i--){
            outputArr[positionArr[inputArr[i]]-1] = inputArr[i];
            positionArr[inputArr[i]]--;
        }
        
        for( i = 0 ; i < inputArr.length; i++)
            inputArr[i] = outputArr[i];
        

    }
    
}
