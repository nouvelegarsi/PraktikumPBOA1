/**
 * File        : Mahasiswa.java
 * Deskripsi   : Kelas mahasiswa dengan operator / method overloading
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class Mahasiswa{
    /**********************ATRIBUT**********************/
    private String NIM; 
    private String Nama;
    private String Programstudi; 

    /**********************Konstruktor**********************/
    /* c. Konstruktor tanpa parameter */
    public Mahasiswa(){
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    /* d. Konstruktor dengan 3 parameter */
    public Mahasiswa(String NIM, String Nama, String Programstudi){
        this.NIM = NIM;
        this.Nama = Nama; 
        this.Programstudi = Programstudi; 
    }

    /* e. Konstruktor kloning */
    public Mahasiswa(Mahasiswa m){
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi; 
    }

    /**********************METHOD OVERLOADING**********************/
    /* Varian 1. Tanpa Parameter */
    public void setProgramStudi(){
        this.Programstudi = "Kosong"; 
    }

    /* Varian 2. Satu parameter String */
    public void setProgramStudi(String Programstudi){
        this.Programstudi = Programstudi; 
    }

    /* Varian 3. Satu parameter objek Mahasiswa lain */
    public void setProgramStudi(Mahasiswa m){
        this.Programstudi = m.Programstudi; 
    }

    /**********************METHOD LAINNYA**********************/
    //Mengembalikan nilai nim 
    public String getNIM(){
        return NIM;
    }

    //Mengeset nilai NIM 
    public void setNIM(String NIM){
        this.NIM = NIM; 
    }

    //Mengembalikan nilai nama
    public String getNama(){
        return Nama;
    }

    //Mengeset nilai Nama 
    public void setNama(String Nama){
        this.Nama = Nama; 
    }

    //Mengembalikan nilai prodi 
    public String getProgramstudi(){
        return Programstudi;
    }

    //Menampilkan detail mahasiswa ke layar 
    public void printDetailMhs(){
        System.out.println("NIM           : " + NIM);
        System.out.println ("Nama          : " + Nama);
        System.out.println ("Program Studi : " + Programstudi);
    }
}