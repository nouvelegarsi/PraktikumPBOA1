/**
 * File        : Kucing.java
 * Deskripsi   : Kelas anak Anabul yang mengimplementasikan suara dan gerak kucing. 
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class Kucing extends Anabul {
    /**********************ATRIBUT**********************/

    /**********************METHOD**********************/
    /* Konstruktor  */
    public Kucing(String Nama){
        super(Nama);
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
