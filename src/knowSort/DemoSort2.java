package knowSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSort2 {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<Integer>();
        list.add(100);
        list.add(20);
        list.add(3000);
        list.add(4);
        list.add(50);
        list.add(60000);

        System.out.println(list); // Printing list before sorting

        Collections.sort(list);
        System.out.println(list); //Printing list in ascending order

        Collections.reverse(list);
        System.out.println(list); //Printing list in descending order
    }
}
