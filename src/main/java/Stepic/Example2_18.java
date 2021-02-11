package Stepic;

import java.util.Arrays;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/*
Modify and return the given map as follows:
if the first key % 2 != 0 return sub map from First Key inclusive to FirstKey+4 inclusive in descending order
else return sub map from LastKey-4 inclusive to the Last Key inclusive in descending order
Sample Input:

1:one 2:two 3:three 4:four 5:five 6:six 7:seven
Sample Output:

5 : five
4 : four
3 : three
2 : two
1 : one

 */
public class Example2_18 {

    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        NavigableMap<Integer, String> map2 = getSubMap(map);
        map2.forEach((k, v) -> System.out.println(k + " : " + v));

    }

    public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map) {

        Integer firstKey = map.firstKey();
        Integer lastKey = map.lastKey();
        NavigableMap<Integer, String> result = new TreeMap<>();
        if (firstKey % 2 != 0) {
            map.subMap(firstKey, firstKey + 5)
                .forEach(result::put);
        } else {
            map
                .subMap(lastKey - 4, lastKey + 1)
                .forEach(result::put);
        }
        return result.descendingMap();
    }
}
