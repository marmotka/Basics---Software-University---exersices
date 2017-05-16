package exam_16_03_06;

import java.util.Scanner;

public class p06_train2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        char alphabet = 'a';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char k = 'a'; k < (alphabet + l); k++) {
                    for (char m = 'a'; m < (alphabet + l); m++) {
                        for (int o = 2; o <= n; o++) {
                            if (o > i && o > j){
                                System.out.printf("%d%d%s%s%d ",i,j,k,m,o);
                            }
                        }
                    }
                }
            }
        }
    }
}
