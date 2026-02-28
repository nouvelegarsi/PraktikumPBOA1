/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 23 Februari 2025
 */

public class Titik {
    /**********************ATRIBUT**********************/
    private double absis;
    private double ordinat;
    static int counterTitik = 0;

    /**********************METHOD**********************/
    //Konstruktor untuk membuat titik (0,0)
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //Konstruktor untuk membuat titik(0,0)
    public Titik(){
        this(0,0); 
    }

    //Mengembalikan nilai counterTitik
    public static int getcounterTitik(){
        return counterTitik;
    }

    //Mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mencari Kuadran dari titik
    int getKuadran(){
        if (this.absis > 0){
            if(this.ordinat < 0 ){
                return 4;
            }
            else{
                return 1;
            }
        }
        else{
            if(this.ordinat < 0){
                return 3; 
            }
            else{
                return 2;
            }
        }
    }

    //Mencari jarak titik ke titik pusat 
    double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    // Mencari jarak antara dua titik 
    double getJarak(Titik T){ 
        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2)); 
    }

    //Mencari Refleksi titik terhadap sumbu X
    void refleksiX(){
        this.ordinat = ordinat *(-1);
    }

    //Mencari refleksi titik terhadap sumbu y 
    void RefleksiY(){
        this.absis = absis * (-1);
    }

    //Menghasilkan titik baru yang merupakan hasil refleksi terhadap sumbu X 
    Titik getReleksiX(){
        return new Titik(this.absis, this.ordinat * (-1)); 
    }

    //Menghasilkan titik baru yang merupakan hasil refleksi terhadap sumbu Y
    Titik getReleksiY(){
        return new Titik(this.absis * (-1), this.ordinat); 
    }

    //Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(counterTitik);
    }
}
