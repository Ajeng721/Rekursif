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
//mendeklarasikan class Coba5Pangkat
public class Coba5Pangkat {
    //membuat fungsi dengan pangkat rekursif bertipe integer dan 
        //  menerima masukkan berupa integer x dan integer y
    public static int pangkatrekursif(int x, int y) {
        //jika cek kondisi variabel y sama dengan 0 maka akan menembalikan nilai 1
        if (y==0)
            return 1 ;
        // dan apabila nilai variabel y bukn 0 maka x akan dipangkatkan dengan (x, y-1)
        else return x * pangkatrekursif (x, y-1);
    }
    public static void main(String[] args) {
        //untuk menampilkan output "Bilangan x pangkat y : "
        System.out.println("Bilangan x pangkat y : ");
        //untuk meng scan input an
        Scanner input = new Scanner (System.in);
        //untuk menampilkan output "Bilangan x : " yaitu x bertipe data integer
        System.out.println("Bilangan x : ");
        int x = input.nextInt();
        //untuk menampilkan output "Bilangan y : " yaitu y bertipe data integer
        System.out.println("Bilangan y : ");
        int y = input.nextInt() ;
        
        //untuk menampilkan output hasil yaitu x dipangkatkan sama dengan hasilnya
        System.out.println(x + " dipangkatkan " + y + " = " + pangkatrekursif (x, y));       
    }
}

