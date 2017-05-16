package date_17_03_25_Complex_Conditions;

import java.util.Scanner;

public class p10_Type_Animal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine();

        switch (animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                default:
                    System.out.println("unknown");

        }
    }
}
