/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelatihanhari2;

import java.util.ArrayList;
import java.util.List;


public class BelajarOOP {
    public static void main(String[] args) {
        Manusia mns = new Manusia();
        mns.nama = "Umar";
        mns.umur = 29;        
        mns.makan("Gudeg", "Jus");
//        System.out.println("Nama : "+mns.nama);
        
        Balita blt = new Balita();
        blt.makan("bubur", "susu");
        
        Manusia mns2 = new Manusia();
        mns2.nama = "Iyas";
        mns2.umur = 40;
        
        List<Manusia> insan = new ArrayList<>();
        insan.add(mns);
        insan.add(mns2);
        
        Manusia mnsx = insan.get(0);
        System.out.println("1. Nama "+mnsx.nama);
        System.out.println("2. Nama "+insan.get(1).nama);
        
        String name2 = mns.getName();
        System.out.println("Function "+name2);
    }
}
