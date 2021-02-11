package Stepic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/*
Additional code
1.Using ListIterator iterate over the elements of list from the beginning to the end and after each word "Hip" add "Hop"
2.Using ListIterator print the all elements(using .println())
 */
public class Example2_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
        List<String> list = Arrays.stream("Iterator Hip Hoi Hap Iterator Hip Hi".split("\\s")).collect(Collectors.toList());
        //paste your code here
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String line = (String) iterator.next();
            System.out.println(line);
            if (line.equals("Hip")) {
                System.out.println("Hop");
            }
        }

    }
}
