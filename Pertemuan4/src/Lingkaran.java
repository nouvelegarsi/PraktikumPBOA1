/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 09 Maret 2025
 */

public class Lingkaran extends BangunDatar{
    /**********************ATRIBUT**********************/
    private double jari;

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public Lingkaran(){
        setJmlSisi(1);
    }

    /* Konstruktor dengan parameter */
    public Lingkaran (double diameter, String warna, String border){
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
    }

    /* Mengembalikan nilai jari-jari pada lingkaran */
    public double getJari (){
        return jari; 
    }

    /* Mengeset nilai jari-jari pada lingkaran */
    public void setJari(double jari){
        this.jari = jari;
    }

    /* Mengembalikan nilai luas pada lingkaran */
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    /* Mengembalikan nilai keliling pada lingkaran */
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    /* Menampilkan detail lingkaran */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }
}