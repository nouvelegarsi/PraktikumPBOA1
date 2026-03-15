/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi aplikasi method dalam class Bangun Datar
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 09 Maret 2025
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
    }
}