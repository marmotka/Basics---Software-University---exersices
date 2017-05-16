package exam_16_03_06;

import java.util.Scanner;

public class p013_3_string {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char k = 'a'; k < alphabet.charAt(l); k++) {
                    for (char m = 'a'; m < alphabet.charAt(l); m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%s%s%d ", i, j, k, m, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
