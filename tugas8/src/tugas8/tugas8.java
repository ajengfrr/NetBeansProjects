/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tugas8 {
    public static void main(String[] args) throws IOException { 
    String nama;
    String opsi;
    Scanner inputUser = new Scanner(System.in);

    FileWriter fileWriter1 = new FileWriter("dokumen1.txt");
    FileReader fileReader = new FileReader("dokumen1.txt");

    System.out.println("Tugas 8\n-------\n");
    System.out.print("Masukkan input : ");
    nama = inputUser.nextLine();
    nama = ubahKeTitlecase(nama);

    fileWriter1.write(nama);
    fileWriter1.flush();

    Scanner sc = new Scanner(System.in);
    System.out.println("Apakah ingin copy data??? (Y/T)  ");
    opsi = sc.next();

    if(opsi.equalsIgnoreCase("Y")){
      int i;
      FileWriter fileWriter2 = new FileWriter("dokumen2.txt");
      FileWriter fileWriter3 = new FileWriter("dokumen3.txt");
      FileWriter fileWriter4 = new FileWriter("dokumen4.txt");
      while((i=fileReader.read()) != -1){
        fileWriter2.write((char)i);
        fileWriter3.write((char)i);
        fileWriter4.write((char)i);
      }
      fileWriter2.flush();
      fileWriter3.flush();
      fileWriter4.flush();
      System.out.println("\nData berhasil disimpan dan dicopy");
    } else if(opsi.equalsIgnoreCase("T")){
      System.out.println("\nData berhasil disimpan");
    } else{
      System.out.println("Opsi yang anda pilih tidak tersedia");
    }
  }

  public static String ubahKeTitlecase(String text){
    StringBuilder builder = new StringBuilder();
    boolean convertNext = true;
    for(char kar : text.toCharArray()){
      if(Character.isSpaceChar(kar)){
        convertNext = true;
      } else if(convertNext){
        kar = Character.toTitleCase(kar);
        convertNext = false;
      } 
      builder.append(kar);
    }
    return builder.toString();
  }
}
