package exam_16_07_17;


import java.util.Scanner;

public class p06_Stop_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int s = Integer.parseInt(scan.nextLine());

        for (int i = m; i >= n; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i == s) {
                    break;
                } else {
                    System.out.printf("%d ",i);
                }
            }
        }
    }
}
