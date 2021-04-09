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
//untuk mendeklarasikan class NewClass8
public class NewClass8 {
 //untuk mendeklarasikan binarysearch dengan masukan bertipe data 
    //integer kemudian ditentukan true atau false  
  public static boolean binarySearch(int[] x, int start, int end,int n){
      //jika end lebih besar dari start maka akan mengembalikan nilai false 
        //dengan kondisi variabel mid bertipe integer sama dengan 
        //start ditambah end dibagi 2
      if(end < start ) return false;
       int mid = (start + end)/ 2;
       
       //jika x[mid] sama dengan n maka akan bernilai true 
       if (x [mid] == n){
            return true;
            
        //dan apabila jika kondisi x[mid] lebih kecil dari n maka program akan 
            //mengeksekusi binarySearch (x, mid ditambah 1, end, n)    
      } else { 
            if (x[mid] < n){
                return binarySearch(x, mid+1, end, n);
            //dan jika kondisi tidak terpenuhi maka akan return binarySerch 
                //(x, start, mid-1, n)
            }else{
                return binarySearch(x, start, mid-1, n);
            }
        }
    }
    public static void main (String[] args) {
        //untuk memanggil myArray bertipe data integer yaitu 
            //{1,2,3,5,56,45,12,31,32,4,8,6,5,8,3,9,92,76,}
        int[] myArray = {1,2,3,5,56,45,12,31,32,4,8,6,5,8,3,9,92,76,};
        //untuk mengakses panjang myArray bertipe integer pada variabel s
        int s = myArray.length;
        int x = 12312;
        
        //untuk menampilkan atau memanggil hasil dari binarySearch 
            //(myArray, 0, s- 1, x) kemudikan program akan mngeksekusi 
                //apakah true atau false
        boolean result = binarySearch(myArray, 0, s - 1, x);
        System.out.println(result);
        }
}
    


