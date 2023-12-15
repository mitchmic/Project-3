package Example;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {


        HashMap<String, String> captials = new HashMap<>();

        captials.put("USA", "Washington D.C.");
        captials.put("Japan", "Tokyo");
        captials.put("France", "Paris");
        captials.put("India", "New delhi");
        System.out.println();
        System.out.println(captials);
        //Remove
        captials.remove("France");
        System.out.println(captials);

    }
}
