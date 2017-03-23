import java.util.Scanner;


public class p06_Bonus_Score {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int score = Integer.parseInt(console.nextLine());
        double bonusScore = 0;

        if (score <= 100) {
            bonusScore = bonusScore + 5;
        } else if (score <= 1000) {
            bonusScore = bonusScore + (score * 20) / 100.0;
        } else {
            bonusScore = bonusScore + (score * 10) / 100.0;
        }
        if (score % 2 == 0) {
            bonusScore = bonusScore + 1;
        }
      
        if (score % 10 == 5) {
            bonusScore = bonusScore + 2;
        }

        System.out.println(bonusScore);
        System.out.println(score + bonusScore);
    }
}

