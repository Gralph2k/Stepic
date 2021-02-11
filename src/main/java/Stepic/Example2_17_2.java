package Stepic;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
Given an array of strings,

On wordCount() : return a
SortedMap<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
On printMap(): Using System.out.println() print all items of the Map ("key : value")
Sample Input:

a b b c d a b
Sample Output:

a : 2
b : 3
c : 1
d : 1
 */
public class Example2_17_2 {
    public static void main(String[] args) {
        String input = "a b b c d a b";
        SortedMap<String, Integer> result = wordCount(input.split(" "));
        printMap(result);

    }

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> map = new TreeMap<>();
        Arrays.stream(strings)
            .forEach(n -> {
                map.computeIfPresent(n, (k, v) -> v + 1);
                map.putIfAbsent(n, 1);
            });
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
