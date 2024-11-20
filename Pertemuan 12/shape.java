public class shape {
    public static void main(String[] args) {
        shape lingkaran1 = new shape();
        System.out.println(lingkaran1.luasLingkaran(7));

        shape segitiga1 = new shape();
        System.out.println(segitiga1.luasSegitiga(26, 39.3));
}

    public double luasLingkaran (double  r){
        return Math.PI*r*r;
    }
    
    public double luasSegitiga (double  alas, double tinggi){
        double luas = (alas*tinggi)*0.5;
        return luas;
    }
}
