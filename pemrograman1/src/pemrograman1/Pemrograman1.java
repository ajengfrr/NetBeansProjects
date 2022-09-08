/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Pemrograman1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //nilai awal 1
        //nilai akhir 10
        //perubahan +1
        /*int awal = 1;
        while(awal<=10) {
            System.out.println("nilai : "+awal);
            awal++;
        }*/
        
        //for(int awal=1;awal<=10;awal++) {
        //    System.out.println("nilai : "+awal);
        
        Scanner in = new Scanner(System.in);
        System.out.print("nilai awal : ");
        int awal = in.nextInt();
        System.out.print("nilai akhir : ");
        int akhir = in.nextInt();
        //int awal = 1;
        do{
            System.out.println("nilai : "+awal);
        //awal++;
        awal--;
    //}while(awal<=10);
    //}while(awal<=akhir);
    }while(awal>=akhir);
        }
}
