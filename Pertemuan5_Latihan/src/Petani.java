/* Nama File    : Petani.java
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 22 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    /**********************ATRIBUT**********************/
    private String asal_kota;
    private static int counterPetani = 0; 

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public Petani(){
        counterPetani++;
    }

    /* Konstruktor dengan parameter */
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota; 
        counterPetani++;
    }

    /* Mengembalikan nilai asal kota */
    public String getAsal_Kota(){
        return asal_kota;
    }

    /* Mengeset nilai asal kota */
    public void setAsal_Kota(String asal_kota){
        this.asal_kota = asal_kota; 
    }

    /* Menghitung objek Petani yang dibuat */
    public static int getCounterPetani(){
        return counterPetani;
    }

    /* Menghitung masa kerja petani */
    @Override
    public int hitungMasaKerja(){
       LocalDate sekarang = LocalDate.now();
       Period masa_kerja = Period.between(getTgl_mulai_kerja(), sekarang); 
       return masa_kerja.getYears() + 0;    //digit ke-12 dari NIM 24060124120029
    }

    /* Menghitung pajak petani */
    @Override
    public double hitungPajak(){
        return 0; 
    }

    /* Menampilkan detail Petani */
    @Override 
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("asal_kota : " + asal_kota);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}
