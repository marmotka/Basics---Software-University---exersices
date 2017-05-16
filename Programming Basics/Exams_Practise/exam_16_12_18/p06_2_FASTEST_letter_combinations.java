package exam_16_12_18;


import java.util.Scanner;

public class p06_2_FASTEST_letter_combinations {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String begin = scan.nextLine();
//        String end = scan.nextLine();
//        String letterSkip = scan.nextLine();
//
//        char beg = begin.charAt(0);
//        char en = end.charAt(0);
//        char skip = letterSkip.charAt(0);
        char beg = scan.next().charAt(0);
        char en = scan.next().charAt(0);
        char skip = scan.next().charAt(0);

        int count = 0;
        char[] combinationArray = new char[4];
        combinationArray[3] = ' ';

        for (char i = beg; i <= en; i++) {
            if (i != skip) {
                combinationArray[0] = i;
                for (char j = beg; j <= en; j++) {
                    if (j != skip) {
                        combinationArray [1]=j;
                        for (char k = beg; k <= en; k++) {
                            if (k != skip) {
                                combinationArray [2]=k;
                                System.out.print(combinationArray);
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
}
