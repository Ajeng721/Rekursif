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
//Mendeklarasikan class coba3Prima
public class Coba3Prima {
    //membuat fungsi dengan ambilNilaiRekursif bertipe integer dan 
    //  menerima masukkan berupa integer
   private static int ambilNilaiRekursif(int number, int index){
       //jika cek kondisi nilai variable index adalah 1 maka mengembalikan nilai 1
       if (index == 1) {
           return 1;
       }
       //dan jika cek kondisi variabel number % index sama dengan 0 maka akan mengembalikan
        // nilai 1 dan akan melakukan operasi rekursif dengan ditambah operasi 
        //rekursif dengan index dikurangi 1 angka kemudian akan menampilkan hasilnya 
       else if (number % index == 0) {
           return 1 + ambilNilaiRekursif(number, --index);
           
           //dan jika cek kondisi variabel number % index bukan sama dengan 0 maka akan mengembalikan
            // nilai 0 dan akan melakukan operasi rekursif dengan ditambah operasi 
            //rekursif dengan index dikurangi 1 angka kemudian akan menampilkan hasilnya
       } else {
           return 0 + ambilNilaiRekursif(number, --index);
       }
   }
   //untuk mengecek bilangan prima yang betipe integer apakah true atau false
   public static boolean cekBilanganPrima(int num){
       //jika num lebih dari 1 maka akan mengembalikan nilai sama dengan 2 dengan operasi rekursif (true)
       if (num > 1) {
           return (ambilNilaiRekursif(num, num) == 2);
       }
       // dan jika tidak mengembalikan nilai sama dengan 2 maka adalah false
       else
           return false;
   }
    public static void main(String[] args) {
        //untuk meng scan input an
        Scanner input = new Scanner (System.in);
        //untuk menampilkan output "Masukkan Bilangannya: " dengan input an bertipe data integer
        System.out.print("Masukkan bilangannya : ");
        int num = input.nextInt();
        
        //untuk mengecek num merupakan bilangan prima atau bukan bilangan prima
        if (cekBilanganPrima(num)) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");                    
        }
    }
} 
    

