/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;
/**
 *
 * @author ajengnur
 */
public class Coba4Karakter {
     //Membuat fungsi bernama CharCombination menerima masukkan 
        //berupa string yang diberi nama variable a dan integer 
        //yang diberi nama variable n
    public static void CharCombination (String a, int n) {
        //jika cek kondisi nilai variable n adalah 0 maka 
            // akan menampilkan outputa ditambah dengan " "
        if (n==0)
            System.out.print(a+" ");
        // dan jika bukan sama dengan 0 maka i bertipe
            //  integer maka akan menampilkan kombinasi 
            //karakter a ditambah dengan i betipe char, n-1
        else 
            for (int i = 97; i < 99 ; i++)
                CharCombination(a+(char)i, n-1);
    }
    public static void main(String[] args) {
        //untuk menampilkan kombinasi karakter " " 
            //dengan jumlah 2 karakter
        CharCombination ("", 2);        
    }
}

