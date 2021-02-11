package Stepic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2_2 {
    public static void main(String[] args) throws IOException {
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // String allElements = reader.readLine();
        String allElements = "1 177 8 700 785 4635 3489 52 7418 43 36 8695 3 64";
        //Correct output: 8 36 52 64 700 7418;3 36 177 3489 4635;1 43 785 8695
        List<Integer> bigList = createBigList(allElements);

        //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists
        ArrayList<Integer> div2list = bigList.stream().filter(x -> x % 2 == 0).sorted().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> div3list = bigList.stream().filter(x -> x % 3 == 0).sorted().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> otherlist = bigList.stream().filter(x -> (x % 2 != 0 && x % 3 != 0)).sorted().collect(Collectors.toCollection(ArrayList::new));

        //get result list from createListOfLists
        List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

        //printInLine(resultList);
        System.out.println(resultList);
    }

    public static List<Integer> createBigList(String str) {
        return Arrays.stream(str.split(" "))
            .map(Integer::valueOf)
            .collect(Collectors.toList());
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list, List<Integer> otherList) {
        //add all lists like items in resultList(list of lists) and return it, first-div2list, second-div3list, third-otherList
        ArrayList<List<Integer>> result = new ArrayList<>();
        result.add(div2list);
        result.add(div3list);
        result.add(otherList);

        return result;
    }
}
