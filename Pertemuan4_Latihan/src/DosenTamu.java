/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen Tamu
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 15 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{
    /**********************ATRIBUT**********************/
    private String NIDK;
    private LocalDate tglAkhirKontrak;

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public DosenTamu(){

    }

    /* Konstruktor dengan parameter */
    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String NIDK, LocalDate akhirKontrak){
        super(NIP, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tglAkhirKontrak = akhirKontrak; 
    }

    /* Mengembalikan nilai NIDK */
    public String getNIDK(){
        return NIDK;
    }

    /* Mengeset nilai NIDK */
    public void setNIDK(String nidk){
        this.NIDK = nidk;
    }

    /* Mengembalikan nilai tgl akhir kontrak */
    public LocalDate getTglAkhirKontrak(){
        return tglAkhirKontrak; 
    }

    /* Mengeset nilai tgl akhir kontrak */
    public void setTglAKhirKontrak(LocalDate tglAkhirKontrak){
        this.tglAkhirKontrak = tglAkhirKontrak; 
    }

    /* Mengembalikan jumlah tunjangan dosen tamu */
    public double getTunjanganDosmu(){
        return 0.025 * getGajiPokok(); 
    }

    /* Mengambalikan sisa masa kontrak */
    public String MasaKontrak(){
        Period sisa = Period.between(LocalDate.now(), tglAkhirKontrak);
        int tahun = sisa.getYears();
        int bulan = sisa.getMonths();
        return tahun + " tahun " + bulan + " bulan";
    }

    /* Menampilkan detail dosen tamu */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK : " + NIDK);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Sisa Kontrak : " + MasaKontrak());
        System.out.println("Tunjangan : Rp " + getTunjanganDosmu());

    }
}
