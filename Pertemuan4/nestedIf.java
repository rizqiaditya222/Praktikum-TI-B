public class nestedIf {
    public static void main(String[] args) {
        int Bilangan = 30;
        if (Bilangan>10 && Bilangan<=20){
            System.out.println("Bilangan di antara 10 & 20");
        } else if (Bilangan>10 && Bilangan<=20){
            System.out.println("Bilangan di antara 20 & 30");
        } else if (Bilangan>20 && Bilangan<=30){
            if (Bilangan%2==0){
                System.out.println("Bilangan Berada di antara 20 & 30 dan bernilai genap");
            } else {
                System.out.println("Bilangan Berada di antara 20 & 30 dan bernilai ganjil");
            }
        } else if (Bilangan>30 && Bilangan<=40){
            System.out.println("Bilangan di antra 30 & 40");
        } else {
            System.out.println("Bilangan lain");
        }   
    }
}