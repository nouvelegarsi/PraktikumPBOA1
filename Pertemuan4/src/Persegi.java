/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 09 Maret 2025
 */

public class Persegi extends BangunDatar {
    /**********************ATRIBUT**********************/
    private double sisi;

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public Persegi(){
        setJmlSisi(4);
    }

    /* Konstruktor dengan parameter */
    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    /* Mengembalikan nilai jumlah sisi pada persegi */
    public double getSisi(){
        return sisi; 
    }

    /* Mengesetnilai jumlah sisi pada persegi */
    public void setSisi(double sisi){
        this.sisi = sisi; 
    }

    /* Mengembalikan nilai luas pada persegi */
    public double getLuas(){
        return this.sisi * this.sisi;
    }

    /* Mengembalikan nilai keliling pada persegi */
    public double getKeliling(){
        return 4*this.sisi;
    }

    /* Mengembalikan nilai diagonal pada persegi */
    public double getDiagonal(){
        return this.sisi * Math.sqrt(2);
    }

    /* Menampilkan detail persegi */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }
}