/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi aplikasi method dalam class Bangun Datar
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 16 Maret 2025
 */

public class MBangunDatar{
    public static void main (String[] args){
        /* Membuat object persegi  */
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");

        /* Membuat object lingkaran */
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam");

        /* Menampilkan detail persegi dan lingkaran */
        System.out.println("Tampilkan detail Persegi : ");
        Persegi1.printInfo();
        System.out.println("Tampilkan detail Lingkaran : ");
        Lingkaran1.printInfo();

        /* Menampilkan Keliling Persegi */
        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());

        /* Menampilkan Luas persegi */
        System.out.println("Luas Persegi : " + Persegi1.getLuas());

        /* Menampilkan Keliling Lingkaran */
        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());

        /* Menampilkan Luas Lingkaran */
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());

        /* Mengecek apakah dua bangun datar sama */
        System.out.println("Apakah luasnya sama : " + Persegi1.isEqualLuas(Lingkaran1));

        System.out.println("\n===IRESIZE===");

        System.out.println("---ZOOM IN---");
        /* Menambah ukuran bangun datar menjadi 10% lebih besar */
        System.err.println("Sisi awal : " + Persegi1.getSisi());
        Persegi1.zoomIn();
        System.out.println("Sisi setelah zoomIn : " + Persegi1.getSisi());

        System.out.println("\n---ZOOM OUT---");
        /* Mengurangi ukuran menjadi 10% lebih kecil */
        System.out.println("Jari-jari awal : " + Lingkaran1.getJari());
        Lingkaran1.zoomOut();
        System.out.println("Jari-jari setelah zoomOut : " + Lingkaran1.getJari());

        System.out.println("\n---ZOOM PERCENT---");
        /* Menskalakan ukuran sesuai dengan input percent yang diberikan */
        System.out.println("Jari-jari awal : " + Lingkaran1.getJari());
        Lingkaran1.zoom(50);;
        System.out.println("Jari-jari setelah zoom skala 50% : " + Lingkaran1.getJari());
    }
}