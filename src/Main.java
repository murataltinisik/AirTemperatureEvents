import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int heat;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Sıcaklık Giriniz: ");
        heat = sc.nextInt();

        // 1
        if(heat < 5){
            System.out.println("Kayak Yapabilirsiniz...");
        }else if(heat <= 25){
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz...");
            }

            if (heat >= 10) {
                System.out.println("Pinkiğe Gidebilirsiniz...");
            }
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz...");
        }

        // 2
        if(heat < 5){
            System.out.println("Kayak Yapabilirsiniz...");
        }else if(heat <= 15){
            if(heat >= 10){
                System.out.println("Pinkiğe Gidebilirsiniz...");
            }
            System.out.println("Sinemaya Gidebilirsiniz...");
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz...");
        }

        // 3
        if(heat < 5){
            System.out.println("Kayak Yapabilirsiniz...");
        }else if(heat >= 10){
            System.out.println("Pinkiğe Gidebilirsiniz...");
            if(heat <= 15){
                System.out.println("Sinemaya Gidebilirsiniz...");
            }
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz...");
        }

    }
}
