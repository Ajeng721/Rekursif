/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author ajengur
 */
// untuk mendeklarasikan class Rekursif
public class Rekursif1 {
    //Membuat fungsi bernama dectobin yang menerima masukan num
        //yang bertipe data integer
    public static void dectobin(int num) {
        //jika num lebih lebar dari 0, maka program dectobin akan mengeksekusi 
            //num dibagi 2 kemudian print
        if (num > 0) {
            dectobin (num / 2);
            System.out.println (num % 2);
        }
        }
    public static void main (String[] args) {
        dectobin(8);
    }
}
