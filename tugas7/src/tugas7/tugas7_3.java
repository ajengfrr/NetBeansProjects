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
public class tugas7_3 {
    public static void main(String[] args) {
        int x=11;
        int y=11;
        for(int i=1;i<=x;i++) {
            for(int j=1;j<=y;j++) {
                if(i==1 || i==11 || j==1 || j==11 || j==6 || j==i || i==11-j+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
