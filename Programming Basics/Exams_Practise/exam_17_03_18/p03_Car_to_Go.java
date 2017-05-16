package exam_17_03_18;


import java.util.Scanner;

public class p03_Car_to_Go {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        String type = "";
        String classss = "";

        if (budget <= 100 && budget>=10) {
            classss = "Economy class";
            switch (season) {
                case ("summer"):
                    type = "Cabrio";
                    budget =budget * 35/100;
                    break;
                case ("winter"):
                    type = "Jeep";
                    budget = budget* 65/100;
                    break;
            }
        } else if (budget > 100 && budget <= 500) {
            classss = "Compact class";
            switch (season) {
                case ("summer"):
                    type = "Cabrio";
                    budget = budget* 45/100;
                    break;
                case ("winter"):
                    type = "Jeep";
                    budget = budget* 80/100;
                    break;
            }
        } else  if (budget>500 && budget<=10000){
            classss = "Luxury class";
            type = "Jeep";
            budget = 0.9 * budget;
        } else {
        return; }

        System.out.println(classss);
        System.out.printf("%s - %.2f", type,budget);
    }
}
