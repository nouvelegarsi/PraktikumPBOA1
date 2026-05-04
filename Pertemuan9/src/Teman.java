/**
 * File        : Teman.java
 * Deskripsi   : Kelas koleksi objek dengan atribut nbelm dan Lnama
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 4 Mei 2026
 */

import java.util.ArrayList; 
import java.util.List; 

public class Teman {
    /**********************ATRIBUT**********************/
    private int nbelm;
    private List<String> Lnama;

    /**********************METHOD**********************/
    /* Konstruktor */
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0; 
    }

    /* Mengembalikan jumlah elemen */
    public int getNbelm(){
        return nbelm; 
    }

    /* Mengembakikan nilai nama */
    public String getNama(int indeks){
        if(indeks >= 0 && indeks < Lnama.size()){
            return Lnama.get(indeks); 
        }
        return null; 
    }

    /* Mengeset nilai nama */
    public void setNama(int indeks, String nama){
        if(indeks >= 0 && indeks < Lnama.size()){
            Lnama.set(indeks, nama);
        }
    }

    /* Menambah nama ke dalam koleksi */
    public void addNama(String nama){
        Lnama.add(nama); 
        this.nbelm++; 
    }

    /* Menghapus nama dari koleksi */
    public void delNama(String nama){
        Lnama.remove(nama);
        this.nbelm--; 
    }

    /* Menampilkan semua nama di koleksi */
    public void showTeman(){
        System.out.println("Daftar teman : ");
        for (String n : Lnama){
            System.out.println("-" + n);
        }
    }

    /* Apakah member dikoleksi */
    public boolean isMember(String nama){
        return Lnama.contains(nama); 
    }

    /* Mengganti nama yang ada di koleksi */
    public void gantiNama(String nama, String namabaru){
        int x = Lnama.indexOf(nama);
        Lnama.set(x, namabaru); 
    }

    /* Menghitung jumlah kemunculan nama yang sama dikoleksi */
    public int countNama(String nama){
        int count = 0; 
        for(String n : Lnama){
            if(n.equals(nama)){
                count++; 
            }
        }
        return count; 
    }
}
