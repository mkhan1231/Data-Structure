package knowArray;

public class DemoArray5 {
    public static void main(String[] args) {
        int[] arr; 			// declares an Array of integers
        arr = new int[5]; 	// allocating memory for 5 integers.

        arr[0] = 10; 		// initialize the  elements of the array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;


        for (int i = 0; i < arr.length; i++) // accessing the elements of the specified array
            System.out.println("Element at index " + i +  " : "+ arr[i]);


    }
}
