package knowSort;

public class DemoSort3 {
    public static void main(String[] args) {
        //initialize unsorted array
        int[] array = {9, 7, 8, 6, 4, 1, 5};
        System.out.println("Before sorting");
        for (int n = 0; n < array.length; n++) {
            System.out.println(array[n]);

        }
        for (int j = 0; j <= array.length-1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            //swapping
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;

        }

        System.out.println("After sorting");
        //print sorted array
        for (int n = 0; n < array.length; n++) {
            System.out.println(array[n]);
        }
    }
}
