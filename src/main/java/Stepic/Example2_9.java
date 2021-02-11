package Stepic;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/*
1.String[] sets consists of these lists. Add all elements from each list to correct set(see the comments in the code) sets[0] = {"1 2 3 4 5"} - its string and so on
*use split(" ") to separate elements from string
2.On unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3):
     1)In each Set find the maximum element
     2)create TreeSet, add the resulting elements to TreeSet
     3)return this TreeSet with elements sorted in descending order:
        you can use special method from class TreeSet or rather NavigableSet interface to change the order of storage on the reverse
3.Using System.out.println() print elements of resultTreeSet
 */
public class Example2_9 {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] sets = reader.readLine().split(";");
        String[] sets = "1 2 3 4 5;6 7 8 9 10;11 12 13 14 15".split(";");

        Set<Integer> set1 = Arrays.stream(sets[0].split(" ")).map(Integer::valueOf).collect(Collectors.toSet());
        //your code(add elements to set1 from sets[0])

        Set<Integer> set2 = Arrays.stream(sets[1].split(" ")).map(Integer::valueOf).collect(Collectors.toSet());
        //your code(add elements to set2 from sets[1])

        Set<Integer> set3 = Arrays.stream(sets[2].split(" ")).map(Integer::valueOf).collect(Collectors.toSet());
        //your code(add elements to set3 from sets[2])


        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1, set2, set3);

        //print elements of resultTreeSet(using System.out.printLn()) below
        resultTreeSet.forEach(System.out::println);


    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        resultSet.add(getMax(set1));
        resultSet.add(getMax(set2));
        resultSet.add(getMax(set3));
        return (TreeSet<Integer>) resultSet.descendingSet();
    }

    private static Integer getMax(Set<Integer> set) {
        return set.stream()
            .mapToInt(n -> n)
            .max()
            .orElseThrow(NoSuchElementException::new);
    }
}
