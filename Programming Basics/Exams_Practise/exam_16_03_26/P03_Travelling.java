package exam_16_03_26;


import java.text.DecimalFormat;
import java.util.Scanner;

public class P03_Travelling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();
        boolean seasonSummer = (season.equals("summer"));
        DecimalFormat df = new DecimalFormat("#.00");

        if (budjet <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if (seasonSummer){
                System.out.printf("Camp - %s" , df.format(30*budjet/100));
            } else {
                System.out.printf("Hotel - %s", df.format(70*budjet/100));
            }
        } else if (budjet<=1000){
            System.out.println("Somewhere in Balkans");
            if (seasonSummer){
                System.out.printf("Camp - %s" , df.format(40*budjet/100));
            } else {
                System.out.printf("Hotel - %s", df.format(80*budjet/100));
            }

        } else {
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %s", df.format(90*budjet/100));
        }
    }
}
