package exam_16_03_06;

import java.util.Scanner;

public class p013_06_exam_Stupid_pass_gen2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sym12 = Integer.parseInt(scan.nextLine());
        int sym23 = Integer.parseInt(scan.nextLine());

        char letter = 'a';

        for (int i = 1; i <= sym12; i++) {
            for (int j = 1; j <= sym12; j++) {
                for (char k = letter; k < letter + sym23; k++) {
                    for (char l = letter; l < letter + sym23; l++) {
                        for (int m = 2; m <= sym12; m++) {
                            if (m>i&&m>j){
                                System.out.printf("%d%d%c%c%d ",i,j,k,l,m);
                            }
                        }
                    }
                }
            }
        }
    }
}
