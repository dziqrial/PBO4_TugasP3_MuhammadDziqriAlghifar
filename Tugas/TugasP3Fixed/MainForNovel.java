package TugasP3;
import java.util.Scanner;
public class MainForNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan banyak novel yang akan dicetak: ");
        angka = input.nextInt();
        Novel[] banyakNovel = new Novel[angka];
        for (int i = 0; i < angka; i++) {
            System.out.print("Banyak lembar novel ke " + (i+1) + ": ");
            int banyak = input.nextInt();
            banyakNovel[i] = new Novel(banyak);
            banyakNovel[i].waktuBikinNovel();
        }
        
    }    
}
