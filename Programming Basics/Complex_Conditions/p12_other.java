package date_17_03_25_Complex_Conditions; /**
 * Created by Marmot on 3/28/2017.
 */
import java.util.Scanner;
public class p12_other {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double weks = 48 - h;
        double subotni = (weks * 3 / 4);
        double praznici = (p * 2 / 3);

        if (year.equals("normal"))
        {
            double all = h + praznici + subotni;
            System.out.println(Math.floor(all));
        }
        else if ( year.equals("leap"))
        {
            double all = Math.floor((h + praznici + subotni)*0.15+ (h + praznici + subotni));
            System.out.println(Math.floor(all));

        }
    }
}