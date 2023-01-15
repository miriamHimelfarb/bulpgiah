import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bulpgiah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean shave = false;
        int[] mugral;
        mugral = new int[4];

        int[] nichush;
        nichush = new int[4];
        String[] ziun;
        ziun = new String[4];
        int min = 1;
        int max = 9;
        System.out.println();

        System.out.println("בחר רמת קושי: קל/קשה ");
        String rama = in.next();

        if (rama.equals("קל")) {
            min = 1;
            max = 9;
            System.out.println("המספרים מ-1 עד 8,ושונים זה מזה  ");
        } else if (rama.equals("קשה")) {
            min = 0;
            max = 10;
            System.out.println("המספרים מ-0 עד 9,ושונים זה מזה");
        } else {
            System.out.println("לא בחרת ערך נכון,בחרנו עבורך קל");
            System.out.println("המספרים מ-1 עד 8,ושונים זה מזה  ");
        }


            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = min; i < max; i++) list.add(i);
       // System.out.println(list.toString());
            Collections.shuffle(list);
        //System.out.println(list.toString());
            for (int i = 0; i < 4; i++) mugral[i] = (list.get(i));


            for (int i = 0; i < 9; i++) {
            System.out.println("הכנס ארבעה מספרים, לחץ אנטר בין מספר למספר");
            for (int j = 0; j < 4; j++) {
                nichush[j] = in.nextInt();
            }

            System.out.println(Arrays.toString(nichush));

            for (int j = 0; j < 4; j++) {

                if (nichush[j] == mugral[j])
                    ziun[j] = "*";
                else if (nichush[j] == mugral[0] || nichush[j] == mugral[1] || nichush[j] == mugral[2] || nichush[j] == mugral[3])
                    ziun[j] = "#";
                else
                    ziun[j] = " ";

            }


            //  System.out.println(Arrays.toString(ziun));
            Arrays.sort(ziun);
            //  System.out.println(Arrays.toString(ziun));
            Arrays.sort(ziun, Collections.reverseOrder());
            System.out.println(Arrays.toString(ziun));
            System.out.println("נשארו לך" + (8 - i) + "נסיונות");
            if (ziun[0] == "*" && ziun[1] == "*" && ziun[2] == "*" && ziun[3] == "*") {
                i = 11;
                System.out.println("כל הכבוד,הצלחת!!");
            }
            if (i == 8) {
                System.out.println(Arrays.toString(mugral));
                System.out.println("חבל!_!");
            }
        }
    }
}
