/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author HP
 */
public class Tugas7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rows=11;
        int column=11;
        int left=1;
        int right=11;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=column; j++) {
                if(j>left && j<right) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            if(i<6) {
                left +=1;
                right -=1;
            } else if (i>5) {
                left -=1;
                right +=1;
            } 
            System.out.println();
        }
    }
}
