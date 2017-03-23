import java.util.Scanner;


public class p14_Time_15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hh = Integer.parseInt(scanner.nextLine());
        int mm = Integer.parseInt(scanner.nextLine());

        if (mm < 45) {
            mm = mm + 15;
            System.out.printf("%d:%02d", hh, mm);
        } else {
            if (hh == 23) {
                hh = 0;
                mm = Math.abs(mm + 15 - 60);
            } else {
                hh++;
                mm = Math.abs(mm + 15 - 60);
            }
            System.out.printf("%d:%02d", hh, mm);
        }

    }
}
