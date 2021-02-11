package Stepic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Given string as "JButton Button JMenu..." to stdin of your programm

Add all elements from this string to List<String>
Next, using Stream API remove all items not starting with J and items beginning with J replace with the same elements
but without the J ,for example JFrame -> Frame
next, print all the remaining elements in reverse order(using .println())
*in the lesson ListIterator. set() it was necessary to perform the same logic ,but using ListIterator. You can compare these 2 solutions

Sample Input:

ImageButton JTextField JTextArea CheckBox JMenu
Sample Output:

Menu
TextArea
TextField
 */
public class Example2_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
        //List<String> list = Arrays.stream("ImageButton JTextField JTextArea CheckBox JMenu".split(" ")).collect(Collectors.toList());
        //enter your code here
        list = list.stream()
            .filter(n -> n.startsWith("J"))
            .map(o -> o.substring(1))
            .collect(Collectors.toList());
        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
