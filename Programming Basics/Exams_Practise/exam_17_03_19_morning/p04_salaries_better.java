package exam_17_03_19_morning;

import java.util.Scanner;

public class p04_salaries_better {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            double salary = Double.parseDouble(scanner.nextLine());

            double jelev = 0;
            double royal = 0;
            double roli = 0;
            double trofon = 0;
            double sino = 0;
            double other = 0;

            for (int i = 0; i < n; i++) {
                String names = scanner.nextLine();
                switch (names) {
                    case "Jelev":
                        jelev++;
                        break;
                    case "RoYaL":
                        royal++;
                        break;
                    case "Roli":
                        roli++;
                        break;
                    case "Trofon":
                        trofon++;
                        break;
                    case "Sino":
                        sino++;
                        break;
                    default:
                        other++;
                        break;
                }
            }

            double result = salary / n;

            System.out.printf("Jelev salary: %.2f lv%n",jelev*result);
            System.out.printf("RoYaL salary: %.2f lv%n",royal*result);
            System.out.printf("Roli salary: %.2f lv%n",roli*result);
            System.out.printf("Trofon salary: %.2f lv%n",trofon*result);
            System.out.printf("Sino salary: %.2f lv%n",sino*result);
            System.out.printf("Others salary: %.2f lv",other*result);
        }
    }


