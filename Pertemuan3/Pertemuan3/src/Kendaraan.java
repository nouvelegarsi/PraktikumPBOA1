/* Nama File    : Kedaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 2 Maret 2025
 */

public class Kendaraan {
    /**********************ATRIBUT**********************/
    private String noPlat;
    private String jenis;

    /**********************METHOD**********************/
    public Kendaraan(){
        //Konstruktor tanpa parameter
    }

    //Konstruktor dengan parameter
    public Kendaraan(String newnoPlat, String newjenis){
        this.noPlat = newnoPlat;
        this.jenis = newjenis; 
    }

    //Mengembalikan nomor plat kendaraan 
    public String getNoPlat(){
        return noPlat;
    }

    //Mengembalikan jenis kendaraan 
    public String getJenis(){
        return jenis;
    }

    //Mengeset noPlat 
    public void setNoPlat(String newnoPlat){
        this.noPlat = newnoPlat; 
    }

    //Mengeset jenis kendaraan; mobil atau motor 
    public void setJenis(String newjenis){
        this.jenis = newjenis; 
    }

    //Menampilkan kendaraan ke layar 
    public void printKendaraan(){
        System.out.println("noPlat : " + noPlat);
        System.out.println("Jenis : " + jenis);
    }

}   
    
