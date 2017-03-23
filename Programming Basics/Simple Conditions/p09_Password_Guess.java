import java.util.Scanner;

public class p09_Password_Guess {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String pass = console.nextLine();

        if ("s3cr3t!P@ssw0rd".equals(pass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password");
        }

    }
}
