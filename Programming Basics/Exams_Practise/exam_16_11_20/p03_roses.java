package exam_old_16_11_20;

import java.util.Scanner;

public class p03_roses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String test = "#~#....#..#....#~#";
//        System.out.println(test.length());

        int n = Integer.parseInt(scan.nextLine());
        int width = 4 * n + 6;
        int wave = 0;
        int dotsSide = 2 * n;
        int dotsMiddle = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("#%s#%s#%s#%s#%s#%n", print("~", wave),
                    print(".", dotsSide),
                    print(".", dotsMiddle),
                    print(".", dotsSide),
                    print("~", wave));
            wave++;
            dotsSide -= 2;
            dotsMiddle += 2;
        }
        dotsSide = 1;
        wave = (width - dotsMiddle - 6) / 2;

        for (int i = 0; i < n; i++) {
            System.out.printf("%s#%s#%s#%s#%s%n", print(".", dotsSide),
                    print("~", wave),
                    print(".", dotsMiddle),
                    print("~", wave),
                    print(".", dotsSide));
            dotsSide += 2;
            wave--;
            dotsMiddle -= 2;
        }
        dotsSide = (width - 4) / 2;
        System.out.printf("%s####%s%n", print(".", dotsSide), print(".", dotsSide));
        for (int i = 0; i <n ; i++) {
            System.out.printf("%s##%s%n", print(".", dotsSide+1), print(".", dotsSide+1));
        }


    }

    private static String print(String element, int count) {
        String test = new String(new char[count]).replace("\0", element);
        return test;
    }
}
