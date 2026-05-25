/*
 * File        : LambdaMap.java
 * Deskripsi   : Implementasi lambda pada Map
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 25 Mei 2026
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        /* Kamus */
        Map<String, String> mahasiswa;

        /* Algoritma */
        /* Buat objek map */
        mahasiswa = new HashMap<>();

        /* Tambah data ke map */
        mahasiswa.put("240123", "Sibali");
        mahasiswa.put("240124", "Opi");
        mahasiswa.put("240125", "Suci");
        mahasiswa.put("240126", "Cicil");
        mahasiswa.put("240127", "Putri");

        /* Tampilkan data mahasiwa */
        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim + ", Nama : " + nama);
            }   
        );
    }
}