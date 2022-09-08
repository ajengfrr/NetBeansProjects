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
public class NewClass4 {
    public static void main(String[] args) {
        int n = 11;
        int x = n-2;
            for (int i = 1; i <= x/2+1; i++) {
                for (int j = 1; j <i; j++) {
                    if (j==1 || i==1) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                for (int j = (x/2+1)*2; j >=i*2; j--) {
                    System.out.print("* ");
                }
                for (int j = 1; j < i; j++) {
                    if (j==i-1 || i==1) {
                    System.out.print("* ");                
                    }else {
                System.out.print("  ");        
                }
            }
            System.out.println("");
        } 
            for (int i = 2; i <= x/2+1; i++) {
                for (int j = x/2+1; j >i; j--) {
                    if (j==x/2+1 || i==x/2+1) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                for (int j=2; j<=i+i; j++) {
                    System.out.print("* ");
                }
                for (int j=x/2+1; j>i; j--) {
                    if(i==x/2+1 || j==i+1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println("");
        }
    }
}
