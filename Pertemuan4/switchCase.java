public class switchCase{
    public static void main(String[] args) {
        // Switch Case

        // int expression;
        // switch(expression) {
        //     case x:
        //       // code block
        //       break;
        //     case y:
        //       // code block
        //       break;
        //     default:
        //       // code block
        //   }
          double num = 2;
          // String day = "Senin";
          // String jenisHari = "Kliwon";
          switch (num) {
            case 2:
              System.out.println("Hari ini adalah hari Selasa");
              break;
            case "Rabu":
              System.out.println("Hari ini adalah hari Rabu");
              break;
            case "Kamis":
              System.out.println("Hari ini adalah hari Kamis");
              break;
            case "Jumat":
              System.out.println("Hari ini adalah hari Jumat");
              break;
            case "Sabtu":
              System.out.println("Hari ini adalah hari Sabtu");
              break;
            case "Minggu":
              System.out.println("Hari ini adalah hari senin");
              break;
            default:
              System.out.println("Hari invalid");   
              break;
          }
    }
}