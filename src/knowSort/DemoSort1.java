package knowSort;

import java.util.Arrays;
import java.util.Collections;

public class DemoSort1 {
    public static void main(String[] arguments) {
        String names[] = { "Peter",  "Hunter", "Sarah", "Gabe", "Gina", "Rob", "John", "Zoey", "Tammy", "Robert",
                       "Kathy", "Neleh", "Vecepia" };
            System.out.println("The original order:");
             for (int i = 0; i < names.length; i++)
                   System.out.println(i + ": " + names[i]);
             Arrays.sort(names);
            System.out.println("The new order:");
             for (int i = 0; i < names.length; i++)
                   System.out.println(i + ": " + names[i]);


        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(arr);
        for (int j=0; j<arr.length; j++)
        System.out.println(arr[j]);


    }
}
