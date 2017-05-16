package date_17_04_02_Loops;
import java.util.Scanner;

/**
 * Created by marmot on 4/1/2017.
 */
public class p02_Numbers_ending7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 1000; i++) {
            if (i%10==7){
                System.out.println(i);
            }

        }
    }
}
