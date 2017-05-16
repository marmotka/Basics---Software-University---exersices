package date_17_03_25_Complex_Conditions;


import java.util.Scanner;


public class p07_Shop_Fruits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine().toLowerCase();
        String day = scan.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = -1.0;

        switch (fruit) {
            case "banana":
                if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("Thursday") || day.equals("friday")) {
                    price = 2.5 * quantity;
                    System.out.printf("%.2f", price);
                } else if (day.equals("saturday") || day.equals("sunday")) {
                    price = 2.7 * quantity;
                    System.out.printf("%.2f", price);
                } else System.out.println("error");
                break;

            case "apple":
                if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("Thursday") || day.equals("friday")) {
                    System.out.println(1.2 * quantity);
                } else if (day.equals("saturday") || day.equals("sunday")) {
                    System.out.println(1.25 * quantity);
                } else System.out.println("error");
                break;

            case "orange":
                if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("Thursday") || day.equals("friday")) {
                    System.out.println(0.85 * quantity);
                } else if (day.equals("saturday") || day.equals("sunday")) {
                    System.out.println(0.9 * quantity);
                } else System.out.println("error");
                break;

            case "grapefruit":
                if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
                    System.out.println(1.45 * quantity);
                } else if (day.equals("saturday") || day.equals("sunday")) {
                    System.out.println(1.6 * quantity);
                } else System.out.println("error");
                break;

            case "kiwi":
                if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("Thursday") || day.equals("friday")) {
                    System.out.println(2.7 * quantity);
                } else if (day.equals("saturday") || day.equals("sunday")) {
                    System.out.println(3 * quantity);
                } else System.out.println("error");
                break;

            case "pineapple":
                if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("Thursday") || day.equals("friday")) {
                    System.out.println(5.5 * quantity);
                } else if (day.equals("saturday") || day.equals("sunday")) {
                    System.out.println(5.6 * quantity);
                } else System.out.println("error");
                break;

            case "grapes":
                if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("Thursday") || day.equals("friday")) {
                    System.out.println(3.85 * quantity);
                } else if (day.equals("saturday") || day.equals("sunday")) {
                    System.out.println(4.2 * quantity);
                } else System.out.println("error");
                break;

            default:
                System.out.println("error");

        }

    }
}
