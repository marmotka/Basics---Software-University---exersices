import java.text.DecimalFormat;
import java.util.Scanner;

public class p13_Area_of_Figures {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String fig = console.nextLine();

        DecimalFormat df = new DecimalFormat("0.###");

        if ("square".equals(fig)) {
            double a = Double.parseDouble(console.nextLine());
            System.out.println(df.format(a * a));

        } else if ("rectangle".equals(fig)) {
            double b = Double.parseDouble(console.nextLine());
            double c = Double.parseDouble(console.nextLine());

            System.out.println(df.format(c * b));


        } else if ("circle".equals(fig)) {
            double r = Double.parseDouble(console.nextLine());
            System.out.println(df.format(r * r * Math.PI));

        } else if ("triangle".equals(fig)) {
            double d = Double.parseDouble(console.nextLine());
            double e = Double.parseDouble(console.nextLine());
            System.out.println(df.format(d * e / 2));
        }

    }
}
