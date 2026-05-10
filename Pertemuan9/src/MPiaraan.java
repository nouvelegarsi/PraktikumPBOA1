/**
 * File        : MainTeman.java
 * Deskripsi   : Program untuk mengislustrasikan koleksi objek dari kelas Piaraan
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 9 Mei 2026
 */

public class MPiaraan {
    public static void main(String[] args) {
        /* Kamus */
        Piaraan p;
        Anggora K1;
        Kembangtelon K2;
        Anjing A1;
        Burung B1; 

        /* Algoritma */
        p = new Piaraan(); 
        K1  = new Anggora("Kucing", 3.5);
        K2 = new Kembangtelon("Kucing", 2.7);
        A1 = new Anjing("Anjing");
        B1 = new Burung("Burung");

        /* Menambah panggilan */
        K1.setNama("Kopiah");
        K2.setNama("Miko");
        A1.setNama("Doffy");
        B1.setNama("Pipi");

        /* Menambah koleksi */
        p.enqueueAnabul(K1);
        p.enqueueAnabul(K2);
        p.enqueueAnabul(A1);
        p.enqueueAnabul(B1);

        /* Menampilkan anabul pertama dalam antrean */
        System.out.println("Anabul antrean pertama : " + p.getAnabul().getNama());

        /* Menghitung jumlah elemen dalam koleksi */
        System.out.println("\nJumlah anabul : " + p.getNbelm());

        /* Menampilkan anabul dalan antrean */
        System.out.println("\nTampilkan anabul : ");
        p.showAnabul();
        
        /* Menampilkan jenis anabul */
        System.out.println("\nTampilkan jenis anabul : ");
        p.showJenisAnabul();

        /* Mengecek apakah anggota */
        System.out.println("\n===ISMEMBER===");
        System.out.println("Apakah Pipi member : " + p.isMember(B1));

        /* Menghitung kucing */
        System.out.println("\n===COUNTKUCING===");
        System.out.println("Jumlah kucing : " + p.countKucing());

        /* Menghitung bobot semua kucing */
        System.out.println("\n===BOBOTKUCING===");
        System.out.println("Bobot semua kucing : " + p.bobotKucing() + " kg");

        /* Mengambil antrean pertama anabul */
        System.out.println("\n===DEQUEUE===");
        System.out.println("Antrean pertama : " + p.dequeueAnabul().getNama());

        /* Menampilkan jumlah anabul setelah dequeue */
        System.out.println("Jumlah anabul setelah dequeue : " + p.getNbelm());

        /* Menampilkan anabul setelah dequeue */
        System.out.println("Tampilkan anabul yang tersisa: ");
        p.showAnabul();
    }
}
