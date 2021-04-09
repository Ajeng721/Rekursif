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
//mendeklarasikan class Kobinasi 
public class Kombinasi {
       //Membuat fungsi bernama Kombinasi menerima masukkan berupa string yang
        //diberi nama variable x dan integer yang diberi nama variable b dan c
       public static void Kombinasi(String x, int b, int c){
        //jika cek kondisi variabel b sama dengan 0 maka akan menampilkan x ditambah ""
        if(b==0)
            System.out.print(x+" ");
        // dan apabila bukan sama dengan 0 maka i bertipe integer maka akan menampilkan
            // kombinasi karakter x ditambah dengan i betipe char, b-11, c
        else
            for (int i = 97; i< 97+c; i++)
                Kombinasi(x+(char) i, b-1, c);       
}
public static void main(String[] args){
    //untuk menampilkan output "Masukkan Jumlah Karakter: "
    System.out.print("Masukkan Jumlah Karakter: ");
    //untuk meng scan input an yaitu variable r bertipe data integer
    Scanner inp = new Scanner (System.in);
    int r = inp.nextInt();
    //untuk menampilkan kombinasi karakter
    Kombinasi(" ", r, r);
    //untuk menampilkan line baru
    System.out.println("");
}
}
        