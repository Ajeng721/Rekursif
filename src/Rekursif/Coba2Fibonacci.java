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
public class Coba2Fibonacci {
    //Membuat fungsi bernama fibbon yang bertipe integer dan  
        //menerima masukkansebuah integer yang diberi nama variable n
    public static int fibbon(int x) {
        //Cek kondisi jika nilai dari variable n adalah 0 atau 1 maka 
            //akan mengembalikan nilai n
        if (x<=0 || x<=1)
            return x;
        //Jika variable n bernilai selain 0 dan 1 maka akan melakukan operasi 
            //rekursif dimana hasil operasi fibonacci n-1 ditambah 
            //dengan hasil operasi fibonacci n-2
        else
            return fibbon(x-2) + fibbon(x-1);
    }
    public static void main(String[] args) {
        //melakukan perulangan sebanyak nilai n yaitu sama dengan 10 
            //dan menginputkan nilai i kedalam fungsi fibonacci 
            //serta menampilkan hasil operasi fibonacci
        int n = 10 ;
        for (int i = 0; i < n; i++)
            System.out.println("f" + i + "=" + fibbon(i));
        
    }        
}

