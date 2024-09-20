public class if_else {
    public static void main(String[] args) {
        
        // boolean kondisi = false;

        // if (kondisi) {
        //     System.out.println("Ini bagian if");
        // }else{
        //     System.out.println("Ini bagian false");
        // }


        // int kondisi = 3;

        // if (kondisi>5) {
        //     System.err.println("Ini bagian if");
        // }else if (kondisi==5) {
        //     System.err.println("Ini bagian else if");
        // }else{
        //     System.out.println("Ini bagian else");
        // }

        
        // int kondisi1 = 5;
        
        // if (kondisi1>4 || kondisi2>10) {
            //     System.err.println("Ini bagian if");
            // }
            // else if (kondisi1>=5 || kondisi2>=10) {
                //     System.err.println("Ini bagian else if");
        // }
        // else{
            //     System.out.println("Ini bagian else");
            // }
            
            
        int kondisi2 = 10;
        String hari = "SeLaSa";

        if (hari.equalsIgnoreCase("selasa") || kondisi2 < 10) {
            System.out.println("Hari ini adalah hari selasa kliwon");
        }else if (hari.equalsIgnoreCase("selasa") || kondisi2 >= 10){
            System.out.println("Hari ini adalah hari selasa Pahing");
        }
        else {
            System.out.println("Tidak diketahui hari apa");
        }
    }
}
