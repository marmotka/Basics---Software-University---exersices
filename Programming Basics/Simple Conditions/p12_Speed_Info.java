import java.util.Scanner;

public class p12_Speed_Info {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double sp = Double.parseDouble(console.nextLine());

        if (sp > 1000) {
            System.out.println("extremely fast");
        } else if (sp > 150) {
            System.out.println("ultra fast");
        } else if (sp > 50) {
            System.out.println("fast");
        } else if (sp > 10) {
            System.out.println("average");
        } else {
            System.out.println("slow");
        }

    }
}
