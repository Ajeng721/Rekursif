/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

import java.util.Scanner;

/**
 *
 * @author ajengnur
 */
public class segitiga {
    public static long Bil_Pascal(int n){

        long z =1;
        int i = 1;
        while(i <= n){
        z=z*i;
        i++;
    }

    return z;
  }
  public static void main(String[] args){

    int a, i, j;
    int batas = 6;
    int spasi = batas;
    
    Scanner scan = new Scanner(System.in);
    System.out.print("== Bilangan Pascal == \n ");
    a = scan.nextInt();

    for (i=0; i<a; i++){
        System.out.print("F" + (i + 1));
        for (j=0; j<a-i-1; j++){
        System.out.print(" ");
      }
      for (j=0; j<=i; j++){
        System.out.print(Bil_Pascal(i)/(Bil_Pascal(j)*Bil_Pascal(i-j))+" ");
      }
      System.out.println(" ");
      spasi--;
    }
}
}
