/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 15 Maret 2025
 */
import java.time.LocalDate;

public class Dosen extends Pegawai{
    /**********************ATRIBUT**********************/
    private String fakultas; 

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */  
    public Dosen(){

    }
    
    /* Konstruktor dengan parameter */
    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(NIP, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas; 
    }

    /* Mengembalikan nilai fakultas dosen */
    public String getFakultas(){
        return fakultas;
    }

    /* Mengeset nilai fakultas dosen */
    public void setFakultas(String Fakultas){
        this.fakultas = Fakultas; 
    }
}
