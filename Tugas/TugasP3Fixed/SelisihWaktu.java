package TugasP3;

import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input waktu pertama (jam, menit, detik)
        System.out.println("=== Waktu Pertama ===");
        System.out.print("Jam   : ");
        int jam1 = input.nextInt();
        System.out.print("Menit : ");
        int menit1 = input.nextInt();
        System.out.print("Detik : ");
        int detik1 = input.nextInt();

        // input waktu kedua (jam, menit, detik)
        System.out.println("\n=== Waktu Kedua ===");
        System.out.print("Jam   : ");
        int jam2 = input.nextInt();
        System.out.print("Menit : ");
        int menit2 = input.nextInt();
        System.out.print("Detik : ");
        int detik2 = input.nextInt();
        // buat ke detik dulu
        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        // Hitung selisih detik (pakai Math.abs biar hasil positif)
        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        int selisihJam = selisihDetik / 3600;
        selisihDetik %= 3600;
        int selisihMenit = selisihDetik / 60;
        selisihDetik %= 60;

        System.out.println("\n=== HASIL PERHITUNGAN SELISIH WAKTU ===");
        System.out.println("Selisih: " + selisihJam + " jam " + selisihMenit + " menit " + selisihDetik + " detik");

    }
}