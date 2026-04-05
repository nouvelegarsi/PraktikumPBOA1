/**
 * File        : AngkaSial.java
 * Deskripsi   : Program penggunaan exeption buatan sendiri 
 *               Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Nouvella Rahma Fitrah Legarsi
 * Tanggal      : 26 Maret 2026
 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*  ===== SOAL =====  */
/*  *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
    *Apakah baris 21 pada AngkaSial.java di atas dieksekusi? */

/*  ===== SOAL =====  */
/* *Ketika program dijalankan, baris 12 yaitu System.out.println(angka+" bukan angka sial"); 
    tidak selalu dieksekusi. Baris tersebut hanya akan dijalankan jika nilai angka bukan 13. 
    Namun, ketika nilai angka adalah 13, program akan mengeksekusi perintah throw new AngkaSialException(); 
    sehingga terjadi exception. Pada saat exception dilempar, alur program di dalam method langsung terhenti 
    dan berpindah ke blok catch, sehingga baris 12 yang berada setelah throw tidak akan dijalankan. 
    
    *Pada baris 21 yaitu blok catch(AngkaSialException ase) akan dieksekusi ketika exception benar-benar terjadi, 
    yaitu saat method cobaAngka(13) dipanggil. Exception yang dilempar akan ditangkap oleh blok catch, 
    kemudian perintah di dalamnya seperti ase.getMessage() dan pesan peringatan akan dijalankan. 
    Setelah exception terjadi, eksekusi di dalam blok try tidak dilanjutkan ke baris berikutnya, 
    sehingga pemanggilan as.cobaAngka(12); tidak akan dieksekusi. 
    
    Dengan demikian, dapat disimpulkan bahwa baris 12 tidak dijalankan saat terjadi exception, 
    sedangkan baris 21 justru dijalankan sebagai bagian dari penanganan error tersebut. */