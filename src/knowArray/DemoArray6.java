package knowArray;

import java.util.Random;

public class DemoArray6 {
    public static void main(String[] args) {

        int [] list = new int[5];

        Random random = new Random();
        for(int j=0; j<list.length; j++) {
            list[j] = random.nextInt(100);
            System.out.println(list[j]);
        }
            //for (int i = 0; i < list.length; i++) // accessing the elements of the specified array
            //System.out.println("Element at index " + i +  " : "+ list[i]);


    }
}
