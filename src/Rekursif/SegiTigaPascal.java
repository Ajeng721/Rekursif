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
//membuat kelas dengan nama segitiga pascal
public class SegiTigaPascal {
    // mendeklarasikan fungsi faktorial Bil_Pascal bertipe long yang menerima 
        //masukkan berupa integer n
    public static long Bil_Pascal(int n){
        //mendeklarasikan variable z  bernilai 1
        long z =1;
        //mendeklarasikan variable  i  bernilai 1
        int i = 1;
        //melakukan perulangan sebanyak n dan melakukan faktorial terhadap nilai n
        while(i <= n){
        z=z*i;
        i++;
    }
    //untuk mengembalikan nilai z
    return z;
  }
  public static void main(String[] args){
    //mendeklarasikan variable a, i, dan j dimana variable a digunakan untuk 
      //jumlah tingkat segitiga pascal, dan variable i dan j untuk melakukan perulangan
    int a, i, j;
    //mendeklarasikan batans nilai sama dengan 6
    int batas = 6;
    //mendeklarasikan untuk memberi spasi setiap nilai sama dengan batas
    int spasi = batas;
    
    //menginput nilai bertipe integer kedalam variable a
    Scanner scan = new Scanner(System.in);
    System.out.print("== Bilangan Pascal == \n ");
    a = scan.nextInt();
    
    //melakukan perulangan sebanyak nilai a
    for (i=0; i<a; i++){
        System.out.print("F" + (i + 1));
        // melakukan perulangan sebanyak hasil operasi nilai a dikurang nilai i 
            //dikurang satu untuk membuat spasi
        for (j=0; j<a-i-1; j++){
        System.out.print(" ");
      }
      //melakukan perulangan untuk menampilkan hasil operasi faktorial bil.pascal  
        //nilai i dibagi dengan hasil faktorial j dikali hasil faktorial i-j
      for (j=0; j<=i; j++){
        System.out.print(Bil_Pascal(i)/(Bil_Pascal(j)*Bil_Pascal(i-j))+" ");
      }
      //untuk menampilkan line baru
      System.out.println(" ");
      spasi--;
    }
  }
}
