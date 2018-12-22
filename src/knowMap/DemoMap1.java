package knowMap;

import java.util.HashMap;
import java.util.Map;

public class DemoMap1 {
    public static void main(String[] args) {
        Map<Integer, String> state = new HashMap<Integer, String>();
        state.put(1, "NY");
        state.put(2, "TX");
        state.put(3, "NJ");
        state.put(3, "FL");

        System.out.println(state);
        System.out.println(state.get(3));
    }
}
