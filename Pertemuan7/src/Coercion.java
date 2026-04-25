/**
 * File        : Coercion.java
 * Deskripsi   : Program untuk demo coercion (Konversi tipe data)
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 24 April 2026
 */

public class Coercion {
    public static void main(String[] args) {
        /* a. Konversi nilai integer ke double/real dan char */
        System.out.println("a. Konversi nilai integer ke double/real dan char"); 
        int nilaiInt = 65;
        System.out.println("Integer : " + nilaiInt);

        /* 1) Konversi ke karakter */
        char nilaiChar = (char) nilaiInt;
        System.out.println("Karakter : " + nilaiChar);

        /* 2) Konversi ke double */
        double nilaiDouble = (double) nilaiInt; 
        System.out.println("Double : " + nilaiDouble);

        /* b. Mengembalikan real / double ke integer  */
        System.out.println("\nb. Mengembalikan real / double ke integer"); 
        int nilaiIntLagi = (int) nilaiDouble;
        System.out.println("Integer dari Double : " + nilaiIntLagi);

        /* c. Konkatenesi dan Penjumlahan ke Integer dari String X dan Y*/
        System.out.println("\nc. Konkatenesi dan Penjumlahan ke Integer dari String X dan Y"); 
        String X = "1234";
        String Y = "5678";

        /* 1) Konkatenasi */
        String S = X + Y; 
        System.out.println("S (konkatenasi) : " + S);

        /* 2) Penjumlahan */
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Z (Penjumlahan) : " + Z);

        /* d. Konkatenesi dan Penjumlahan ke Double dari String P dan Q */
        System.out.println("\nd. Konkatenesi dan Penjumlahan ke Double dari String P dan Q"); 
        String P = "12.34";
        String Q = "56.78";

        /* 1) Konkatenasi */
        String R = P + Q; 
        System.out.println("R (konkatenasi) : " + R);

        /* 2) Penjumlahan */
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("D (Penjumlahan) : " + D);

        /* e. Konversi nilai S ke Integer A */
        System.out.println("\ne.  Konversi nilai S ke Integer A");
        Integer A = Integer.parseInt(S);
        System.out.println("A : " + A); 

        /* f. Konversi nilai A ke String T */
        System.out.println("\nf. Konversi nilai A ke String T");
        String T = A.toString();
        System.out.println("T : " + T);
    }
}
