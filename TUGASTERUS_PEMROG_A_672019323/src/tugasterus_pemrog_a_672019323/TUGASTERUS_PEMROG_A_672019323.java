/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasterus_pemrog_a_672019323;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TUGASTERUS_PEMROG_A_672019323 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("1. Matematika Nak Esdeh");
            System.out.println("2. yang ini harus mikir");
            System.out.println("3. yang ini gak tau susah apa gak");
            System.out.println("4. sayonara");
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pilihan: ");
            pilihan=input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Selamat datang di menu Matematika Nak Esdeh");
                    float angka;
                    System.out.print("Masukkan jumlah angka: ");
                    angka=input.nextInt();
                    int i;
                    int hasil=0;
                    for(i=1; i<=angka; i++) {
                        System.out.print("Masukkan Angka ke-"+i+": ");
                        hasil+=input.nextInt();
                    }
                    System.out.println("jumlah angka adalah: "+hasil);
                    System.out.println("rata-rata angka adalah: "+hasil/angka);
                    break;
                case 2:
                    int tinggi;
                    String balik;
                    System.out.println("selamat berpikir");
                    System.out.print("Masukkan Tinggi Segitiga: ");
                    tinggi=input.nextInt(); 
                    int nomor=1;
                    int spasi=tinggi-1;
                    int dot=0;
                    for (int a=1; a<=tinggi; a++) {
                        for(int b=1; b<=spasi; b++) {
                            System.out.print("  ");
                        }
                        for(int b=1; b<=nomor; b++) {
                            System.out.print(dot+" ");
                            if(dot<9) {
                                dot++;
                            } else {
                                dot=0;
                            }
                        }
                        System.out.println("");
                        if(a>0) {
                            nomor +=2;
                            spasi -=1;
                        }
                    }
                    System.out.print("ingin dibalik (Y/N): ");
                    balik=input.next();
                    int a,b;
                    nomor=1;
                    dot=9;
                    if(balik.equalsIgnoreCase("Y")) {
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
                        }
                    }
                    }
                    break;
                case 3:
                    System.out.println("Selamat berpikir");
                    System.out.print("Masukkan panjang baris: ");
                    int row=input.nextInt(); 
                    System.out.print("Masukkan panjang kolom: ");
                    int column=input.nextInt(); 
                    int[][] matriks = new int[row][column];
                    for (int r=0; r<row; r++) {
                            for (int c=0; c<column; c++) {
                                    System.out.print(String.format("masukkan indek ke-%d-%d: ", r, c));
                                    matriks[r][c] = input.nextInt();
                            }
                    }
                    System.out.println("matriks "+row+"*"+column+"anda");
                    for (int r=0; r<row; r++) {
                            for (int c=0; c<column; c++) {
                                    System.out.print(matriks[r][c]+"\t");
                            }
                            System.out.println();
                    }
                    break;
                case 4:
                    break;
                default :
                    System.out.println("selesai");
        } 
    } while(pilihan!=4);
}
}