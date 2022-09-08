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
public class tugas7_2 {
    public static void main(String[] args) {
        int x=11;
    int n=x-7;// hourglass dalem +gagang
    int y=x-2;// tutup atas
        
//tutup atas    
        for (int i = 0; i <y ; i++) {
            System.out.print("* ");
            }
            System.out.println("");

// hourglass + gagang
        for(int i=n; i>0; i--) {
            System.out.print("* ");
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
        }
            for(int j=1; j<2*i; j++) {
                System.out.print("* ");
            } 
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            } System.out.print("* "); 
                System.out.println();
        } 
        for(int i=n-2; i<=n; i++) { 
            System.out.print("* ");
            for(int j=n; j>=i+1; j--) {
            System.out.print("  ");
        }
            for(int j=1; j<2*i; j++) {
                System.out.print("* ");
            }
            for(int j=n; j>=i+1; j--) {
            System.out.print("  ");
            } System.out.print("* ");
                System.out.println();
        }
        
//tutup bawah
        for (int i = 0; i <y ; i++) {
        System.out.print("* ");
        }
    }
}