package exam_17_03_19_morning;


import java.util.Scanner;

public class p04_Salaries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lectures = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        int jelev = 0;
        int royal = 0;
        int roli = 0;
        int trofon = 0;
        int sino = 0;
        int other = 0;

        for (int i = 0; i < lectures; i++) {
            String name = scan.nextLine().toLowerCase();
            if (name.equals("jelev")) {
                jelev++;
            } else if (name.equals("royal")) {
                royal++;
            } else if (name.equals("roli")) {
                roli++;
            } else if (name.equals("trofon")) {
                trofon++;
            } else if (name.equals("sino")) {
                sino++;
            } else {
                other++;
            }
        }
        double pricePerLecture = budget/lectures;
        System.out.printf(" Jelev salary: %.2f lv%n", (jelev*pricePerLecture));
        System.out.printf(" RoYaL salary: %.2f lv%n", (royal*pricePerLecture));
        System.out.printf(" Roli salary: %.2f lv%n", (roli*pricePerLecture));
        System.out.printf(" Trofon salary: %.2f lv%n", (trofon*pricePerLecture));
        System.out.printf(" Sino salary: %.2f lv%n", (sino*pricePerLecture));
        System.out.printf(" Others salary: %.2f lv%n", (other*pricePerLecture));
    }
}

