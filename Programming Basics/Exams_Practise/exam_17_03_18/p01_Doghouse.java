package exam_17_03_18;

        import java.util.Scanner;

public class p01_Doghouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());

        double walls = a * a + (a * a / 2) + (a / 2 * (b - a / 2)) - a * a / 25;
        double roof = a * a;
        double green = walls / 3;
        double red = roof / 5;
        System.out.printf("%.2f%n",green);
        System.out.printf("%.2f",red);

    }
}
