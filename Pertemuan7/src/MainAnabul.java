/**
 * File        : MainAnabul.java
 * Deskripsi   : Program utama untuk menguji polimorfisme universal inclusion di kelas mahasiswa
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] daftar = {
            new Kucing("Oreo"),
            new Anjing("Molly"),
            new Burung("Pipi")
        };

        for(Anabul a : daftar){
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}
