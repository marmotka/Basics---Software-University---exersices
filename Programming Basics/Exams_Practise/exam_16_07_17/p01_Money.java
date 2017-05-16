package exam_16_07_17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p01_Money {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scan.nextLine());
        double uan = Double.parseDouble(scan.nextLine());
        double comission = Double.parseDouble(scan.nextLine());

        double euro = (bitcoin * 1168 + 0.15 * 1.76 * uan) / 1.95;
        double sum = euro - (comission/100.00)*euro;
        System.out.println(doubleToStringCSharpLike(sum));
            }


    private static String doubleToStringCSharpLike(double value) {
        int digits = 15;

        if (Math.abs(value) >= 1.0d) {
            digits -= Double.toString(value).split("[.,]")[0].length();
        }

        String format = "0." + new String(new char[digits]).replace("\0", "#");
        DecimalFormat df = new DecimalFormat(format);

        return df.format(value);
    }
}
