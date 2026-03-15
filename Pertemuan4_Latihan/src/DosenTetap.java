/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen Tetap 
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 15 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen{
    /**********************ATRIBUT**********************/
    private String NIDN; 
    private static final int BUP = 65;

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public DosenTetap(){

    }

    /* Konstruktor dengan parameter */
    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String NIDN){
        super(NIP, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.NIDN = NIDN; 
    }

    /* Mengembalikan nilai NIDN */
    public String getNIDN(){
        return NIDN;
    }

    /* Mengeset nilai NIDN */
    public void setNIDN(String nidn){
        this.NIDN = nidn; 
    }

    /* Mengembalikan nilai tunjangan dosen tetap */
    public double getTunjanganDostap(){
        Period masaKerja = Period.between(getTMT(), LocalDate.now());
        int tahun = masaKerja.getYears();
        return 0.02 * tahun * getGajiPokok();
    }

    /* Mengembalikan tanggal pensiun dosen tetap, tanggal pensiun jatuh pada tanggal 1 bulan berikutnya */
    public LocalDate getTglPensiunDosTap(){
        LocalDate usiaPensiun = getTglLahir().plusYears(BUP);
        int bulan = usiaPensiun.getMonthValue() + 1;
        int tahun = usiaPensiun.getYear();

        if (bulan > 12) {
            bulan = 1;
            tahun++;
        }
        return LocalDate.of(tahun, bulan, 1);
    }

    /* Menampilkan detail dosen tetap */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN : " + NIDN);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Tanggal Pensiun : " + getTglPensiunDosTap());
        System.out.println("Tunjangan : Rp " + getTunjanganDostap());
    }
    
}
