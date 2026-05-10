/**
 * File        : Teman.java
 * Deskripsi   : Kelas koleksi objek yang menggambarkan antrean hewan di klinik. 
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 4 Mei 2026
 */

import java.util.LinkedList; 
import java.util.Queue; 

public class Piaraan {
   /**********************ATRIBUT**********************/
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /**********************METHOD**********************/
    /* Konstruktor */ 
    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0; 
    }

    /* b. i) Mengembalikan jumlah elemen */
    public int getNbelm(){
        return nbelm; 
    }

    /* b. ii) Menambah elemen akhir */
    public void enqueueAnabul(Anabul anabul){
        Lanabul.add(anabul);
        nbelm++; 
    }

    /* b. iii) apakah member */
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    /* b. iv) Mengambil data anabul dalam antrean */
    public Anabul getAnabul(){
        return Lanabul.peek(); 
    }

    /* b. v) dequeueAnabul(){mengambil anabul pertama sekaligus mengeluarkannya dari antrean} */
    public Anabul dequeueAnabul(){
        if(!Lanabul.isEmpty()){
            nbelm--; 
        }
        return Lanabul.poll();
    }

    /* c. showAnabul */
    public void showAnabul(){
        for(Anabul anabul : Lanabul){
            System.out.println("Nama panggilan : " + anabul.getNama());
        }
    }

    /* d. menghitung banyak keluarga kucing dalam antrean */
    public int countKucing(){
        int count = 0; 
        for(Anabul anabul : Lanabul){
            if(anabul instanceof Kucing){
                count++;
            }
        }
        return count; 
    }

    /* e. menghitung bobot keluarga kucing dalam antrean */
    public double bobotKucing(){
        double total = 0; 
        for(Anabul anabul : Lanabul){
            if(anabul instanceof Kucing){
                total += ((Kucing)anabul).getBobot();
            }
        }
        return total; 
    }

    /* f. menampilkan nama-nama panggilan Anabul dalam antrean */
    public void showJenisAnabul(){
        for(Anabul anabul : Lanabul){
            System.out.println(
                anabul.getNama() + " adalah " + anabul.getClass().getName()
            );
        }
    }
}
