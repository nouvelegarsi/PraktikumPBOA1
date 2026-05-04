/**
 * File        : MainTeman.java
 * Deskripsi   : Program untuk mengislustrasikan koleksi objek dari kelas Teman
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 4 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        /* Membuat object teman */
        Teman t = new Teman();

        /* Menambah nama ke dalam koleksi */
        t.addNama("Ovi");
        t.addNama("Silvi");
        t.addNama("Ella");

        /* Menghitung jumlah elemen dalam koleksi */
        System.out.println("Jumlah teman : " + t.getNbelm());

        /* Menampilkan nama di dalam koleksi sesuai dengan indeks yang ditentukan */
        System.out.println("\nNama pertama : " + t.getNama(1));
        t.setNama(2, "Suci");
        System.out.println("\nKoleksi terbaru : ");
        t.showTeman();

        /* Menghapus nama */
        System.out.println("\n===DELNAMA===");
        t.delNama("Suci");
        System.out.println("Koleksi terbaru : ");
        t.showTeman();

        /* Mengecek apakah member */
        System.out.println("\n===ISMEMBER===");
        System.out.println("Apakah Silvi member : " + t.isMember("Silvi"));
        System.out.println("Apakah Suci member : " + t.isMember("Suci"));

        System.out.println("\n===GANTINAMA===");
        t.gantiNama("Silvi", "Sivali");
        System.out.println("Koleksi terbaru : ");
        t.showTeman();

        t.addNama("Budi");
        t.addNama("Budi");
        t.addNama("Budi");

        System.out.println("\n===COUNTNAMA===");
        System.out.println("Jumlah kemunculan Ovi : " + t.countNama("Ovi"));
        System.out.println("Jumlah kemunculan Budi : " + t.countNama("Budi"));
    }
}
