/**
 * File        : Datum.java
 * Deskripsi   : Kelas yang memiliki atribut isi bertipe generik. 
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 1 Mei 2026
 */

public class Datum<T> {
    /**********************ATRIBUT**********************/
    private T isi;

    /**********************METHOD**********************/
    /* Mengembalikan nilai isi */
    public T getIsi(){
        return isi; 
    }

    /* mengubah isi Datum menjadi isibaru */
    public void setIsi(T isiBaru){
        this.isi = isiBaru; 
    }
}
