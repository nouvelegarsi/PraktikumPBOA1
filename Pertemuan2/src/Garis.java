/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 28 Februari 2025
 */

public class Garis {
    /**********************ATRIBUT**********************/
    private Titik tAwal;
    private Titik tAkhir;
    private static int counterGaris = 0;

    /**********************METHOD**********************/
    public Garis(Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir =tAkhir;
        counterGaris++;
    }
    
    public Garis(){
        this(new Titik(0,0), new Titik(1,1));
    }

    // Selektor untuk mengembalikan titik awal 
    public Titik getTitikAwal(){
        return tAwal;
    }

    // Selektor untuk mengembalikan titik akhir 
    public Titik getTitikAkhir(){
        return tAkhir; 
    }

    // Selektor untuk mengembalikan banyak garis yang dibuat 
    public static int getcounterGaris(){
        return counterGaris;
    }

    // Mutator untuk mengubah titik awal 
    public void setTitikAwal(Titik T){
        tAwal = T; 
    }

    // Mutator untuk mengubah titik akhir
    public void setTitikAkhir(Titik T){
        tAkhir = T; 
    }

    // Menghitung panjang dari garis 
    public double getPanjangGaris(){
        return tAwal.getJarak(tAkhir);
    }

    //Menghitung gradien dari sebuah garis 
    public double getGradien(){
        return ((tAkhir.getOrdinat() - tAwal.getOrdinat()) / (tAkhir.getAbsis() - tAwal.getAbsis())); 
    }

    //Mencari titik tengah dari sebuah garis 
    public Titik getTitikTengah(){
        double x = (tAwal.getAbsis() + tAkhir.getAbsis())/2 ;
        double y = (tAwal.getOrdinat() + tAkhir.getOrdinat()) / 2;  

        return new Titik(x,y); 
    }

    //Mengecek apakah dua garis sejajar 
    public boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    //Mengecek apakah dua garis saling tegak lurus
    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1; 
    }

    //Menampilkan garis berupa titik awal dan titik akhir 
    public void printGaris(){
        System.out.println("Titik awal : ");
        tAwal.printTitik();

        System.out.println("Titik akhir : ");
        tAkhir.printTitik();
    }

    //Menampilkan persamaan garis 
    public String getPersamanGaris(){
        double m = getGradien();
        double x = tAwal.getAbsis();
        double y = tAwal.getOrdinat();
        double c = y - m * x;
        
        return "y = " + m + "x + " + c;
    }
}
