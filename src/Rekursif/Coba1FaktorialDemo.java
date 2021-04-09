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
//membuat class dengan nama FaktorialRekursif
public class Coba1FaktorialDemo {
    //membuat fungsi dengan nama faktorial bertipe integer dan 
    //  menerima masukkan berupa integer
    public static int faktorial(int x) {
        //jika cek kondisi nilai variable x adalah 1 maka mengembalikan nilai x
        if (x==1)
           return x ;
        //kemudian jika  jika nilai variable x bukan 1  maka akan melakukan  
            //rekursif dengan nilai x dikalikan dengan hasil faktorial x-1 
       else
           return x * faktorial(x-1);
    }
    public static void main(String[] args) {
        //untuk meng scan input an
        Scanner input = new Scanner(System.in);
        //untuk menginputkan N faktorial bertipe integer
        System.out.println("N = ");
        int n = input. nextInt();
        //menampilkan nilai dari variable hasil faktorial
        System.out.println("Hasil = " + faktorial(n));                
        }       
    }