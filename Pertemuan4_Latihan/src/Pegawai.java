/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai 
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 15 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    /**********************ATRIBUT**********************/
    private String NIP; 
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt; 
    private double gajiPokok; 

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter  */
    public Pegawai(){

    }

    /* Konstruktor dengan parameter */
    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama; 
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok; 
    }

    /* Mengembalikan nilai NIP */
    public String getNIP(){
        return NIP;
    }

    /* Mengeset nilai NIP */
    public void setNIP(String nip){
        this.NIP = nip; 
    }

    /* Mengembalikan nilai nama */
    public String getNama(){
        return nama; 
    }

    /* Mengeset nilai nama */
    public void setNama(String Nama){
        this.nama = Nama; 
    }

    /* Mengembalikan nilai tanggal lahir */
    public LocalDate getTglLahir(){
        return tanggalLahir;
    }

    /* Mengeset nilai tanggal lahir */
    public void setTglLahir(LocalDate tglLahir){
        this.tanggalLahir = tglLahir; 
    }

    /* Mengembalikan nilai tmt */
    public LocalDate getTMT(){
        return tmt;
    }

    /* Mengeset nilai tmt */
    public void setTMT(LocalDate TMT){
        this.tmt = TMT; 
    }

    /* Mengembalikan nilai gaji pokok */
    public double getGajiPokok(){
        return gajiPokok;
    }

    /* Mengeset nilai gaji pokok */
    public void setGajiPokok(double GajiPokok){
        this.gajiPokok = GajiPokok; 
    }

    /* Mengehitung masa kerja yang dimiliki pegawai */
    public String hitungMasaKerja() {
        Period masaKerja = Period.between(tmt, LocalDate.now());
        int tahun = masaKerja.getYears();
        int bulan = masaKerja.getMonths();
        return tahun + " tahun " + bulan + " bulan";
    }

    /* Menampilkan detail pegawai */
    public void printInfo(){
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT : " + tmt);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Gaji Pokok : Rp." + gajiPokok);
    }

}
