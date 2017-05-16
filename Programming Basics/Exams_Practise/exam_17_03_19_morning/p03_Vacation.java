package exam_17_03_19_morning;


import java.util.Scanner;

public class p03_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        if (budjet <= 1000) {
            switch (season) {
                case ("summer"):
                    System.out.printf("Alaska - Camp - %.2f", (0.65 * budjet));
                    break;
                case ("winter"):
                    System.out.printf("Morocco - Camp - %.2f", (0.45 * budjet));
                    break;
            }
        } else if (budjet > 1000 && budjet <= 3000) {
            switch (season) {
                case ("summer"):
                    System.out.printf("Alaska - Hut - %.2f", (0.8 * budjet));
                    break;
                case ("winter"):
                    System.out.printf("Morocco - Hut - %.2f", (0.6 * budjet));
                    break;
            }
        } else {
            budjet = 0.9 * budjet;
            String location = season.equals("summer") ? "Alaska" : "Morocco";
            System.out.printf("%s - Hotel - %.2f", location, budjet);
        }

    }
}
