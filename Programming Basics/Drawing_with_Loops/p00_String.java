package date_17_04_08_Drawing_with_Loops;

public class p00_String {
    public static void main(String[] args) {

        String stars = repeatStr("*", 5);
        System.out.println(stars);

        String test = ".......______.......";
        System.out.println(test.length()); //броим символите на реда

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }

}
