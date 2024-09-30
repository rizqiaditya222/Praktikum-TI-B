import java.util.Scanner;
import java.awt.im.InputContext;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //      do {
        //          eksekusi kode
        //      }
        //      while (kondisi);

        // int i = 0;

        // do {
        //     System.out.println("cetak "+i);
        //     i++;
        // } while(i<5);

        int angkaRahasia1 = 17;
        int angkaRahasia2 = 18;
        int angkaRahasia3 = 19;
        // System.out.print("Tebak angkanya : ");
        int inputAngka = 0;

        // while (inputAngka!=angkaRahasia) {
        //     System.out.printf("angka anda %d SALAH!!! coba lagi :)",inputAngka);    
        //     System.out.print("\nTebak angkanya : "); 
        //     inputAngka = input.nextInt();
        // }

        
        do {

            System.out.print("Tebak angkanya : ");
            inputAngka = input.nextInt();
        } while (inputAngka!=angkaRahasia1 && inputAngka!=angkaRahasia2 && inputAngka!=angkaRahasia3);
        
        // System.out.println("BENAR!!! angkanya adalah "+angkaRahasia);

    }
}
