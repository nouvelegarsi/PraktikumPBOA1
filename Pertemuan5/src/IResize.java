/* Nama File    : IRezie.java
 * Deskripsi    : berisi atribut dan method dalam class interface IResize
 * Pembuat      : Nouvella Rahma Fitrah Legarsi 
 * Tanggal      : 16 Maret 2025
 */


public interface IResize {
    /* Menambah ukuran menjadi 10% lebih besar */
    public void zoomIn();

    /* Mengurangi ukuran menjadi 10% lebih kecil */
    public void zoomOut();

    /* Menskalakan ukuran sesuai dengan input percent yang diberikan */
    public void zoom(int percent);
} 
