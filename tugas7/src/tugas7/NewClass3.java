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
public class NewClass3 {
    public static void main(String[] args) {
        int i,j,k;
        for (i=2; i<=5; i++) {
            System.out.print("* ");
            for (j=5; j>i; j--) {
                System.out.print("  ");
            }
            for (k=2; k<2*i-2; k++) {
                System.out.print("* ");
            }
            for (j=5; j>i; j--) {
                System.out.print("  ");
            } System.out.print("* ");
            System.out.println();
        }
    }
}
