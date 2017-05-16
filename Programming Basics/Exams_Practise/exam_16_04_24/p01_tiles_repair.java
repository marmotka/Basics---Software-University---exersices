package exam_16_07_17;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.DoublePredicate;

public class p01_tiles_repair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nSquare = Integer.parseInt(scan.nextLine());
        double tileWidth = Double.parseDouble(scan.nextLine());
        double tileLength = Double.parseDouble(scan.nextLine());
        int benchWidth = Integer.parseInt(scan.nextLine());
        int benchLength = Integer.parseInt(scan.nextLine());


        double tileArea = tileLength * tileWidth;
        int benchArea = benchLength * benchWidth;
        double square = nSquare * nSquare;
        double count = (square - benchArea) / tileArea;

        double time = 0.2 * count;
        System.out.printf("%s%n%s", doubleToStringCSharpLike(count),doubleToStringCSharpLike(time));
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
