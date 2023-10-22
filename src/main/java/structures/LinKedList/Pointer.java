package structures.LinKedList;

import java.util.HashMap;

public class Pointer {

    public static void main(String[] args) {


        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 2);
        map2 = map1;

        System.out.println(map1);

        // display real memory address for map1
        System.out.println(System.identityHashCode(map1));

        System.out.println(map2);

        // display real memory address for map2
        System.out.println(System.identityHashCode(map2));
    }

}
