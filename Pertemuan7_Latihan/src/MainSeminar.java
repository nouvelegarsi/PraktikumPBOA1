/* Nama File    : MainSeminar.java
 * Deskripsi    : MainSeminar untuk menguji prosedur registrasi dengan 7 peserta.
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 2 Maret 2025
 */

public class MainSeminar {
    public static void main(String[] args) {
        /* Membuat object seminar */
        Seminar seminar = new Seminar(); 

        /* e.1 membuat 2 object dosen */
        Dosen d1 = new Dosen("Pak Ahmad", "D001");
        Dosen d2 = new Dosen("Bu Ovi", "D002");

        /* e.2 membuar 5 objek mahasiswa */
        Mahasiswa m1 = new Mahasiswa("Anis", "24001");
        Mahasiswa m2 = new Mahasiswa("Binar", "24002");
        Mahasiswa m3 = new Mahasiswa("Budi", "24003");
        Mahasiswa m4 = new Mahasiswa("Dewa", "24004");
        Mahasiswa m5 = new Mahasiswa("Silvi", "24005");

        /* Set dosen wali */
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        /* Registrasi peserta */
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        /* Menampilkan semua peserta */
        System.out.println("Peserta : ");
        seminar.tampilPeserta();

        /* Menampilkan jumlah peserta */
        System.out.println("\nJumlah peserta : " + seminar.countPeserta());

        /* Menampilkan jumlah peserta mahasiswa */
        System.out.println("\nJumlah mahasiswa: " + seminar.countMahasiswa());

        /* Menampilkan data mahasiswa */
        System.out.println("\nData Mahasiswa m1 : ");
        m1.tampilDataMahasiswa();
        System.out.println("\nData Mahasiswa m2 : ");
        m2.tampilDataMahasiswa();
        System.out.println("\nData Mahasiswa m3 : ");
        m3.tampilDataMahasiswa();
        System.out.println("\nData Mahasiswa m4 : ");
        m4.tampilDataMahasiswa();
        System.out.println("\nData Mahasiswa m5 : ");
        m5.tampilDataMahasiswa();
    }
}

/* Cara kerja polimorfisme : 
   Polimorfisme adalah kemampuan yang memungkinkan sebuah referensi kelas induk seperti CivitasAkademika untuk menampung berbagai bentuk 
   objek turunannya, baik Dosen maupun Mahasiswa, sehingga program dapat menjalankan metode yang sama seperti getNomor() namun menghasilkan 
   perilaku yang berbeda sesuai dengan karakteristik unik masing-masing objek tersebut. Dengan menerapkan konsep ini, kita dapat menciptakan 
   kode yang lebih fleksibel, ringkas, dan efisien karena struktur data seperti larik dalam kelas Seminar dapat mengelola berbagai tipe objek 
   secara seragam tanpa kehilangan identitas asli dari tiap-tiap kelas anaknya. */
