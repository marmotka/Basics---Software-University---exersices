package EXAM_2017_05_07;

import java.util.Scanner;

public class p06_3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int lo = Integer.parseInt(scanner.nextLine());
        int specialNum = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());

        int a;
        int b;
        int c;
        int newNum;

        for (int i = m; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = lo; k >= 1; k--) {

                    a = i * 100;
                    b = j * 10;
                    c = k;

                    newNum = a + b + c;

                    if (newNum % 3 == 0) {
                        specialNum += 5;

                    } else if (newNum % 10 == 5) {
                        specialNum -= 2;

                    } else if (newNum % 2 == 0) {
                        specialNum *= 2;

                    }
                    if (specialNum >= controlNum) {
                        break;
                    }
                }
                if (specialNum >= controlNum) {
                    break;
                }
            }
            if (specialNum >= controlNum) {
                break;
            }
        }


        if (specialNum >= controlNum) {
            System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNum);
        } else {
            System.out.printf("No! %d is the last reached special number.", specialNum);
        }
    }
}

