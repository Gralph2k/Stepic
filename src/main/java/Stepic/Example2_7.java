package Stepic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
1.Find Symmetrical difference of sets on symDifference(Set<T> set1, Set<T> set2) and return it.
﻿* For example ﻿sets:{1 2 3 4} {3 4 5 6} --> Symmetrical difference = ﻿{1 2 5 6}

 */
public class Example2_7 {
    private static final Set<Integer> set1 = new HashSet<>(Arrays.asList(3, 14, 16, 5, 13, 2, 20, 10, 6, 9));
    private static final Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20));

    public static void main(String[] args) {
        System.out.println(symDifference(set1, set2));
    }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
        return Stream.concat(set1.stream(), set2.stream())
            .filter(n -> !(set1.contains(n) && set2.contains(n)))
            .collect(Collectors.toSet());
    }

    public static Set<Integer> symDifference2(Set<Integer> set1, Set<Integer> set2) {
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (set2.contains(i)) {
                iterator.remove();
                set2.remove(i);
            }
        }
        set1.addAll(set2);
        return set1;
    }

}
