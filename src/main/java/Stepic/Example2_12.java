package Stepic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/*
Using BufferedReader read one string with numbers written across the space ("1 2 3 4 5 ...").

Put this numbers to any Collection of Integers.Sort this collection!

Using Iterator remove all even annoying numbers(death for elem%2=0 !) from your Collection

Print all remaining elements to console (use System.out.println() method)
 */
public class Example2_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //lets go
        //String allElements = reader.readLine();
        String allElements = "9 11 1 2 3 4 5 6 7 8 9 10";
        List<Integer> helpList = Arrays.stream(allElements.split(" "))
            .map(Integer::valueOf)
            .collect(Collectors.toList());
        Iterator iterator = helpList.iterator();
        while (iterator.hasNext()) {
            Integer i = (Integer) iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }
        Collections.sort(helpList);
        helpList.forEach(System.out::println);


    }
}
