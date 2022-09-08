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
public class NewClass1 {
    public static void main(String[] args) {
        /*int sisi=;
        int space=;
        int star=;
        for(int i=1; i<=sisi-4; i++)
            for(int j=1;j<=2;j++) {
                if(j==1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } 
        //pyramid
        for(int j=1;j<=space;j++) {
            System.out.print("  ");
        }
        for(int j=1;j<=star;j++) {
            System.out.print("* ");
        }
        for(int j=1;j<=space;j++) {
            System.out.print("  ");
        }
        //garis
        for(int j=1;j<=2;j++) {
            if(j==1) {
                System.out.print("  ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
        if(i<sisi/2-1) {
            star -=2;
            space +=1;
        } else if(i>=sisi/2-1) {
            star +=2;
            space -=1;
        } */
        
        int rows=9;
        int column=9;
        int left=1;
        int right=9;
        for(int i=1; i<=rows; i++) {
            System.out.print("+ ");
            for(int j=1; j<=column; j++) {
                if(j>left && j<right) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            if(i<5) {
                left +=1;
                right -=1;
            } else if (i>4) {
                left -=1;
                right +=1;
            } System.out.print("+ ");
            System.out.println(); 
        }
    }
}
