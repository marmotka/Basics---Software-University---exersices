package date_17_03_25_Complex_Conditions;

import java.util.Scanner;

public class p08_Trade_Comission {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine().toLowerCase();
        double sales = Double.parseDouble(scan.nextLine());

        double commission = -1.0;

        if (sales >= 0 && sales <= 500) {
            switch (city) {
                case "sofia":
                    commission = 5 / 100d;
                    break;
                case "varna":
                    commission = 4.5 / 100d;
                    break;
                case "plovdiv":
                    commission = 5.5 / 100d;
                    break;
            }
        } else if (sales > 500 && sales <= 1000) {
            switch (city) {
                case "sofia":
                    commission = 7 / 100d;
                    break;
                case "varna":
                    commission = 7.5 / 100d;
                    break;
                case "plovdiv":
                    commission = 8 / 100d;
                    break;
            }
        } else if (sales > 1000 && sales <= 10000) {
            switch (city) {
                case "sofia":
                    commission = 8 / 100d;
                    break;
                case "varna":
                    commission = 10 / 100d;
                    break;
                case "plovdiv":
                    commission = 12 / 100d;
                    break;
            }
        } else if (sales > 10000) {
            switch (city) {
                case "sofia":
                    commission = 12 / 100d;
                    break;
                case "varna":
                    commission = 13 / 100d;
                    break;
                case "plovdiv":
                    commission = 14.5 / 100d;
                    break;
            }
        }
        if (commission >= 0) {
            System.out.printf("%.2f", commission * sales);
        } else {
            System.out.println("error");
        }

    }
}



