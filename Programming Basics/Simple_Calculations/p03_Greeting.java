import java.io.StringReader;
import java.util.Scanner;

public class p03_Greeting {
    public static void main(String[] args) {
        //  System.out.println("Your name is...");
        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
