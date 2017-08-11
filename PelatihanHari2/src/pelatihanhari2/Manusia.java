/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelatihanhari2;


public class Manusia {
    String nama;
    int umur;  
    
    public Manusia(){
        
    }
    
    public Manusia(String nama){
        System.out.println("ini constructor, "+nama);
    }
    
    public void makan(String makanan, String minuman){
        System.out.println("Makan "+makanan);
        System.out.println("Minum "+minuman);
    }
    
    
}
