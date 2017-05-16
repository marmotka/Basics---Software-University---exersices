package exam_16_12_18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p06_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        char beg = scan.next().charAt(0);
        char en = scan.next().charAt(0);
        char skip = scan.next().charAt(0);

//        String begin = scan.nextLine();
//        String end = scan.nextLine();
//        String letterSkip = scan.nextLine();
//        char beg = begin.charAt(0);
//        char en = end.charAt(0);
//        char skip = letterSkip.charAt(0);

        int count = 0;

        for (char i = beg; i <= en; i++) {
            for (char j = beg; j <= en; j++) {
                for (char k = beg; k <= en; k++) {
                    if ((i != skip && j != skip && k != skip)) {
                        System.out.printf("%c%c%c ", i, j, k);
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}

