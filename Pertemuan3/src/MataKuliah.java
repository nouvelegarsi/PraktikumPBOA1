/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 2 Maret 2025
 */

public class MataKuliah {
    /**********************ATRIBUT**********************/
    private String idMatkul;
    private String nama;
    private int sks; 

    /**********************METHOD**********************/
    public MataKuliah(){
        //Konstruktor tanpa parameter
    }

    //Konstruktor Matkul dengan parameter
    public MataKuliah(String newidMatkul, String newnama, int newsks){
        this.idMatkul = newidMatkul;
        this.nama = newnama;
        this.sks = newsks;
    }

    //Mengembalikan nilai idMatkul 
    public String getIdMatkul(){
        return idMatkul;
    }

    //Mengembalikan nilai nama
    public String getNama(){
        return nama;
    }

    //Mengembalikan nilai sks
    public int getSKS(){
        return sks; 
    }

    //Mengeset idMatkul
    public void setIdMatkul(String newidMatkul){
        this.idMatkul = newidMatkul;
    }

    //Mengeset nama 
    public void setNama(String newnama){
        this.nama = newnama; 
    }

    //Mengeset sks
    public void setSKS(int SKS){
        this.sks = SKS;
    }

    //Menampilkan MataKuliah ke layar 
    public void PrintMatkul(){
        System.out.println("idMatkul : " + idMatkul);
        System.out.println("Nama : " + nama);
        System.out.println("sks : " + sks);
    }
}
