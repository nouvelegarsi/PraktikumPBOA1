/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 2 Maret 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    /**********************ATRIBUT**********************/
    private String nim;
    private String nama; 
    private String prodi; 
    ArrayList<MataKuliah> listMatkul; 
    private Dosen dosenWali; 
    private Kendaraan kendaraan;

    /**********************METHOD**********************/
    //Konstruktor tanpa parameter 
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    //Konstruktor dengan parameter 
    public Mahasiswa(String NIM, String newNama, String newProdi){
        this.nim = NIM; 
        this.nama = newNama;
        this.prodi = newProdi; 
        this.listMatkul = new ArrayList<>();
    }

    //Mengembalikan nilai nim 
    public String getNIM(){
        return nim;
    }

    //Mengembalikan nilai nama
    public String getNama(){
        return nama;
    }

    //Mengembalikan nilai prodi 
    public String getProdi(){
        return prodi;
    }

    //Mengembalikan nilai list matkul
    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul; 
    }

    //Mengembalikan nilai dosenwali
    public Dosen getDosenWali(){
        return dosenWali; 
    }

    //Mengembalikan nilai kendaraan
    public Kendaraan getKendaraan(){
        return kendaraan; 
    }

    //Mengeset nilai NIM 
    public void setNIM(String NIM){
        this.nim = NIM; 
    }

    //Mengeset nilai Nama 
    public void setNama(String newNama){
        this.nama = newNama; 
    }

    //Mengeset Prodi 
    public void setProdi(String newProdi){
        this.prodi = newProdi; 
    }

    //Mengeset nilai dosen wali 
    public void setDosenWali(Dosen doswal){
        this.dosenWali =  doswal; 
    }

    //Memgeset nilai kendaran 
    public void setKendaraan(Kendaraan newkendaraan){
        this.kendaraan = newkendaraan; 
    }

    //Menambah matakuliah
    public void addMatkul(MataKuliah newMataKul){
        listMatkul.add(newMataKul); 
    }

    //Mnegembalikan jumlah sks yg diambil mahasiswa 
    public int getJumlahSKS(){
        int TotalSKS = 0; 

        for(MataKuliah matkul : listMatkul){
            TotalSKS += matkul.getSKS(); 
        }
        return TotalSKS;
    }

    //Mengembalikan jumlah matakuliah mahasiswa 
    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    //Menampilkan data mahasiswa 
    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println ("Nama: " + nama);
        System.out.println ("Prodi: " + prodi);
    }

    //Menampilkan detail mahasiswa ke layar 
    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println ("Nama: " + nama);
        System.out.println ("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah : "); 
        int i;
        for(i=0; i < listMatkul.size();i++){
            System.out.println("- " + listMatkul.get(i).getNama()); 
        }
        System.out.println("Nama Dosen Wali : " + dosenWali.getNama());
        System.out.println("Kendaraan yang dimiliki : ");
        System.out.println("No Plat Kendaraan : " + kendaraan.getNoPlat());
        System.out.println("Jenis kendaraan : " + kendaraan.getJenis());
    }

}
