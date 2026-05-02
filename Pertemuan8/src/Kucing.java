/**
 * File        : Kucing.java
 * Deskripsi   : Kelas anak Anabul yang mengimplementasikan suara dan gerak kucing. 
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 1 Mei 2026
 */

public class Kucing extends Anabul {
    /**********************ATRIBUT**********************/
    protected double bobot; 

    /**********************METHOD**********************/
    /* Konstruktor  */
    public Kucing(String Nama, double bobot){
        super(Nama);
        this.bobot = bobot; 
    }

    /* Mengembalikan berat kucing dalam kilogram */
    public double getBobot(){
        return bobot; 
    }

    /* Gerak Kucing = Melata */
    @Override
    public void gerak(){
        System.out.println(Nama + " bergerak melata.");
    }

    /* Kucing bersuara meong */
    @Override
    public void bersuara(){
        System.out.println(Nama + " berbunyi meong.");
    }

}
