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
//mendeklarasikan class NewClass9
public class NewClass9 {
    //untuk mendeklarasikan fungsi berrtipe data integer dengan nama mystery
        // dengan menerima masukan integer a dan b
    public static int mystery(int a, int b){
        // jika b sama dengan 0 maka akan mengembalikan nilai 0 dan program 
            //akan berakhir normal
        if(b == 0) return 0;
        //dan jika b % 2 sama dengan 0 maka akan mengembalikan nilai 
            //mysteri (a+a, b/2)
        if(b % 2 == 0) return mystery(a+a, b/2);
        //maka program akan mengeksekusi atau mngembalikan nilai mysteri 
            //(a ditambah a, b dibagi 2) ditambah a
        return mystery(a+a, b/2) + a;
    }
    
    public static void main(String[] args) {
        //untuk menampilkan/ memanggil mysteri (3, 11) 
        System.out.println(mystery(3, 11));
    }
}

