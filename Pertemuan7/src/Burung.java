/**
 * File        : Burung.java
 * Deskripsi   : Kelas anak Anabul yang mengimplementasikan suara dan gerak burung. 
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class Burung extends Anabul {
    /**********************ATRIBUT**********************/

    /**********************METHOD**********************/
    /* Konstruktor  */
    public Burung(String Nama){
        super(Nama);
    }

    /* Gerak Burung = terbang */
    @Override
    public void gerak(){
        System.out.println(Nama + " bergerak terbang.");
    }

    /* Burung berbunyi cuit */
    @Override
    public void bersuara(){
        System.out.println(Nama + " berbunyi cuit.");
    }
}
