/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam abstrack class Manusia
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 22 Maret 2025
 */

import java.time.LocalDate;

public abstract class Manusia {
    /**********************ATRIBUT**********************/
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public Manusia(){
        counterMns++;
    }

    /* Konstruktor dengan parameter */
    public Manusia(String Nama, LocalDate Tgl_Kerja, String alamat, double pendapatan){
        this.nama = Nama;
        this.tgl_mulai_kerja = Tgl_Kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /* Mengembalikan nilai nama */
    public String getNama(){
        return nama;
    }

    /* Mengeset nilai nama */
    public void setNama(String nama){
        this.nama = nama; 
    }

    /* Mengembalikan nilai tanggal mulai kerja */
    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja; 
    }

    /* Mengeset nilai tanggal mulai kerja */
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja; 
    }

    /* Mengembalikan nilai alamat */
    public String getAlamat(){
        return alamat; 
    }

    /* Mengeset nilai alamat */
    public void setAlamat(String alamat){
        this.alamat = alamat; 
    }

    /* Mengembalikan nilai pendapatan */
    public double getPendapatan(){
        return pendapatan;
    }

    /* Mengeset nilai pendapatan */
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan; 
    }

    /* Menghitung berapa banyak objek manusia yang dibuat */
    public static int getCounterMns(){
        return counterMns;  
    }

    /* Menampilkan detail manusia */
    public void cetakInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal mulai kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }

    /* Abstrack method untuk menghitung masa kerja */
    public abstract int hitungMasaKerja();
}
