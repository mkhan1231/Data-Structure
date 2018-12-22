package knowArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList3 {
    public static void main(String args[]){
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Gregor Clegane");
        alist.add("Khal Drogo");
        alist.add("Cersei Lannister");
        alist.add("Sandor Clegane");
        alist.add("Tyrion Lannister");

        //iterating ArrayList
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }

        //iterating ArrayList
        //Iterator it = alist.listIterator();
        //while(it.hasNext()){
            //System.out.println(it.next());
        //}



        //iterating ArrayList
        //for(String str:alist)
           // System.out.println(str);

    }
}
