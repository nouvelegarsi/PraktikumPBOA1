/* Nama File    : MTitik.java
 * Deskripsi    : berisi aplikasi method dalam class Titik
 * Pembuat      : Nouvella Rahma Fitrah Legarsi
 * Tanggal      : 23 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        //Refleksi terhadap sumbu x 
        System.out.println("Reflesi terhadap sumbu x : ");
        T1.refleksiX();
        T1.printTitik();

        //Refleksi terhadap sumbu y
        System.out.println("Reflesi terhadap sumbu y : ");
        T1.RefleksiY();
        T1.printTitik();

        //Mencari Kuadran 
        System.out.println("T1 ada di kuadran = " + T1.getKuadran());

        //Mencari jarak titik ke titik pusat
        System.out.println("Jarak titik T1 ke Pusat = " + T1.getJarakPusat());
        System.out.println("Jarak antara T1 dan T2  = " + T1.getJarakPusat());

        Titik T2 = new Titik();
        T2.setAbsis(3);
        T2.setOrdinat(5);
        System.out.println("Jumlah Objek Titik = " + Titik.getcounterTitik());
        //System.out.println("Jumlah Objek Titik = " + T2.getcounterTitik());

        // Mencari jarak antara dua titik
        System.out.println("Tampilkan Titik : ");
        T1.printTitik();
        T2.printTitik();
        System.out.println("Jarak antara T1 dan T2  = " + T1.getJarak(T2));

        //Menghasilkan titik baru yang merupakan hasil refleksi terhadap sumbu XSystem.out.println("Tampilkan Titik : ");
        T2.printTitik();
        System.out.println("Hasil refleksi terhadap sumbu x   = " );
        Titik T3 = T2.getReleksiX();
        T3.printTitik();

        //Menghasilkan titik baru yang merupakan hasil refleksi terhadap sumbu Y
        System.out.println("Tampilkan Titik : ");
        T1.printTitik();
        System.out.println("Hasil refleksi terhadap sumbu y   = " );
        Titik T4 = T1.getReleksiY();
        T4.printTitik();
    }
}
