package Act;

import java.util.Scanner;

public class Recursion {


    public static int countDown(int num) {
        if (num == 0) {
            System.out.println("Blast Off!");
            return num;
        } else {
            System.out.println(num + "...");
            return countDown(--num);
        }
    }

    public static char alphaBackwards(char letter) {
        if (letter == 'a') {
            return letter;
        } else {
            System.out.println(letter);
            return alphaBackwards(--letter);
        }
    }
}
