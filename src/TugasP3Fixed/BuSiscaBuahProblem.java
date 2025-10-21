package TugasP3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuSiscaBuahProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mangga, jambu, manggaBusuk, totalAwal, totalBaru;
        System.out.print("Masukkan jumlah buah mangga yang dibeli: ");
        mangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah buah jambu yang diberikan ke tiap tetangga(total 4 tetangga): ");
        jambu = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah mangga yang busuk: ");
        manggaBusuk = Integer.parseInt(br.readLine());
        
        jambu *= 4;
        //buat ngitung total awal sama total baru banyak buah
        totalAwal = mangga + jambu;
        totalBaru = totalAwal - manggaBusuk;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total buah awal dibeli : " + totalAwal + " pcs");
        System.out.println("Jumlah mangga busuk    : " + manggaBusuk + " pcs");
        System.out.println("Total buah setelah retur: " + totalBaru + " pcs");
        System.out.println("===========================");
    }
}
