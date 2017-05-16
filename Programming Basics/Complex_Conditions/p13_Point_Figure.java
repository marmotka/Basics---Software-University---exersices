package date_17_03_25_Complex_Conditions;

import java.util.Scanner;

public class p13_Point_Figure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        boolean isInLowerRectangle = (x > 0 && x < 3 * h && y > 0 && y < h);
        boolean isInUpperRectangle = (x > h && x < 2 * h && y > h && y < 4 * h);
        boolean isBetweenInside = (y == h && x > h && x < 2 * h);

        boolean borderSideLow = ((x == 0 || x == 3 * h) && y >= 0 && y <= h);
        boolean borderSideUp = (y >= h && y <= 4 * h) && (x == 2 * h || x == h);
        boolean borderDown = (y == 0 && x >= 0 && x <= 3 * h);
        boolean borderUp = (y == 4 * h && x >= h && x <= 2 * h);
        boolean borderHorUp = (y == h && (x > 0 && x < h || (x > 2 * h && x < 3 * h)));

        if (isInLowerRectangle || isInUpperRectangle || isBetweenInside){
            System.out.println("inside");
        } else if (borderSideLow || borderSideUp || borderDown || borderUp || borderHorUp){
            System.out.println("border");
        } else {
            System.out.println("outside");
        }


    }
}
