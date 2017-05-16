package exam_old_16_11_20;

import java.util.Scanner;
import java.util.StringJoiner;

public class p05_Salt_Pepper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long dishes = Long.parseLong(scan.nextLine());
//        int dishes = Integer.parseInt(scan.nextLine());

//        String binaryIntInStr = Integer.toBinaryString(dishes);
//        System.out.println(binaryIntInStr);

        int dishesBytes[] = new int[64];
        for (int i = 63; i >= 0; i--) {
            long left = dishes % 2;
            int leftInt = (int) left;
            dishesBytes[i] = leftInt;
            dishes = dishes / 2;
            if (dishes == 0) {
                break;
            }
        }

        while (true) {
            String spices = scan.nextLine();
            if (spices.equals("end")) {
                long endResult = 0;
                for (int i = 0; i < 64; i++) {
                    endResult += (dishesBytes[63 - i] * Math.pow(2,  i));
                }
                System.out.println(endResult);

                return;
            } else {
                String[] retVal = spices.split(" ");
                String spiceName = retVal[0];
                int numNumber = Integer.parseInt(retVal[1]);

                if (spiceName.equals("salt")) {
                    for (int i = 63; i >= 0; i -= numNumber) {
                        if (dishesBytes[i] == 1) {
                            dishesBytes[i] = 0;
                        }
                    }
                }
                if (spiceName.equals("pepper")) {
                    for (int i = 63; i >= 0; i -= numNumber) {
                        if (dishesBytes[i] == 0) {
                            dishesBytes[i] = 1;
                        }
                    }
                }
            }

        }
    }
}
//}
//     for (int i = 0; i < 64; i++) {
//        System.out.print(dishesBytes[i]);
//        }