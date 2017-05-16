package exam_16_03_06;

import java.util.Scanner;


public class p013_06_exam_Stupid_Pass_Generator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());

        int sym12 = 1;
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String sym34 = alphabet[0];
        int sym5 = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                for (int k = 0; k < l; k++) {

                    for (int m = 0; m < l; m++) {

                        for (int o = 2; o < n + 1; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%s%s%d ", i, j, alphabet[k], alphabet[m], o);
                            }
                        }
                    }

                }


            }

        }


    }

}


//        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
//                'i', 'n', 'a', 't', 'e', 'd'};
//        char[] copyTo = new char[7];
//
//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//        System.out.println(new String(copyTo));