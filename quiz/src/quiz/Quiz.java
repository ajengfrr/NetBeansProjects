/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int awal = 1;
        int akhir = in.nextInt();
        do {
            System.out.println(awal+"*"+akhir);
            awal++;
            akhir--;
        }while(1<=akhir);
    }
    
}
