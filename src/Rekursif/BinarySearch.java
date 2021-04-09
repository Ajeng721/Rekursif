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
//mendeklarasikan class BinarySearch
public class BinarySearch {
    //untuk mendeklarasikan fungsi berrtipe data integer dengan nama BinarySearch
        // dengan menerima masukan integer
    public static int BinarySearch (int [] a, int b, int c) {
    //jika cek kondisi variabel c lebih kecil 0 maka akan menembalikan nilai -1
    if (c < 0)
        return -1;
    //dan jika variable [c] sama dengan b maka akan menembalikan nilai c
    else if (a[c] == b)
        return c;
    //dengan return/mengembalikan nilai BinarySearch (a, b, c-1)
    else 
        return BinarySearch(a, b, c-1);
}
    //untuk mendeklarasikan fungsi berrtipe data integer dengan nama Searchdata
        // dengan menerima masukan integer
    public static int Searchdata (int[]  a, int b) {
        //mengembalikan nilai BinarySearch yaitu (a, b, a.length -1)
        return BinarySearch(a, b, a.length -1);
    }
    public static void main (String[] args ){
        //menampilkan variabel angka bertipe data integer yaitu 
            //{2,5,8,10,14,32,35,41,67,88,90,101,108}
        int[] angka =  {2,5,8,10,14,32,35,41,67,88,90,101,108};
        //menampilkan " Data : " di output
        System.out.print(" Data : ");
        //jika variabel i bertipe integer sama dengan 0, i lebih kecil dari angka.lenght; 
            //dengan ampilkan nilai i, lalu tambah i sebanyak 1 angka
        for (int i = 0; i < angka.length; i++)
            //menampilkan output "" ditambah angka[1]
            System.out.print(" "+ angka[i]);
        //menampilkan output "\nData yang dicari 10"
        System.out.println("\nData yang dicari 10");
        int nilai = Searchdata(angka, 10);
        
        //jika variabel nilai lebih besar sama dengan 0 maka akan menampilkan output
            // "Data yang dicari 10 ditambah ditemukan pada indeks ke ditambah nilai
        if (nilai >= 0) {
            System.out.println("Data "+10+" ditemukan pada index ke "+nilai);
          //dan jika kondisi tidak terpenuhi maka akan tampil "Data tidak ditemukan"
        } else 
            System.out.println ("Data tidak ditemukan");
        }
    }   
