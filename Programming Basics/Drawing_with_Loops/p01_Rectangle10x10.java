package date_17_04_08_Drawing_with_Loops;
public class p01_Rectangle10x10 {
    public static void main(String[] args) {



        String stars = repeatStr("*", 10);
        for (int i = 0; i < 10; i++) {
            System.out.println(stars);
            System.out.println(i);
        }

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
