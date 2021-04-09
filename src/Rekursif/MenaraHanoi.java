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
//mendeklarasikan Class MenaraHanoy
public class MenaraHanoi {
    //membuat fungsi dengan nama Pindah yang menerima masukkan berupa integer dan char
    public static void Pindah(int disc, char pasak1, char pasak2, char Media){
        //jika variabel disc sama dengan 0 maka akan mengembalikan nilai
        if(disc==0){
            return ;
        //dan jika kondisi tidak terpenuhi maka akan menampilkan "Pindahkan disc "
            //ditambah disc " dari pasak " ditambah pasak1 ditambah " ke pasak " ditambah pasak2
        }else{
            Pindah(disc -1, pasak1, pasak2,Media);
            System.out.println("Pindahkan disc "+disc+" dari pasak "+pasak1+" ke pasak "+pasak2);
            Pindah(disc -1, Media, pasak2, pasak1);
        }
    }
     public static void main(String[] args){
         //untuk meng ccan input an
         Scanner input = new Scanner(System.in);
         //untuk menampilkan output "Jumlah Disk" dengan inputan data bertipe integer 
            //maka akan menampilkan hasil nya
         System.out.println("Jumlah Disk");
         int n = input.nextInt();
                 Pindah(n, 'A', 'B', 'C');         
     }           
}

