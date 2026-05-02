/**
 * File        : Data.java
 * Deskripsi   : Kelas yang menyimpan 100 elemen generik. 
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 1 Mei 2026
 */

import java.util.ArrayList;

public class Data<T> {
    /**********************ATRIBUT**********************/
    private ArrayList<T> ruang; 
    private int banyak; 

    /**********************METHOD**********************/
    /* Konstruktor */
    public Data(){
        this.ruang =  new ArrayList<>(100);
        this.banyak = 0; 
    }

    /* Mengembalikan posisi ruang elemen */
    public T getIsi(int posisi){
        if (posisi >= 1 && posisi <= ruang.size()){
            return ruang.get(posisi - 1);
        }
        return null; 
    }

    /* Mengisi elemen pada posisi tertentu */
    public void setIsi(int posisi, T objek){
        if (posisi >= 1 && posisi <= 100){
            while (ruang.size() < posisi){
                ruang.add(null);
        }
        if (ruang.get(posisi - 1) == null){
            banyak++;
        }
        ruang.set(posisi - 1, objek);
        }
    }

    /* Mengembalikan banyak elemen */
    public int getSize(){
        return this.banyak; 
    }
}
