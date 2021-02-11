package Stepic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of strings, return a list of the strings, omitting any string length 4 or more.
["a", "bbb", "cccc", "dddddd"] → ["a", "bbb"]
Sample Input:

its no long string
Sample Output:

its
no
 */
public class Example2_19 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bbb", "cccc", "dddddd");
        System.out.println(noLongString(list));
    }


    public static List<String> noLongString(List<String> strings) {

        return strings
            .stream()
            .filter(n -> n.length() < 4)
            .collect(Collectors.toList());
    }
}
