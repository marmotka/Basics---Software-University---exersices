import java.util.Scanner;


public class p02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner dim = new Scanner(System.in);
        System.out.println("Your measurement in inches=");
        double a = Double.parseDouble(dim.nextLine());
        double b = a * 2.54;
        System.out.println(b);
    }
}
