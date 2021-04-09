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
//mendeklarasikan class NewClass11
public class NewClass11 {
    //membuat fungsi ex234 bertipe string dengan masukan bertipe data int n
    public static String ex234(int n){
        //jika n lebih kecil sama dengan 0 makan akan mengembalikan nilai " "
        if(n<= 0) return "";
        
        //kemudian akan mengembalikan nilai ex234(n-3) ditambah n ditambah ex234(n-2)
            //ditambah n
        return ex234(n-3) + n + ex234(n-2) + n;
    }
    //untuk memanggil (ex234(6)
    public static void main(String[] args) {
        System.out.println(ex234(6));
    }
}

