package EXAM_2017_05_07;

import java.util.Scanner;

public class p05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int width = 2 * n - 1;
        int height = (n / 2) + 4;
        int empty = (width - 3) / 2;

        System.out.printf("@%s@%s@%n", print(" ", empty), print(" ", empty));
        System.out.printf("**%s*%s**%n", print(" ", empty - 1), print(" ", empty - 1));
        int dotsSide = 1;
        int dotsMiddle = 1;
        empty = (width - 6 - dotsMiddle - (dotsSide * 2)) / 2;
        for (int i = 0; i < (n / 2) - 2; i++) {
            System.out.printf("*%s*%s*%s*%s*%s*%n", print(".", dotsSide),
                    print(" ", empty),
                    print(".", dotsMiddle),
                    print(" ", empty),
                    print(".", dotsSide));
            dotsSide++;
            dotsMiddle += 2;
            empty -= 2;
        }
        System.out.printf("*%s*%s*%s*%n", print(".", dotsSide),
                print(".", dotsMiddle),
                print(".", dotsSide));
        dotsSide ++;
        int stars = (width-3 - dotsSide*2)/2;
        System.out.printf("*%s%s.%s%s*%n", print(".", dotsSide),
                print("*", stars),
                print("*", stars),
                print(".", dotsSide));
        System.out.printf("%s%n",print( "*", width));
        System.out.printf("%s%n",print( "*", width));

    }


    private static String print(String element, int count) {
        String test = new String(new char[count]).replace("\0", element);
        return test;
    }
}
