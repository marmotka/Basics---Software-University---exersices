package exam_16_03_06;

        import java.util.Scanner;

public class p01_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        length *= 100;
        width *= 100;

        int lengthCountDesks = (int) ((width - 100) / 70);
        int widthCountDesks = (int) (length / 120);
        int desksCount = lengthCountDesks * widthCountDesks - 3;
        System.out.println(desksCount);


    }
}
