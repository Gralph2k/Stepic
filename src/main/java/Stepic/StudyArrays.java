package Stepic;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class StudyArrays {


    public static Integer maxElem(List<Integer> list) {
        Integer max = list.stream().max(Integer::compareTo).orElseThrow(RuntimeException::new);
        return max;
    }

    static List<String> changeList(List<String> list) {
        //paste your code here
        String max = Collections.max(list, Comparator.comparingInt(String::length));
        list = list.stream().map(x -> max).collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) {
        //List<Integer> list1= new ArrayList<>(Arrays.asList(847,271,663,473,376,133,693,13,382,879));
        //System.out.println(maxElem(list1));

        List<String> list2 = new ArrayList<>(Arrays.asList("hi", "hello", "goodmorning", "ass"));
        System.out.println(changeList(list2));

    }
}
