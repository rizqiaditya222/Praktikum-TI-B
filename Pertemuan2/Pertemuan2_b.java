import java.util.Scanner;

public class Pertemuan2_b {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama:");
        String nama = input.nextLine();
        
        input.nextLine();

        System.out.println("Masukkan nim:");
        long nim = input.nextLong();
        
        //jarak aja si hehe
        System.out.println();

        System.out.println("Output:");
        System.out.println(nim);
        System.out.println(nama);
	}
}