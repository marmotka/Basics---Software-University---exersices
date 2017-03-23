import java.util.Scanner;

public class p10_Number_100_200 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        ;

        if (n > 200) {
            System.out.println("Greater than 200");
        } else if (n >= 100) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Less than 100");
        }

    }
}
