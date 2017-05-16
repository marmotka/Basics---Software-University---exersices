package exam_old_16_01_17_IlluminateLockk;

import java.util.Scanner;

public class IlluminatiLock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//         String test = ".........#########.........";
//        System.out.println(test.length());

        int n = Integer.parseInt(scan.nextLine());
        int width = 3 * n;
        int endDots = n-2;
        int sideDots = 0;
        int midDots = n - 2;

        System.out.printf("%s%s%S%n", print(".", n), print("#", n), print(".", n));
        for (int i = 0; i < n / 2; i++) {
            System.out.printf("%s##%s#%s#%s##%s%n", print(".", endDots),
                                                    print(".", sideDots),
                                                    print(".", midDots),
                                                    print(".", sideDots),
                                                    print(".", endDots));
            endDots -=2;
            sideDots+=2;
        }
        endDots =1;
        sideDots-=2;
        for (int i = 0; i < n / 2; i++) {
            System.out.printf("%s##%s#%s#%s##%s%n", print(".", endDots),
                    print(".", sideDots),
                    print(".", midDots),
                    print(".", sideDots),
                    print(".", endDots));
            endDots +=2;
            sideDots-=2;
        }
        System.out.printf("%s%s%S%n", print(".", n), print("#", n), print(".", n));


    }

    private static String print(String element, int count) {
        String test = new String(new char[count]).replace("\0", element);
        return test;
    }
}
