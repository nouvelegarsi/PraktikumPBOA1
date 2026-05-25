import java.util.ArrayList;

/*
 * File        : LambdaList.java
 * Deskripsi   : Implementasi lambda pada List,
 *               digunakan sebagai parameter pada method.
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 25 Mei 2026
 */

public class LambdaList {
    public static void main(String[] args) {
        /* Kamus */
        ArrayList<String> mahasiswaList;

        /* Algoritma */
        mahasiswaList = new ArrayList<>();

        /* Membuat objek */
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
