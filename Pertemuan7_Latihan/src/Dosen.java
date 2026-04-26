/**
 * File        : Dosen.java
 * Deskripsi   : Kelas turunan civitas akademika yang menyimpan NIP untuk data dosen.  
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class Dosen extends CivitasAkademika {
    /**********************ATRIBUT**********************/
    private String NIP;

    /**********************METHOD**********************/
    /* Konstruktor */
    public Dosen(String Nama, String NIP){
        super(Nama);
        this.NIP = NIP; 
    }
    
    //Mengembalikan nilai NIP dosen 
    public String getNIP(){
        return NIP; 
    }

    //Mengeset nilai NIP 
    public void setNIP(String NIP){
        this.NIP = NIP; 
    }

    /* Mengembalikan nilai nomor dosen berdasarkan NIP */
    @Override
    public String getNomor(){
        return this.NIP; 
    }
}
