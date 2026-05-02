/**
 * File        : Anjing.java
 * Deskripsi   : Kelas anak Anabul yang mengimplementasikan suara dan gerak anjing. 
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 1 Mei 2026
 */

public class Anjing extends Anabul {
    /**********************ATRIBUT**********************/

    /**********************METHOD**********************/
    /* Konstruktor  */
    public Anjing(String Nama){
        super(Nama);
    }

    /* Gerak Anjing = Melata */
    @Override
    public void gerak(){
        System.out.println(Nama + " bergerak melata.");
    }

    /* Anjing bersuara guk-guk */
    @Override
    public void bersuara(){
        System.out.println(Nama + " bersuara guk-guk.");
    }
}
