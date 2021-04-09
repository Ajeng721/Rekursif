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
//mendleklarasikan class NewClass10
public class NewClass10 {
    //untuk mendeklarasikan gcdLike dengan masukan bertipe data
        //integer untuk p, q kemudian ditentukan true atau false
    public static boolean gcdLike(int p, int q){
        //jika q sama dengan 0 maka akan mengembalikan nilai p sama dengan 1
        if (q == 0) return ( p == 1);
        //akan mengeksekusi gcdLike (q,p% q)
        return gcdLike(q,p% q);
    }
    public static void main(String[] args) {
        //akan melakukan print gcdLike (1, 0)
        System.out.println(gcdLike (1, 0));
    }        
}

