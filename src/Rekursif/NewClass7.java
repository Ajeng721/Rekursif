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
//mendeklarasikan class NewClass7
public class NewClass7 {
    public static void main(String[] args) {
        //mendeklarasikan variabel dengan nama myArray 
            //bertipe data integer yaitu{1,2,3,4,5,6,7,78,8}
        int[] myArray = {1,2,3,4,5,6,7,78,8};
        //untuk menampilkan (search(myArray, myArray.length, 100)
        System.out.println(search(myArray, myArray.length, 100));
        
    }
    //untuk mendeklarasikan search dengan masukan bertipe 
        //data integer kemudianditentukan true atau false
    public static boolean search(int[] x, int size, int n) {
        //jika variabel size lebih besar dari 0,  
            //dan x[size-1] sama dengan nmaka akan bernilai TRUE
        if( size > 0){
            if (x[size-1] == n) {
                return true;
                
            //dan jika kondisi tidak terpenuhi atau size bukan lebih dari
                // 0 tetapi (x, size-1, n) maka akan bernilai FALSE
            }else{
                return search (x, size-1, n);
            }
        }
        return false;
            }
        }    