import java.util.Scanner;

public class p07_Sum_Seconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());

        int sum = a + b + c;
        int min = Math.round(sum / 60);
        int secs = (sum % 60);

        System.out.printf(("%d:%02d"), min, secs);

    }
}
