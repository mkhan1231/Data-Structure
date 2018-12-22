package knowIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator1 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Iterator to traverse the list
        //Iterator it = list.iterator();
        //while (it.hasNext())
            //System.out.print(it.next());

        //System.out.println();

        for(String name: list){
            System.out.print(name);
        }
    }
}
