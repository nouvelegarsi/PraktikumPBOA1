/* Nama File    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 22 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    /**********************ATRIBUT**********************/
    private String npwp;
    private static int counterPengusaha = 0;

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public Pengusaha(){
        counterPengusaha++; 
    }

    /* Konstruktor dengan parameter */
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp; 
        counterPengusaha++;
    }

    /* Mengembalikan nilai npwp */
    public String getNPWP(){
        return npwp;
    }

    /* Mengeset nilai npwp */
    public void setNPWP(String npwp){
        this.npwp = npwp; 
    }

    /* Mengitung objek Pengusaha yang dibuat */
    public static int getCounterPengusaha(){
        return counterPengusaha; 
    }

    /* Menghitung masa kerja Pengusaha */
    @Override
    public int hitungMasaKerja(){
       LocalDate sekarang = LocalDate.now();
       Period masa_kerja = Period.between(getTgl_mulai_kerja(), sekarang); 
       return masa_kerja.getYears() + 2;    //digit ke-13 dari NIM 24060124120029
    }

    /* Menghitung pajak pengusaha */
    @Override
    public double hitungPajak(){
       /* Pajak 15% dari pendapatan */ 
       return 0.15 * getPendapatan(); 
    }

    /* Menampilkan detail Pengusaha */
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}
