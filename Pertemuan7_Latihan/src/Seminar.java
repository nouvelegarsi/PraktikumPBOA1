/**
 * File        : Seminar.java
 * Deskripsi   : Kelas Seminar mengelola daftar peserta dalam array statis maksimal 100 orang 
 *               serta menyediakan fungsi registrasi, perhitungan, dan penampilan data peserta.
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class Seminar {
    /**********************ATRIBUT**********************/
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    /**********************METHOD**********************/
    /* Konstruktor */
    public Seminar(){
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0; 
    }

    /* d. prosedur registrasi untuk menambahkan seorang peserta */
    public void registrasi(CivitasAkademika peserta){
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        } 
        else{
            System.out.println("Seminar penuh");
        }
    }

    /* c. menghitung banyaknya peserta seminar */
    public int countPeserta(){
        return banyakPeserta; 
    }

    /* g. Menampilkan dafatr peserta  */
    public void tampilPeserta(){
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }

    /* h. Menghitung banyaknya peserta mahasiswa */
    public int countMahasiswa(){
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
