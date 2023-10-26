package pointers;

import java.util.HashMap;

public class Pointers {
    public static void main(String[] args) {

        HashMap<String, Integer> mapOne = new HashMap<>();
        HashMap<String, Integer> mapTwo = mapOne;

        mapOne.put("value", 11);
        System.out.println(mapOne);
        System.out.println(mapTwo);

        System.out.println("After reassigning value");

        mapOne.put("value", 22);
        System.out.println(mapOne);
        System.out.println(mapTwo);


    }
}
