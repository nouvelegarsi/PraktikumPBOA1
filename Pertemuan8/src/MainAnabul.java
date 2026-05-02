/**
 * File        : MainAnabul.java
 * Deskripsi   : Program untuk mengilustrasikan kelas generik Datum dengan menggunakan
 *               keluarga kelas Anabul 
 * Pembuat     : Nouvella Rahma Fitrah Legarsi
 * Tanggal     : 1 Mei 2026
 */

public class MainAnabul {
    public static void main(String[] args) {
        /* Membuat object datum */
        Datum<Anabul> dataAnabul = new Datum<>();

        /* Membuat object kucing anggora dan kembang telon */
        Anggora anggora = new Anggora("Oreo", 4.2);
        Kembangtelon kembangtelon = new Kembangtelon("Pilus", 3.9);

        /* Mengisi data anabul dengan objek anggora */
        dataAnabul.setIsi(anggora);
        dataAnabul.getIsi().gerak();
        dataAnabul.getIsi().bersuara();

        /* Mengisi data anabul dengan objek kembangtelon */
        dataAnabul.setIsi(kembangtelon);
        dataAnabul.getIsi().gerak();
        dataAnabul.getIsi().bersuara();

        System.out.println("\n===APLIKASI TUKAR===");
        /* Aplikasi prosedur Tukar untuk sesama integer */
        System.out.println("Tukar sesama interger");
        Ref<Integer> aInt = new Ref<>(3);
        Ref<Integer> bInt = new Ref<>(10);
        System.out.println("Sebelum Tukar : a = " + aInt.val + " b = " + bInt.val);
        OperatorGenerik.Tukar(aInt, bInt);
        System.out.println("Setelah Tukar : a = " + aInt.val + " b = " + bInt.val);

        /* Aplikasi prosedur Tukar untuk sesama string */
        System.out.println("\nTukar sesama String");
        Ref<String> aStr = new Ref<>("Makan");
        Ref<String> bStr = new Ref<>("Malam");
        System.out.println("Sebelum Tukar : a = " + aStr.val + " b = " + bStr.val);
        OperatorGenerik.Tukar(aStr, bStr);
        System.out.println("Setelah Tukar : a = " + aStr.val + " b = " + bStr.val);

        /* Aplikasi prosedur Tukar untuk sesama keluarga anabul */
        System.out.println("\nTukar sesama keluarga Anabul");
        Ref<Anabul> aAnabul = new Ref<>(new Anjing("Coco"));
        Ref<Anabul> bAnabul = new Ref<>(new Kucing("Nemo", 3.3));
        System.out.println("Sebelum Tukar : a = " + aAnabul.val.getClass().getSimpleName() + " b = " + bAnabul.val.getClass().getSimpleName());
        OperatorGenerik.Tukar(aAnabul, bAnabul);
        System.out.println("Setelah Tukar : a = " + aAnabul.val.getClass().getSimpleName() + " b = " + bAnabul.val.getClass().getSimpleName());

        System.out.println("\n===APLIKASI BOBOT2===");
        Anggora kucingA = new Anggora("Moli", 4.0);
        Kembangtelon kucingB = new Kembangtelon("Sapi", 4.8);
        double TotalBobot = OperatorGenerik.Bobot2(kucingA, kucingB);
        System.out.println("Total bobot 2 kucing : " + TotalBobot + " kg");

        /* Aplikasi untuk kelas generik data */
        System.out.println("\n===APLIKASI KELAS DATA===");
        /* Membuat data yang merupakan keluarga anabul */
        Data<Anabul> data = new Data<>(); 

        /* Mengisi data dengan keluarga anabul */
        data.setIsi(1, anggora);
        data.setIsi(2, kembangtelon);
        data.setIsi(3, kucingA);
        data.setIsi(4, kucingB);

        /* Mengembalikan banyak elemen di data */
        System.out.println("Jumlah Anabul = " + data.getSize());

        /* Mengembalikan isi dalam data */
        System.out.println("Isi data : ");
        for(int i = 1; i <= data.getSize(); i++){
            Anabul a = data.getIsi(i);
            if(a != null){
                a.gerak();
                a.bersuara();
                System.out.println();
            }
        }
    }
}

/* RENUNGAN : 
   Cara kerja konsep Generik adalah dengan membuat sebuah kelas 
   atau metode yang dapat digunakan untuk berbagai tipe data tanpa 
   harus menuliskan ulang kode yang sama. Tipe data tersebut 
   digantikan sementara dengan parameter tipe (misalnya <T>), 
   lalu akan ditentukan saat objek dibuat. Dengan begitu, 
   satu kelas dapat menyimpan dan mengolah berbagai jenis objek 
   secara fleksibel */

