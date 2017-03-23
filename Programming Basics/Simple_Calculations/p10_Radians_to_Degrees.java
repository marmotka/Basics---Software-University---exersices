import java.util.Scanner;

public class p10_Radians_to_Degrees {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double rad = Double.parseDouble(console.nextLine());
        double deg = rad * 180 / Math.PI;

        System.out.printf("%.2f", deg);
    }
}
