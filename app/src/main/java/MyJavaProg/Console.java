package MyJavaProg;

import java.util.Scanner;

public class Console {

    public static final Scanner in = new Scanner(System.in);

    public static int readIntegerFromStdIn(String text) {
        System.out.print(text + " ");
        int num = in.nextInt();
        return num;
    }

    public static String readStringFromStdIn(String text) {
        System.out.print(text + " ");
        String txt = in.next();
        return txt;
    }

}
