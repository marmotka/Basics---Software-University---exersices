package date_17_03_25_Complex_Conditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p12_Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine().toLowerCase();
        int pHoliday = Integer.parseInt(scan.nextLine());
        int hTownWEnds = Integer.parseInt(scan.nextLine());

        int sofWEnds = 48 - hTownWEnds;
        double sofPlaying = 3 / 4.0 * sofWEnds;
        int htPlaying = hTownWEnds;
        double holidayPlaying = 2 / 3.0 * pHoliday;

        double playing = sofPlaying + htPlaying + holidayPlaying;


        if (year.equals("leap")) {
            playing = 1.15 * playing;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(Math.floor(playing));
        }

    }

