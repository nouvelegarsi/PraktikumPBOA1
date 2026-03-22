/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class Bangun Datar
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 16 Maret 2025
 */

public abstract class BangunDatar {
    /**********************ATRIBUT**********************/
    private int jmlSisi;
    private String warna;
    private String border;  

    /**********************METHOD**********************/
    /* Konstruktor tanpa parameter */
    public BangunDatar(){

    }

    /* Konstruktor dengan parameter */
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    /* Mengembalikan jumlah sisi */
    public int getJmlSisi(){
        return jmlSisi;
    }

    /* Mengeset jumlah sisi */
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    /* Mengembalikan nilai warna */
    public String getWarna(){
        return warna;
    }

    /* Mengeset nilai warna */
    public void setWarna(String Warna){
        this.warna = Warna;
    }

    /* Mengembalikan nilai border */
    public String getBorder(){
        return border;
    }

    /* Mengeset nilai border */
    public void setBorder(String border){
        this.border = border;
    }

    /* Abstrack method mengembalikan luas bangun datar */
    public abstract double getLuas();

    /* Abstrack method mengembalikan keliling bangun datar */
    public abstract double getKeliling();

    
    /* Mengembalikan true apabila dua bangun datar memiliki luas yang sama */
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    /* Menampilkan detail bangun datar */
    public void printInfo(){
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}
