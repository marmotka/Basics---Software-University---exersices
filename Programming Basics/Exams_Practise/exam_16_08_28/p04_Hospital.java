package exam_16_08_28;

import java.util.Scanner;

public class p04_Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int period = Integer.parseInt(scan.nextLine());
        int doctors = 7;
        int treated = 0;
        int untreated = 0;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scan.nextLine());
            if (i % 3 == 0 && untreated > treated) {
                doctors++;
            }
            int difference = doctors - patients;
            if (difference >= 0) {
                treated += patients;
            } else {
                treated += doctors;
                untreated += patients - doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);
    }
}
