/* Nama File    : MGaris.java
 * Deskripsi    : berisi aplikasi method dalam class Garis
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 28 Februari 2025
 */

public class MGaris {
    public static void main(String[] args){
        //Buat titik 
        Titik T1 = new Titik(-2,0);
        Titik T2 =  new Titik(0,4);

        Titik T3 = new Titik(3,4);
        Titik T4 = new Titik(8, 13);

        //Buat garis 
        Garis G1 = new Garis(T1, T2);

        Garis G2 = new Garis();
        G2.setTitikAwal(T3);
        G2.setTitikAkhir(T4);
        
        //Tampilkan garis 
        System.out.println("Tampilkan garis G1 :  ");
        G1.printGaris();

        System.out.println("Tampilkan garis G2 :  ");
        G2.printGaris();

        //Hitung banyak garis yang dibuat 
        System.out.println("Jumlah Objek Garis = " + Garis.getcounterGaris());

        //Hitung panjang garis
        System.out.println("Tampilkan garis G1 :  ");
        G1.printGaris();
        System.out.println("Panjang garis G1 : " + G1.getPanjangGaris());

        //Hitung gradien 
        System.out.println("Tampilkan gradien : " + G1.getGradien());

        //Mencari titik tengah 
        System.out.println("Titik tengah garis : ");
        Titik Ttengah = G1.getTitikTengah();
        Ttengah.printTitik();

        //Mengecek apakah dua garis sejajar 
        System.out.println("Apakah G1 dan G2 sejajar : " + G1.isSejajar(G2));

        //Mengecek apakah dua garis tegak lurus
        System.out.println("Apakah G1 dan G2 saling tegak lurus : " + G1.isTegakLurus(G2));

        //Persamaan Garis 
        System.out.println("Tampilkan garis G1 :  ");
        G1.printGaris();
        System.out.println("Tampilkan persamaan garis G1 : " + G1.getPersamanGaris());

        System.out.println("Tampilkan garis G2 :  ");
        G2.printGaris();
        System.out.println("Tampilkan persamaan garis G2 : " + G2.getPersamanGaris());
    }
}
