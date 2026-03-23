/* Nama File    : MManusia.java
 * Deskripsi    : berisi aplikasi method dalam class Manusia, PNS, Pengusaha, Petani
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 22 Maret 2025
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        /* Membuat Objek */
        PNS p1 = new PNS("Satrio", LocalDate.of(2006, 4, 1), "Jl. Seroja", 1500000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 3, 9), "Jl. Bunga 9 Tembalang", 500000, "Wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), "Alamat Awal", 1000000, "198004212010041002");

        /* Update data */
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        /* Counter : Menghitung objek yang dibuat */
        System.out.println("\n=== COUNTER OBJEK ===");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        /* Menghitung Pajak */
        System.out.println("\n=== PAJAK ===");
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("Pajak PNS p2 = " + p2.hitungPajak());

        /* Menghitung Masa Kerja */
        System.out.println("\n=== MASA KERJA ===");
        System.out.println("Masa Kerja PNS p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja Pengusaha pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja Petani pt1 = " + pt1.hitungMasaKerja());
        System.out.println("Masa Kerja PNS p2 = " + p2.hitungMasaKerja());

        /* Menampilkan detail objek */
        System.out.println("\n=== DETAIL PNS 1 ===");
        p1.cetakInfo();

        System.out.println("\n=== DETAIL PNS 2 ===");
        p2.cetakInfo();

        System.out.println("\n=== DETAIL PENGUSAHA ===");
        pe1.cetakInfo();

        System.out.println("\n=== DETAIL PETANI ===");
        pt1.cetakInfo();
    }
}
