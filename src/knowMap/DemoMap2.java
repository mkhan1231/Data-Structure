package knowMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap2 {
    public static void main(String args[])
    {
        Map< String,Integer> hm = new HashMap< String,Integer>();
        hm.put("a", 1);
        hm.put("b", 2);
        hm.put("c", 3);
        hm.put("d",4);

        // Returns Set view
        Set< Map.Entry< String,Integer> > st = hm.entrySet();

        for (Map.Entry< String,Integer> me:st)
        {
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
    }
}
