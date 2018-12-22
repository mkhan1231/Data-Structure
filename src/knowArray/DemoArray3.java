package knowArray;

public class DemoArray3 {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        System.out.println(a[3]);

        //try {
        System.out.println(a[4]);
        //} catch (ArrayIndexOutOfBoundsException e) {
          //  System.out.println("This Array can only contain 4 elements");
        //}
    }
}
