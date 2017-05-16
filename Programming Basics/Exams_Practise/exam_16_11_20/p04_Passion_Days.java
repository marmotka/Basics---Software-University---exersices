package exam_old_16_11_20;

import java.util.Scanner;

public class p04_Passion_Days {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        String enter = scan.nextLine();
        int count = 0;
        double price;

        while (true) {
            String current = scan.nextLine();
            if (current.equals("mall.Exit")) {
                if (count == 0) {
                    System.out.printf("%nNo purchases. Money left: %.2f lv.", money);
                } else {
                    System.out.printf("%d purchases. Money left: %.2f lv.", count, money);
                }
                return;
            } else {
                for (int i = 0; i < current.length(); i++) {
                    char symbol = current.charAt(i);
                    int ascii = (int) symbol;

                    if (Character.isUpperCase(symbol)) {
                        price = 0.5 * ascii;
                        if (money < price || money ==0) {
                            continue;
                        } else {
                            money -= price;
                            count++;
                        }
                    } else if (Character.isLowerCase(symbol)) {
                        price = 0.3 * ascii;
                        if (money < price || money ==0) {
                            continue;
                        } else {
                            money -= price;
                            count++;
                        }
                    } else if (symbol == '%') {
                        price = 0.5 * money;
                        if (money < price || money ==0) {
                            continue;
                        } else {
                            money -= price;
                            count++;
                        }
                    } else if (symbol == '*') {

                        money += 10;
                    } else {
                        price = ascii;
                        if (money < price || money ==0) {
                            continue;
                        } else {
                            money -= ascii;
                            count++;
                        }
                    }
                }
            }
        }
    }
}
