package date_17_04_08_Drawing_with_Loops;

import date_17_03_18_Simple_Conditions.test;

import java.util.Scanner;


public class p00_2variant_Faster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String test = ".......______.......";
        System.out.println(test.length()); //броим символите на реда

        int n = Integer.parseInt(scanner.nextLine());
        System.out.printf("+%s+%s%n", print("~",n), print(".",n));

    }
    private static String print(String element, int count) {
        String test = new String(new char[count]).replace("\0", element);
        return test;
    }
}
