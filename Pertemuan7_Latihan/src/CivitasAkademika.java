/**
 * File        : CivitasAkademika.java
 * Deskripsi   : Kelas induk Civitas Akademik yang mentimpan atribut 
 *               dan method yang akan diimplementasikan oleh subclass.
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class CivitasAkademika {
    /**********************ATRIBUT**********************/
    protected String Nama; 

    /**********************METHOD**********************/
    /* Konstruktor */
    public CivitasAkademika(String Nama){
        this.Nama = Nama; 
    }

    /* Mengembalikan nilai nama */
    public String getNama(){
        return Nama;
    }

    /* Mengeset nilai nama */
    public void setNama(String Nama){
        this.Nama = Nama; 
    }

    /* Method getNomor yang akan menyesuaikan NIM/NIP kelas anak. */
    public String getNomor(){
        return "";
    }
}
