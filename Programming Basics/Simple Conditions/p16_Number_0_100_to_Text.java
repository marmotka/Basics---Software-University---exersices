import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p16_Number_0_100_to_Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (a > 100 || a < 0) {
            System.out.println("invalid number");

        } else if (a == 100) {
            System.out.println("one hundred");
        } else if (a >= 0 && a < 20) {
            System.out.println(numbers[a]);

        } else if (a % 10 == 0) {
            System.out.println(tens[a / 10]);

        } else if (a % 10 != 0) {
            int des = a / 10;
            int ed = a % 10;

            System.out.println(tens[des] + " " + numbers[ed]);


        }

    }
}
