package Stepic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/*
On spliteratorWork( List<Double> lst ):
-using Spliterator add to List<Double> sqrts all square roots of items from lst ,if this item greater than 1
-use Math.sqrt(number) to find square root : Math.sqrt(4)-> 2.0
On print(List<Double> list):
-get spliterator() of given list
-divide spliterator into 2 parts ( use spliterator.trySplit())
-print all items which >=2 from first part (use .println())
-print empty string
-print all items which >=10 from second part (use .println())
*! remember when you use trySplit() method :
List<Integer> lst = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2));
Spliterator<Integer> split = lst.spliterator();
split.trySplit()...//-> 1 1 1 (its your first path of spliterator)
split...//2 2 2 2 (now split contains of second path)

 */
public class Example2_15 {

    public static List<Double> spliteratorWork(List<Double> lst) {
        return lst.stream()
            .filter(n -> n > 1)
            .map(Math::sqrt)
            .collect(Collectors.toList());
    }

    public static void print(List<Double> list) {
        Spliterator<Double> spliterator1 = list.spliterator();
        Spliterator<Double> spliterator2 = spliterator1.trySplit();
        spliterator2.forEachRemaining(n -> {
            if (n >= 2) {
                System.out.println(n);
            }
        });
        System.out.println("");
        spliterator1.forEachRemaining(n -> {
            if (n >= 10) {
                System.out.println(n);
            }
        });
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Double> list = Arrays.stream("1 4 8 16 99 100 110 121".split(" "))
            .map(Double::valueOf)
            .collect(Collectors.toList());
        print(spliteratorWork(list));

        Queue<String> queue = new PriorityQueue<>();
        queue.offer("a");
        queue.offer("c");
        queue.offer("b");

        String name = queue.peek();
        queue.forEach(System.out::print);
        System.out.println();
        String name1 = queue.poll();
        queue.forEach(System.out::print);
        System.out.println();
        String name2 = queue.poll();
        queue.forEach(System.out::print);
        System.out.println();
        queue.offer(name);

        queue.forEach(System.out::print);
    }

}
