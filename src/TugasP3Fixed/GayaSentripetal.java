package TugasP3;

import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan massa benda (kg): ");
        double m = sc.nextDouble();

        System.out.print("Masukkan kecepatan benda (m/s): ");
        double v = sc.nextDouble();

        System.out.print("Masukkan jari-jari lintasan (m): ");
        double r = sc.nextDouble();

        double Fc = (m * (v * v)) / r;

        System.out.println("\n=== HASIL PERHITUNGAN GAYA SENTRIPETAL ===");
        System.out.println("Massa (m)\t\t: " + m + " kg");
        System.out.println("Kecepatan (v)\t\t: " + v + " m/s");
        System.out.println("Jari-jari (r)\t\t: " + r + " m");
        System.out.println("Gaya Sentripetal (Fc)\t: " + Fc + " Newton");
        System.out.println("===========================================");
        //\t biar pas sejajar aja titik duanya
    }
}