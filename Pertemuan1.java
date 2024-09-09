import java.util.Scanner;

public class Pertemuan1 {
    public static void main(String[] args) {
        // Variable
        int angka1;
        String nama;

        angka1 = 1;
        nama = "";

        int angka2 = 2;


        // Tipe Data
        byte variabel_Byte = 127;
        short variabel_Short = 32767;
        int variabel_Integer = 3;
        long variabel_Long = 4;

        float variabel_Float = 1.1f;
        double variabel_Double = 1.2;

        char variabel_Char = 'a';
        String variable_String = "Hallo semua";

        boolean variable_Boolean = true;



        // Output
        System.out.println("Hello World!");
        System.out.print("Hello World!");
        System.out.print("Hello World!");

        int num = 1;
        int num2 = 2;
        double angka = 1.5;
        String name = "nofal";

        System.out.printf("umur %s adalah %d tahun dan %.2f bulan \n",name, num2, angka);
        System.out.println("Hello");


        System.out.printf("%d angka adalah %d",num,num2);
        System.out.println("");
        System.out.println(num + " angka adalah " + num2);
        
        // %d = bilangan bulat
        // %f = bilangan desimal
        // %s = string

        Scanner input = new Scanner(System.in);

        String namaKamu;
        namaKamu = input.nextLine();

        System.out.println(namaKamu);



        
    }
}