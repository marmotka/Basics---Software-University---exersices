package date_17_03_25_Complex_Conditions;

import java.util.Scanner;

public class p04_Fruit_Vegetable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();

        switch (product) {
            case ("banana"):
            case ("apple"):
            case ("kiwi"):
            case ("cherry"):
            case ("lemon"):
            case ("grapes"):
                System.out.println("fruit");
                break;
            case ("tomato"):
            case ("cucumber"):
            case ("pepper"):
            case ("carrot"):
                System.out.println("vegetable");
                break;
                default:
                    System.out.println("unknown");
        }
    }
}
