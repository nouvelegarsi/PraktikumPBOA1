/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi aplikasi method dalam class Mahasiswa
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 2 Maret 2025
 */

public class MMahasiswa {
    public static void main(String[] args){
        /* Membuat objek Mata Kuliah */
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        /* Membuat objek mahasiswa, dosen, dan kendaraan */
        Mahasiswa M1 = new Mahasiswa("234", "Citra","Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        
        /* mengeset dosen wali dan kendaraan untuk M1 */
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);

        /* Menambah matkul PBO dan MBD ke M1 */
        M1.addMatkul(PBO);
        M1.addMatkul(MBD); 

        /* Menampilkan detail mahasiswa */
        System.out.println("Tampilkan detail mahasiwa M1 : ");
        M1.printDetailMhs();

        /* Menampikan jumlah matkul dan jumlah sksnya */
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS());

        /* Menampilkan data dosen D1, data kendaraan K1, data matkul, dan data mahasiwa */
        System.out.println("Tampilkan detail dosen : ");
        D1.printDosen();

        System.out.println("Tampilkan detail kendaraan : ");
        K1.printKendaraan();

        System.out.println("Tampilkan detail matkul PBO  : ");
        PBO.PrintMatkul();

        System.out.println("Tampilkan detail matkul MBD  : ");
        MBD.PrintMatkul();

        System.out.println("Tampilkan data mahasiswa  : ");
        M1.printMhs();
    }
}