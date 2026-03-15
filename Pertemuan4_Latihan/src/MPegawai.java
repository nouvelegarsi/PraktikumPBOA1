/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi aplikasi method dalam class Pegawai, Dosen, dan Tendik 
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 15 Maret 2025
*/

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args){
        /* Membuat Object Dosen Tetap */
        System.out.println("===DOSEN TETAP===");
        DosenTetap dosen1 = new DosenTetap(
            "9545647548",
            "Andi",
            LocalDate.of(1990,5,5),
            LocalDate.of(2015,1,1),
            5000000,
            "Fakultas Sains dan Matematika",
            "78647324"
        );

        /* Menampilkan detail dosen tetap */
        System.out.println("Detail Dosen Tetap : ");
        dosen1.printInfo();

        /* Membuat object Dosen Tamu */
        System.out.println("\n===DOSEN TAMU===");
        DosenTamu dosen2 = new DosenTamu(
            "8845672345",
            "Salsabilla  Suci",
            LocalDate.of(1985, 1, 9),
            LocalDate.of(2022, 2, 1),
            4500000,
            "Fakultas Ekonomi dan Bisnis",
            "97888259",
            LocalDate.of(2027, 12, 1)
        );

        /* Menampilkan detail dosen tamu */
        System.out.println("Detail Dosen Tamu : ");
        dosen2.printInfo();

        /* Membuat Object Tendik */
        System.out.println("\n===TENDIK===");
        Tendik tendik1 = new Tendik(
            "1129334556",
            "Rahma Ramadhani",
            LocalDate.of(1995, 7, 27),
            LocalDate.of(2018, 3, 1),
            3500000,
            "Akademik"
        );

        /* Menampilkan detail tendik */
        System.out.println("Detail Tendik : ");
        tendik1.printInfo();
    }
}
