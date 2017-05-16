package exam_16_04_24;

        import java.util.Scanner;

public class p02_Tom_Cat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int offDays = Integer.parseInt(scan.nextLine());
        int playHours = offDays * 127 + (365 - offDays) * 63;
        int diff = playHours - 30000;

        if (diff>0){
            System.out.println("Tom will run away");
            int hours = diff/60;
            int min = diff%60;
            System.out.printf("%d hours and %d minutes more for play" ,hours, min);
        } else {
            System.out.println("Tom sleeps well");
            int hours = Math.abs(diff)/60;
            int min = Math.abs(diff)%60;
            System.out.printf("%d hours and %d minutes less for play" ,hours, min);
        }
    }
}
