package TugasP3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DOSDIS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nama;
        double totalBelanja, diskon, total, bayar, kembalian;

        System.out.print("Masukkan Nama: ");
        nama = br.readLine();

        System.out.print("Masukkan Total Belanja: ");
        totalBelanja = Double.parseDouble(br.readLine());

        System.out.print("Masukkan Diskon (%): ");
        diskon = Double.parseDouble(br.readLine());

        total = totalBelanja - (totalBelanja * diskon / 100);

        System.out.print("Masukkan Uang Bayar: ");
        bayar = Double.parseDouble(br.readLine());

        kembalian = bayar - total;

        // untuk simpan ke file .dat pake DOS
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataBelanja.dat"));
        dos.writeUTF(nama);
        dos.writeDouble(totalBelanja);
        dos.writeDouble(diskon);
        dos.writeDouble(total);
        dos.writeDouble(bayar);
        dos.writeDouble(kembalian);
        dos.close();

        System.out.println("\n✅ Data berhasil disimpan ke file dataBelanja.dat");

        // untuk baca file dataBelanja.dat pake DIS
        DataInputStream dis = new DataInputStream(new FileInputStream("dataBelanja.dat"));
        nama = dis.readUTF();
        totalBelanja = dis.readDouble();
        diskon = dis.readDouble();
        total = dis.readDouble();
        bayar = dis.readDouble();
        kembalian = dis.readDouble();
        dis.close();

        // untuk nampilin hasil abis DIS
        System.out.println("\n=== STRUK PEMBELANJAAN ===");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Total Belanja\t: Rp " + totalBelanja);
        System.out.println("Diskon\t\t: " + diskon + " %");
        System.out.println("Total Setelah Diskon: Rp " + total);
        System.out.println("Bayar\t\t: Rp " + bayar);
        System.out.println("Kembalian\t: Rp " + kembalian);
        System.out.println("===========================");
    }
}