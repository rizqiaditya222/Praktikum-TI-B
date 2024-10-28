
import java.util.*;
public class utpSUsah {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String emailOld = in.next();
        String nameNew = in.next();
        String domainNew = in.next();
        double harga = in.nextDouble();
        
        String akhiran = "";
        
        for (int i=emailOld.length()-1; i>=0; i--){
            if (emailOld.charAt(i)=='.') {
                akhiran = emailOld.substring(i);
                break;
            }
        }
        
        switch (akhiran) {
            case ".id":
                harga *= 1.75;
                break;
            case ".com":
                harga *= 1.50;
                break;
            case ".net":
                harga *= 1.25;
                break;
        }
        
        System.out.printf("Nama email baru: %s@%s%s \n", nameNew, domainNew, akhiran);
        System.out.printf("Nama domain untuk Elon: %s%s \n",domainNew,akhiran);
        System.out.printf("Total harga pembelian: %.2f$", harga);
    }
}

