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
public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fakultas;
        System.out.print("Masukkan pilihan :");
        fakultas=input.nextInt();
        switch (fakultas) {
            case 67:
                System.out.println("TI");
                break;
            case 68:
                System.out.println("SI");
                break;
            case 69:
                System.out.println("DKV");
                break;
            default:
                System.out.println("Bukan FTI");
        }
        System.out.println("Baris Perintah Berikutnya");
    }
}
