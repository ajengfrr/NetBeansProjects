/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tas_a_672019323;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TaS_A_672019323 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilihan;
        do {
            System.out.println("TEST AKHIR PEMROGRAMAN ASISTEN");
            System.out.println("1. tukar huruf");
            System.out.println("2. putar matriks");
            System.out.println("3. pinjaman bunga per bunga");
            System.out.println("4. keluar");
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pilihan: ");
            pilihan=input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("masukkan huruf : ");
                    String huruf = input.nextLine();
                    
                    break;
                case 2:
                    System.out.print("Masukkan panjang baris: ");
                    int row=input.nextInt(); 
                    System.out.print("Masukkan panjang kolom: ");
                    int column=input.nextInt(); 
                    int[][] matriks = new int[row][column];
                    for (int r=0; r<row; r++) {
                            for (int c=0; c<column; c++) {
                                    System.out.print(String.format("m[%d][%d]: ", r, c));
                                    matriks[r][c] = input.nextInt();
                            }
                    }
                    System.out.print("masukkan jumlah putaran : ");
                    int putaran = input.nextInt();
                    
                    break;
                case 3:
                    System.out.println("Layanan Peminjaman Bunga Berbunga");
                    System.out.println("Daftar Bunga Pinjaman");
                    System.out.println("1. Pinjaman < Rp. 1000000 ===> 0% per bulan");
                    System.out.println("2. Pinjaman antara 1000000 sampai 2000000 ===> 2% per bulan");
                    System.out.println("3. Pinjaman antara 2000000 sampai 5000000 ===> 3% per bulan");
                    System.out.println("4. Pinjaman lebih dari 5000000 ===> 5%");
                    System.out.print("Masukkan Besar Pinjaman : ");
                    int pinjam = input.nextInt();
                    System.out.print("Masukkan Lama Pinjaman : ");
                    int lama = input.nextInt();
                    int cicil;
                    int hasil=pinjam/lama;
                    if (pinjam<1000000) {
                        for(int i=0; i<lama; i++) {
                            cicil=hasil+(pinjam*0/100);
                            System.out.println("Cicilan bulan ke "+i+" : "+cicil);
                            pinjam=pinjam-hasil;
                        } System.out.println("Total Semua Hutang setelah dibayar adalah Rp.");
                    } if (pinjam>=1000000 && pinjam<2000000) {
                        for(int i=0; i<lama; i++) {
                            cicil=hasil+(pinjam*2/100);
                            System.out.println("Cicilan bulan ke "+i+" : "+cicil);
                            pinjam=pinjam-hasil;
                        } System.out.println("");
                    } if (pinjam>=2000000 && pinjam<5000000) {
                        for(int i=0; i<lama; i++) {
                            cicil=hasil+(pinjam*3/100);
                            System.out.println("Cicilan bulan ke "+i+" : "+cicil);
                            pinjam=pinjam-hasil;
                        } System.out.println("");
                    } if (pinjam>=5000000) {
                        for(int i=0; i<lama; i++) {
                            cicil=hasil+(pinjam*5/100);
                            System.out.println("Cicilan bulan ke "+i+" : "+cicil);
                            pinjam=pinjam-hasil;
                        } System.out.println("");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.print("salah input!");
            }
        } while(pilihan!=4);
    }   
}