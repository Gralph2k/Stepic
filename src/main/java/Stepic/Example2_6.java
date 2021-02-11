package Stepic;

/*
Additional code,son!
1.Given a string as "1 2 3 4 5 6 ..." . String[] strings contains of element from given string ("1","2",..).
Add all elements from String[] strings to Set<Integer> set.
2.Add all the elements from helpList to set .
3.Using Iterator remove/filter(Stream API)/"method-of-all-collections" all elements greater than 10(>) from set and return modified set.

 */

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Example2_6 {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] strings = reader.readLine().split(" ");
        String[] strings = "1 1 1 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20".split(" ");
        List<Integer> helpList = Arrays.stream(strings)
            .map(Integer::valueOf)
            .collect(Collectors.toList());
        Set<Integer> set = new HashSet<>();
        set.addAll(helpList);
        //add elements from strings to set

        //add elements from helpList to set

        set = removeAllNumbersMoreThan10(set);
        set.forEach(System.out::println);
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        return set.stream().filter(x -> x <= 10).collect(Collectors.toSet());
    }
}
