/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 15 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    /**********************ATRIBUT**********************/
    private String bidang;
    private static final int BUP = 55; 

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public Tendik(){

    }

    /* Konstruktor dengan parameter */
    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String Bidang){
        super(NIP, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = Bidang; 
    }

    /* Mengembalikan nilai bidang */
    public String getBidang(){
        return bidang; 
    }

    /* Mengeset nilai bidang */
    public void setBidang(String Bidang){
        this.bidang = Bidang; 
    }

    /* Mengembalikan nilai tunjangan tendik */
    public double getTunjanganTendik(){
        Period masaKerja = Period.between(getTMT(), LocalDate.now());
        int tahun = masaKerja.getYears();
        return 0.01 * tahun * getGajiPokok(); 
    }

    /* Mengembalikan tanggal pensiun tendik, tanggal pensiun jatuh pada tanggal 1 bulan berikutnya */
    public LocalDate getTglPensiunTendik(){
        LocalDate usiaPensiun = getTglLahir().plusYears(BUP);
        int bulan = usiaPensiun.getMonthValue() + 1;  
        int tahun = usiaPensiun.getYear();
        if (bulan > 12) {
            bulan = 1;
            tahun++;
        }
        return LocalDate.of(tahun, bulan, 1);
    }

    /* Menampilkan detail Tendik */
    @Override
    public void printInfo() {

        super.printInfo();

        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Tanggal Pensiun : " + getTglPensiunTendik());
        System.out.println("Tunjangan : Rp. " + getTunjanganTendik());
    }

}
