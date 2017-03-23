import java.util.Scanner;

import static java.lang.System.in;

public class p04_Greater_Number {
    public static void main(String[] args) {
        Scanner console = new Scanner(in);


        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());


        if (a > b) {
            System.out.printf("Greater number: %d", a);
        } else {
            System.out.printf("Greater number: %d", b);

        }


    }
}
