import java.util.Arrays;
import java.util.Collections;

public class arrayLanjutan {
    public static void main(String[] args) {

        String nama = "Dimas,Deni,Danu,Dion,damar";
        String [] namaArray = nama.split(",");
        Arrays.sort(namaArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(namaArray));



        // int num = 1;
        // boolean num2 = num;
        // System.out.println("num int: "+num);
        // System.out.println("num double: "+num2);

        // double num = 10;
        // int num2 = (int) num;
        // System.out.println("num double: "+num);
        // System.out.println("num int: "+num2);

        // String numString = "a";
        // int num = 9;

        // double num2 = Double.parseDouble(numString);

        // System.out.println(num2+num);
    }
}
