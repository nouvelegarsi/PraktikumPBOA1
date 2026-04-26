/**
 * File        : Mahasiswa.java
 * Deskripsi   : Kelas turunan civitas akademika yang menyimpan NIM dan dosen wali untuk data mahasiswa.  
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class Mahasiswa extends CivitasAkademika {
    /**********************ATRIBUT**********************/
    private String NIM;
    private Dosen DosenWali;

    /**********************METHOD**********************/
    /* Konstruktor */
    public Mahasiswa(String Nama, String NIM){
        super(Nama);
        this.NIM = NIM; 
        this.DosenWali = null; 
    }

    //Mengembalikan nilai nim 
    public String getNIM(){
        return NIM;
    }

    //Mengeset nilai NIM 
    public void setNIM(String NIM){
        this.NIM = NIM; 
    }

    //Mengeset nilai dosen wali 
    public void setWali(Dosen doswal){
        this.DosenWali =  doswal; 
    }

    /* Mengembalikan nilai mahasiswa dosen berdasarkan NIM */
    @Override
    public String getNomor(){
        return NIM;
    }

    /* Menampilkan data mahasiswa */
    public void tampilDataMahasiswa(){
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        if (DosenWali != null) {
            System.out.println("Dosen Wali : " + DosenWali.getNama());
        } 
        else {
            System.out.println("Dosen Wali : Belum ada");
        }
    }
}
