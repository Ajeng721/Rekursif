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
//mendeklarasikan class NewClass6
public class NewClass6 {
    public static void main(String[] args) {
        //untuk menampilkan/memanggil test ("01101",4)!
        System.out.println(test("01101", 4));
    }

    public static int test (String s, int last) {
        //jika variabel last kurang dari 0 maka akan mengembalikan nilai 0 
            //dan program berakhir dengan normal
        if (last < 0) {
           return 0; 
        }
        //jika (s.charAt(last) sama dengan 0 maka akan mengembalikan nilai 2
            //dikali (test(s, last - 1) 
        if(s.charAt(last) == 0) {
            return 2 * test(s, last - 1);
        }
        //akan mengeksekusi program dengan mengembalikan nilai 1 ditambah 2 
            //dikali test(s, last-1)
        return 1 + 2 * test(s, last-1);
        }
    }
    

