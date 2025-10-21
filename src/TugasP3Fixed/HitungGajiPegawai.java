package TugasP3;

import java.util.Scanner;

public class HitungGajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nikr,nama,alamat,jabatan;
        int gapok,tunjab,tunis,tunak;
        System.out.print("Masukkan Nomor Induk Karyawan: ");
        nikr = input.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        alamat = input.nextLine();
        System.out.print("Masukkan Jabatan: ");
        jabatan = input.nextLine();
        System.out.print("Masukkan Gaji Pokok: ");
        gapok = input.nextInt();
        System.out.print("Masukkan Tunjangan Jabatan: ");
        tunjab = input.nextInt();
        System.out.print("Masukkan Tunjangan Istri: ");
        tunis = input.nextInt();
        System.out.print("Masukkan Tunjangan Anak: ");
        tunak = input.nextInt();
        
        int total = gapok + tunjab + tunis + tunak;
        double pajak = 0.1 * (gapok + tunjab + tunak);
        double gajiBersih = total-pajak;
        
        System.out.println("Total Gaji: " + total );
        System.out.println("Pajak Penghasilan: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
        
        
    }
}
