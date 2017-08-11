/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelatihan.amikom;

public class PelatihanAmikom {

    public static void main(String[] args) {
        String namaPanjang = "Budiono Isron";
        double bb = 55.3;
        boolean isSingle = true;
        int umurBudi = 20;
        int umurAri = 25;

        namaPanjang = "Zuhri";
//        System.out.println("Nama saya "+namaPanjang+", Umur "+umurBudi);  

        //IF Statement 
        // || => atau
        // && => dan
        // != => tidak sama dengan
        // == => sama dengan
        if (umurBudi != 20 || umurAri <= 20) {
            System.out.println("Umur ari atau umur budi diatas 20 tahun");
        }

        //Array
        String[] names = {"Budi", "Wahyu", "Astuti", "Ilham"};
        int[] ages = {20, 19, 34, 20};

        names[0] = "Annas";
        System.out.println("Nama : " + names[0] + "\n");

        for (int i = 0; i < 4; i++) {
            System.out.print("Nama " + names[i]);
            System.out.println(", Usia " + ages[i]);
        }

    }

}
