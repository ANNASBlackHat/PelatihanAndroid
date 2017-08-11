/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelatihanhari2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Git Solution
 */
public class PelatihanHari2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = {"Wahyu","Ali"};
        System.out.println("name "+names[0]);
                
        List<String> students = new ArrayList<>();
        students.add("Bill Gate");
        students.add("Steve Job");
        students.remove(1);     
        students.add(0, "Budi");
        System.out.println("name "+students.get(0));
    }
    
}
