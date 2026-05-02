/**
 * File        : OperatorGenerik.java
 * Deskripsi   : Berisi kelas dan method generik.
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 1 Mei 2026
 */

/* Kelas bantuan agar nilai objek bisa ditukar referensinya */
class Ref<T>{
    /**********************ATRIBUT**********************/
    public T val; 

    /**********************METHOD**********************/
    /* Konstruktor */
    public Ref(T val){
        this.val = val; 
    }
}


public class OperatorGenerik {
    /**********************ATRIBUT**********************/

    /**********************METHOD**********************/
    /* Prosedur generik Tukar untuk menukar dua parameter generik */
    public static <T> void Tukar(Ref<T> a, Ref<T> b){
        T temp = a.val;
        a.val = b.val;
        b.val = temp; 
    }

    /* Fungsi Bobot2 yang menerima masukan dua objek keturunan
    kucing lalu mengembalikan jumlah bobot keduanya */
    public static <T extends Kucing, U extends Kucing> double Bobot2(T a, U b){
        return a.getBobot() + b.getBobot(); 
    }
}
