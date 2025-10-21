/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author Acer
 */
public class Novel {
    int banyakLembar;
    
    public Novel(int banyakLembar){
        this.banyakLembar = banyakLembar;
    }
    //method
    void waktuBikinNovel(){
        int detik, menit, jam, hari;
        detik = banyakLembar;
        hari = detik/86400;
        detik %= 86400;
        jam = detik/3600;
        detik %= 3600;
        menit = detik/60;
        detik %= 60;
        
        System.out.println("Waktu yang dibutuhkan untuk mencetak novelnya\nadalah: " 
                            + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik.");
        
    }
}
