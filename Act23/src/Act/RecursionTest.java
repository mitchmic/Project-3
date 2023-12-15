package Act;

import java.util.Scanner;

public class RecursionTest {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        Recursion test = new Recursion();

        char letter = 'z';
        System.out.println(test.alphaBackwards(letter));


        System.out.println("Enter a number: ");
        int num = Integer.parseInt(keybord.nextLine());
        System.out.println(test.countDown(num));
    }
}
