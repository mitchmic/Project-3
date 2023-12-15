package sortingActivity;

import java.util.Scanner;

public class Sorting {
    static Scanner keybord = new Scanner(System.in);

    public static int[] getArray(){
        System.out.println("Please enter an integer");
        int num1 = Integer.parseInt(keybord.nextLine());
        System.out.println("Please enter an integer");
        int num2 = Integer.parseInt(keybord.nextLine());
        System.out.println("Please enter an integer");
        int num3 = Integer.parseInt(keybord.nextLine());
        System.out.println("Please enter an integer");
        int num4 = Integer.parseInt(keybord.nextLine());
        System.out.println("Please enter an integer");
        int num5 = Integer.parseInt(keybord.nextLine());
        int[] nums = {num1, num2, num3, num4, num5};
        return nums;
    }
    public int[] sortArray(int[] array){
        int temp;
        for(int i = 0; i < array.length - 1; i++){
            for(int index = 0; index < array.length - i - 1; index++){
                if (array[index] > array[index + 1]){
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;

                }
            }
        }
        return array;
    }

}
