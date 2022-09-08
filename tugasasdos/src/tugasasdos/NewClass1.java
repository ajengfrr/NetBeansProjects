/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasasdos;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NewClass1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //Scanner class in java
        System.out.print("Enter the rows you want :");
        int rows=sc.nextInt();
        System.out.println(" ");
        int i,j,k,l=1;
        for(i=1; i<=rows; i++ ){
            for(j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(k=1; k<=i; k++,l++){
                System.out.print(l+" ");
            }
            System.out.println(" ");
        }
    }
}
