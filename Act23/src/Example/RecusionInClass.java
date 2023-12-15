package Example;

public class RecusionInClass {
    public static void main(String[] args) {


        //7! the factorial of 7 would be 7 * 6 * 5 * 4 * 3 * 2 * 1
        //1. Base Case
        //2. Recursive Case
        int num = 7;
        //recursive call
        System.out.println("The factorial of 7 is " + factorial(num));

    }
   public static int factorial(int num){
       //1. Base Case
       //Basical is saying if num is equaltive to 0 return what ever i got after 1
       if(num == 0){
           return 1;
       }else {
           //2. Recursive Case
           //Return when data type is interger
          return num * factorial(num - 1);
       }

   }
}
