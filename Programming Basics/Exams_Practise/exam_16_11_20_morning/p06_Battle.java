package exam_16_11_20_morning;

import java.util.Scanner;

public class p06_Battle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstPlayerPoke = Integer.parseInt(scan.nextLine());
        int secondPlayerPoke = Integer.parseInt(scan.nextLine());
        int maxBattles = Integer.parseInt(scan.nextLine());

        int count = 0;
        for (int i = 1; i <=firstPlayerPoke; i++) {
            for (int j = 1; j <= secondPlayerPoke; j++) {

                if (count < maxBattles) {
                    System.out.printf("(%d <-> %d) ", i, j);
                    count++;
                } else {
                    break;
                }
            }
        }
    }
}
