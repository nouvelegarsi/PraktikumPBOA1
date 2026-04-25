/**
 * File        : MainMahasiswa.java
 * Deskripsi   : Program utama untuk menguji polimorfisme overloading di kelas mahasiswa
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class MainMahasiswa{
    public static void main(String[] args){
        /* b. Aplikasi semua varian setProgramStudi */
        Mahasiswa m1 = new Mahasiswa("24001", "Andi", "Informatika");
        Mahasiswa m2 = new Mahasiswa("24002", "Budi", "Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa("24003", "Ovi", "Teknik Komputer");

        /* Menampilkan detail awal mahasiswa */
        System.out.println("Data Awal m1 : ");
        m1.printDetailMhs();
        System.out.println("\nData Awal m2 : ");
        m2.printDetailMhs();
        System.out.println("\nData Awal m3 : ");
        m3.printDetailMhs();

        /* Varian 1. Set Program Studi Tanpa Parameter */
        System.out.println("\nSet Program Studi Tanpa Parameter : ");
        m1.setProgramStudi();
        m1.printDetailMhs();

        /* Varian 2. Set Program Studi dengan Satu parameter String */
        System.out.println("\nSet Program Studi dengan parameter String : ");
        m2.setProgramStudi("Teknologi Informasi");
        m2.printDetailMhs();

        /* Varian 3. Set Program Studi dengan Satu parameter objek Mahasiswa lain */
        System.out.println("\nSet Program Studi dengan parameter objek Mahasiswa lain  : ");
        m3.setProgramStudi(m2);
        m3.printDetailMhs();

        /* c. Konstruktor default */
        System.out.println("\nObjek Default : ");
        Mahasiswa mDefault = new Mahasiswa();
        mDefault.printDetailMhs();

        /* d. Konstruktor 3 parameter */
        System.out.println("\nObjek 3 paramter : ");
        Mahasiswa mParam = new Mahasiswa("24004", "Silvi", "Ilmu Komputer");
        mParam.printDetailMhs();

        /* e. Konstruktor Cloning */
        System.out.println("\nObjek cloning : ");
        Mahasiswa mClone = new Mahasiswa(mParam);
        mClone.printDetailMhs();
    }
}