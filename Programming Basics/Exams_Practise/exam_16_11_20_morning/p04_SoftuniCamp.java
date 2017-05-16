package exam_16_11_20_morning;

import java.util.Scanner;

public class p04_SoftuniCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scan.nextLine());
        int groupToFive = 0;
        int groupToTwelve = 0;
        int groupToTwentyFive = 0;
        int groupToForty = 0;
        int groupMoreForty = 0;
        int countPeople = 0;

        for (int i = 0; i < groupsCount; i++) {
            int groupNumber = Integer.parseInt(scan.nextLine());
            countPeople += groupNumber;
            if (groupNumber < 6) {
                groupToFive += groupNumber;
            } else if (groupNumber >= 6 && groupNumber < 13) {
                groupToTwelve += groupNumber;
            } else if (groupNumber >= 13 && groupNumber < 26) {
                groupToTwentyFive += groupNumber;
            } else if (groupNumber >= 26 && groupNumber < 41) {
                groupToForty += groupNumber;
            } else {
                groupMoreForty += groupNumber;
            }
        }
        System.out.printf("%.2f%%%n", (groupToFive* 100.0 / countPeople ));
        System.out.printf("%.2f%%%n", (groupToTwelve * 100.0/ countPeople) );
        System.out.printf("%.2f%%%n", (groupToTwentyFive* 100.0 / countPeople) );
        System.out.printf("%.2f%%%n", (groupToForty * 100.0/ countPeople) );
        System.out.printf("%.2f%%%n", (groupMoreForty* 100.0 / countPeople) );


    }
}
