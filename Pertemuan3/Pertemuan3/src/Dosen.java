/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 2 Maret 2025
 */

public class Dosen {
    /**********************ATRIBUT**********************/
    private String NIP;
    private String Nama;
    private String Prodi; 

    /**********************METHOD**********************/ 
    public Dosen(){
        //Konstruktor tanpa parameter
    }

    //Konstruktor Dosen dengan parameter
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    //Mengembalikan nilai NIP dosen 
    public String getNIP(){
        return NIP; 
    }

    //Mengembalikan Nama dosen 
    public String getNama(){
        return Nama; 
    }

    //Mengembalikan Prodi dosen 
    public String getProdi(){
        return Prodi;
    }
    
    //Mengeset nilai NIP 
    public void setNIP(String newNIP){
        this.NIP = newNIP; 
    }

    //Mengeset nilai Nama
    public void setNama(String newNama){
        this.Nama = newNama; 
    }

    //Mengeset nilai Prodi
    public void setProdi(String newProdi){
        this.Prodi = newProdi; 
    }

    //Menampilkan atribut dosen ke layar 
    public void printDosen(){
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + Nama);
        System.out.println("Prodi : " + Prodi);
    }

}
