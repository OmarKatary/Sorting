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
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Manager m = new Manager();
        int [] A = m.generateArray(10000);
        m.runAllSorts(A);
    }
    
}
