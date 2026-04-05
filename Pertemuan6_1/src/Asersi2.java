/**
 * File        : Asersi2.java
 * Deskripsi   : Program untuk demo asersi, yang akan menolak input
 *               jari-jari lingkaran yang bernilai nol
 * Pembuat      : Nouvella Rahma Fitrah Legarsi
 * Tanggal      : 26 Maret 2026
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";

        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*  ===== SOAL =====  */
/*  secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
    Jelaskan pada lembar laporan praktikum!  */

/* ===== JAWAB =====  */
/*  Penggunaan assert pada program Asersi2 kurang tepat karena assertion 
    digunakan untuk validasi nilai input (jariJari), padahal assertion seharusnya 
    hanya digunakan untuk debugging dan bukan untuk menangani kesalahan input pengguna. 
    Selain itu, assertion tidak selalu aktif saat program dijalankan sehingga kesalahan 
    dapat terlewat. Oleh karena itu, validasi seperti ini sebaiknya menggunakan mekanisme 
    lain seperti percabangan if atau exception handling.  */