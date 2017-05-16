package exam_16_04_24;

import java.util.Scanner;

public class p03_Operations_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operation = scan.nextLine();
        char math = operation.charAt(0);

        if (n2 == 0 && (operation.equals("/") || operation.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", n1);
        } else if (operation.equals("+") || operation.equals("-") || operation.equals("*")) {
            int num = 0;

            switch (math) {
                case ('+'):
                    num = n1 + n2;
                    break;
                case ('-'):
                    num = n1 - n2;
                    break;
                case ('*'):
                    num = n1 * n2;
                    break;
            }
            String evenOdd = "";
            if (num % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
            System.out.printf("%d %s %d = %d - %s", n1, operation, n2, num, evenOdd);
        } else if (operation.equals("/")) {
            double num = (n1 * 0.1) / (n2 * 0.1);
            System.out.printf("%d / %d = %.2f", n1, n2, num);
        } else {
            System.out.printf("%d %s %d = %d", n1, operation, n2, (n1 % n2));


        }
    }
}

