package Solved;

import java.util.ArrayList;
import java.util.HashMap;

public class N884 {

    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] g = (s1 + " " + s2).split(" ");
        for (String s : g) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        ArrayList<String> temp = new ArrayList<>();
        for (String key : map.keySet()) {
            if(map.get(key)==1){
                temp.add(key);
            }
        }
        String[] result = new String[temp.size()];
        result = temp.toArray(result);
        return result;
    }

}
