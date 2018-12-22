package knowHashMap;

import java.util.*;

public class DemoHashMap1 {
    public static void main(String[] args) {
        List<String> cityOfBD=new ArrayList<String>();
        cityOfBD.add("Dhk");
        cityOfBD.add("Ctg");
        cityOfBD.add("Khl");

        List<String> cityOfIndia=new ArrayList<String>();
        cityOfIndia.add("Chennai");
        cityOfIndia.add("Mumbai");
        cityOfIndia.add("Delhi");

        List<String> cityOfPak=new ArrayList<String>();
        cityOfPak.add("Islamabad");
        cityOfPak.add("Karachi");
        cityOfPak.add("Rawalpindi");

        //Map<String, List<String>> b=new LinkedHashMap<>();  //it prints in order BD,IN,PAK
        Map<String, List<String>>  b=new HashMap<>(); //it doesn't print in order
        b.put("Bangladesh", cityOfBD);
        b.put("India", cityOfIndia);
        b.put("Pakistan", cityOfPak);

        for(Map.Entry entry:b.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }



    }
}
