package Stepic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Modify and return the given map as follows:
if the key "a" has a value, set the key "b" to have that same value.
In all cases remove the key "c",leaving the rest of the map unchanged.
{"a":"abstraction","b":"boolean","c":"xyz"} -> {"a":"abstraction","b":"abstraction"}
Sample Input:

a:Abstraction,b:Boolean,c:xyz
Sample Output:

a : Abstraction
b : Abstraction

 */
public class Example2_17 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        //a:Abstraction,b:Boolean,c:xyz
        map.put("a", "abstraction");
        map.put("b", "boolean");
        map.put("c", "xyz");

        Objects.requireNonNull(mapShare(map))
            .forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            if (map.containsKey("b")) {
                map.replace("b", map.get("a"));
            } else {
                map.putIfAbsent("b", map.get("a"));
            }
        }
        map.remove("c");
        return map;
    }
}
