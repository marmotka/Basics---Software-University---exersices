package exam_16_07_17;

import java.util.Scanner;

public class p03_play_tickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        String type = scan.nextLine().toLowerCase();
        int peopleCount = Integer.parseInt(scan.nextLine());
        double ticketsprice;

//        switch (type) {
//            case ("vip"):
//                ticketsprice = 499.99 * peopleCount;
//                break;
//            case ("normal"):
//                ticketsprice = 249.99 * peopleCount;
//                break;
//        }

        if (type.equals("vip")) {
            ticketsprice = 499.99 * peopleCount;
        } else {
            ticketsprice = 249.99 * peopleCount;
        }

        if (peopleCount < 5) {
            budjet = 0.25 * budjet;
        } else if (peopleCount < 10) {
            budjet = 0.4 * budjet;
        } else if (peopleCount < 25) {
            budjet = 0.5 * budjet;
        } else if (peopleCount < 50) {
            budjet = 0.6 * budjet;
        } else {
            budjet = 0.75 * budjet;
        }
        double diff = budjet - ticketsprice;
        if (diff >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(diff));
        }


    }
}
