import java.util.Scanner;

public class p02_Excellent_or_Not {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());
        if (grade >= 5.5) {
            System.out.println("Excellent!");
        } else
            System.out.println("Not excellent");
    }
}
