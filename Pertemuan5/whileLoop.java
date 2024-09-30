import com.sun.source.tree.SwitchTree;
import java.util.Scanner;
public class whileLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String nama = "thanos";
            //  while (true) {
            //      System.out.println("Hello");
            //  }

        // while(true){
        //     System.out.println("Halo semua");
        // }

        // int hitungLoop = 0;
        // while(hitungLoop<3){
        //     System.out.println("Halo oll");
        //     hitungLoop++;
        // }


        // //break & continue

        // int hitungLoop = 0;
        // while (true) { 
        //     if (hitungLoop<5){
        //         System.out.println("Hello");
        //     } else{
        //         break;
        //     }
        //     hitungLoop++;

        // }
        
        // while (true) { 
        //     System.out.print("Masukkan Nama : ");
        //     String inputNama = input.nextLine();
            
        //     if (inputNama.equals("berhenti")){
        //         break;
        //     } else {
        //         System.out.println("Nama kamu "+inputNama);
        //     }
        // }

        int angka = 0;
        while (angka <= 10) {
            // if(angka==5){
            //     angka++;
            //     continue;
            // }
            System.out.println("Halo");
            continue;
            angka++;

            System.out.println("print angka "+angka);
        }
        
    }
}