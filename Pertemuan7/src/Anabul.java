/**
 * File        : Anabul.java
 * Deskripsi   : Kelas induk Anabul yang mewakili hewan peliharaan.
 *               Mendefinisikan Nama, gerak, dan suara.
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class Anabul {
    /**********************ATRIBUT**********************/
    protected String Nama; 

    /**********************METHOD**********************/
    /* Konstruktor */
    public Anabul(String Nama){
        this.Nama = Nama; 
    }

    /* Perilaku gerak */
    public void gerak(){
        System.out.println(Nama + " bergerak.");
    }

    /* Perilaku bersuara */
    public void bersuara(){
        System.out.println(Nama + " bersuara.");
    }
}
