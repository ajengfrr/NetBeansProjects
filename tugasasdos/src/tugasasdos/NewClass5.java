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
public class NewClass5 {
    public static void main(String[] args) {
        int Number;
	Scanner input = new Scanner(System.in);
	System.out.print("enter rows:");
	Number=input.nextInt();
	input.close();
	int a=9;
        for(int i=0;i <Number;i++)
        {
        	for(int j=0;j<Number-i;j++)
        	{
        		System.out.print("  ");
        	}
        	for(int k=0;k<=i;k++)
        	{
        		System.out.print(a+"  ");
        		a -=1;
        	}
        	System.out.print("\n");
        }
    }
}
