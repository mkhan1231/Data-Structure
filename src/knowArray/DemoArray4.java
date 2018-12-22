package knowArray;
import java.util.*;

public class DemoArray4 {
    public static void main(String[] args) {
        int [] a ={10,20,30,40,50,60,70};
        System.out.println("Value of a[1] before changing: "+a[1]);
        a[1]=a[0]+a[1]; //Changing values of array
        System.out.println("Value of a[1] after changing: "+a[1]);

        System.out.println(a.length); //getting Array length

        System.out.println(a[a.length-1]); //Getting the last value of the array






    }




}
