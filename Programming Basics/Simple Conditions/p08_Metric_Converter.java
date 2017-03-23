import java.util.Scanner;

public class p08_Metric_Converter {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double n = Double.parseDouble(console.nextLine());
        String inp = console.nextLine();
        String outp = console.nextLine();

        double m = 1;
        double mm = 0.001;
        double cm = 0.01;
        double mi = 1 / 0.000621371192;
        double in = 1 / 39.3700787;
        double km = 1000;
        double ft = 1 / 3.2808399;
        double yd = 1 / 1.0936133;

        if ("m".equals(inp)) {
            n = n * m;
        } else if ("mm".equals(inp)) {
            n = n * mm;
        } else if ("cm".equals(inp)) {
            n = n * cm;
        } else if ("mi".equals(inp)) {
            n = n * mi;
        } else if ("km".equals(inp)) {
            n = n * km;
        } else if ("ft".equals(inp)) {
            n = n * ft;
        } else if ("yd".equals(inp)) {
            n = n * yd;
        } else if ("in".equals(inp)) {
            n = n * in;
        }

        if ("m".equals(outp)) {
            n = n / m;
        } else if ("mm".equals(outp)) {
            n = n / mm;
        } else if ("cm".equals(outp)) {
            n = n / cm;
        } else if ("mi".equals(outp)) {
            n = n / mi;
        } else if ("km".equals(outp)) {
            n = n / km;
        } else if ("ft".equals(outp)) {
            n = n / ft;
        } else if ("yd".equals(outp)) {
            n = n / yd;
        } else if ("in".equals(outp)) {
            n = n / in;
        }

        System.out.printf("%.14f %s", n, outp);
    }

}
