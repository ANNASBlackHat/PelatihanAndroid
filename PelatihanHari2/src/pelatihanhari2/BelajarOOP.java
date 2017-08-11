/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelatihanhari2;


public class BelajarOOP {
    public static void main(String[] args) {
        Manusia mns = new Manusia("Ilham"); 
        mns.nama = "Umar";
        mns.umur = 29;        
        mns.makan("Gudeg", "Jus");
        System.out.println("Nama : "+mns.nama);
    }
}
