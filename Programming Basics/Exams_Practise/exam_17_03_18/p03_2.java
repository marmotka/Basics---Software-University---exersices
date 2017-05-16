package exam_17_03_18;

import java.util.Scanner;

/**
 * Created by marmot on 4.5.2017 г..
 */
public class p03_2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0.0;
        String clas = null;
        String car = null;

        if (budget <= 100) {
            clas = "Economy class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                price = budget * 35/100;
            }else if (season.equals("Winter")){
                car = "Jeep";
                price = budget*65/100;
            }
        }else if (budget>100 && budget<=500){
            clas = "Compact class";
            if (season.equals("Summer")) {
                price = budget * 45/100;
                car = "Cabrio";
            }else if (season.equals("Winter")){
                price = budget*80/100;
                car = "Jeep";
            }
        }else if (budget>500){
            clas = "Luxury class";
            price = budget*90/100;
            car = "Jeep";
        }

        System.out.println(clas);
        System.out.printf("%s - %.2f", car , price);
    }

}
