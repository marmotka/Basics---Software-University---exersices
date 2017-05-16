package exam_16_12_18;


import java.util.Scanner;

public class p04_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberGrades = Integer.parseInt(scan.nextLine());
        int fail = 0;
        int betwThreeFour = 0;
        int betwFourFive = 0;
        int excellent = 0;
        double sumGrades = 0;

        for (int i = 0; i < numberGrades; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            sumGrades += grade;

            if (grade < 3) {
                fail++;
            } else if (grade >= 3 && grade < 4) {
                betwThreeFour++;
            } else if (grade >= 4 && grade < 5) {
                betwFourFive++;
            } else {
                excellent++;
            }
        }
        double average = sumGrades / numberGrades;

        System.out.printf("Top students: %.2f%%%n", excellent * 100.0 / numberGrades);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", betwFourFive * 100.0 / numberGrades);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", betwThreeFour * 100.0 / numberGrades);
        System.out.printf("Fail: %.2f%%%n", fail * 100.0 / numberGrades);
        System.out.printf("Average: %.2f", average);

    }
}
