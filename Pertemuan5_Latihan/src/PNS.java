/* Nama File    : PNS.java
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 22 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    /**********************ATRIBUT**********************/
    private String nip;
    private static int counterPNS = 0; 

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public PNS(){
        counterPNS++;
    }

    /* Konstruktor dengan parameter */
    public PNS(String nama, LocalDate TglMulai, String alamat, double pendapatan,String NIP){
        super(nama, TglMulai, alamat, pendapatan);
        this.nip = NIP;
        counterPNS++;
    }

    /* Mengembalikan nilai NIP */
    public String getNIP(){
        return nip;
    }

    /* Mengeset nilai NIP */
    public void setNIP(String nip){
        this.nip = nip; 
    }

    /* Menghitung objek PNS yang dibuat */
    public static int getCounterPNS(){
        return counterPNS;
    }

    /* Menghitung masa kerja PNS */
    @Override
    public int hitungMasaKerja(){
       LocalDate sekarang = LocalDate.now();
       Period masa_kerja = Period.between(getTgl_mulai_kerja(), sekarang); 
       return masa_kerja.getYears() + 9;    //digit ke-14 dari NIM 24060124120029
    }

    /* Mengitung pajak PNS */
    @Override
    public double hitungPajak(){
       /* Pajak 10% dari pendapatan */ 
       return 0.1 * getPendapatan(); 
    }

    /* Menampilkan detail PNS */
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP : " + nip);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}
