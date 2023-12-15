package bigOActivity;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BigO {
    Scanner keybord = new Scanner(System.in);

    public void printOnce() {
        System.out.println("Enter a charcter(s) or number: ");
        String input = keybord.nextLine();
        System.err.println(input);
    }

    public void printNTimes(int n) {
        System.out.println("Please enter a number or Phrase");
        String input = keybord.nextLine();
        for (int i = 0; i < n; i++) {
            System.err.println(input);
        }
    }
    public void printNSquaredTimes(int n){
        System.out.println("Please enter a number or Phrase");
        String input = keybord.nextLine();
        int counter = 1;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.err.println(input);
            }
        }
    }

    }

