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
public class NewClass4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi;
        System.out.print("Masukkan Tinggi Segitiga: ");
        tinggi=input.nextInt(); 
        int nomor=1, a, b;
        //int spasi=tinggi-1;
        int dot=9;
        for (a=1; a<=tinggi; a++) {
            for(b=1; b<=tinggi-a; b++) {
                System.out.print("  ");
            }
            for(b=1; b<=nomor; b++) {
                System.out.printf(dot+" ");
            if(dot>=1) {
                dot--;
            } else {
                dot=9;
            }
            }
        System.out.println("");
        if(a>=1) {
            nomor +=2;
            //spasi -=1;
        }
        }
    }
}
