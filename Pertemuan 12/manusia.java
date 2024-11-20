import java.util.*;
public class manusia {
    public static void main(String[] args) {

        manusia iqbal = new manusia();
        iqbal.sapa2();

        sapa("Mevya");

        int[] myArray = new int[5];
        inputArray(myArray);
        cetakArray(myArray);


    }

    public static void sapa (String nama){
        System.out.println("Halo " +nama);
    }

    public void sapa2 (){
        System.out.println("Halo2");
    }

    //method untuk menginput array
    public static void inputArray (int [] arrayInput){
        Scanner input = new Scanner (System.in);
        for (int i=0;i<arrayInput.length;i++){
            System.err.print("Masukkan elemen array ke "+i+": ");
            arrayInput[i] = input.nextInt();
        }
    }

    //method untuk mencetak array
    public static void cetakArray (int [] arrayInput){
        System.out.println("Berikut merupakan isi array: ");
        for (int i = 0; i < arrayInput.length; i++) {
            System.out.println(arrayInput[i]);
        }
    }
}