/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 16 Maret 2025
 */

public class Lingkaran extends BangunDatar implements IResize{
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

    /* Menambah ukuran menjadi 10% lebih besar */
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    /* Mengurangi ukuran menjadi 10% lebih kecil */
    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    /* Menskalakan ukuran sesuai dengan input percent yang diberikan */
    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }

    /* Menampilkan detail lingkaran */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }
}