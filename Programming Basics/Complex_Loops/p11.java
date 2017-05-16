package date_17_04_22_Complex_Loops;

        import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter even number: ");
            try {
                int n = Integer.parseInt(scan.nextLine());
                if (n %2==0 ){
                    System.out.printf("Even nuber entered: " + n);
                    return;
                } else {
                    System.out.println("The number is not even.");
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        }
    }
}
