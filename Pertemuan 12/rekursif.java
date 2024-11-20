public class rekursif {
    public static void main(String[] args) {
        System.out.println(tambah(4));
    }

    public static int tambah (int angka){
        if (angka==0){
            return 0;
        } else {
            return angka + tambah(angka-1);
        }
    }
}
