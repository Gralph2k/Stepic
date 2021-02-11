package Stepic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/*
Given string as "JButton Button JMenu..." to stdin of your programm
1.Add all elements from this string to List<String>
2.Next, using ListIterator remove all items not starting with J and items beginning with J replace with the same elements but without the J ,
for example JFrame -> Frame
3.next, print all the remaining elements in reverse order(using .println())
 */
public class Example2_14 {
    public static void main1(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream("JButton Button JGroupButton TextView RadioButton JTextField JTextArea ToolBar JSlider JProgressBar JMenu JToolBar JWindow JFrame".split("\\s")).collect(Collectors.toList());
        //List<String> list = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String line = (String) listIterator.next();
            if (line.startsWith("J")) {
                listIterator.set(line.substring(1, line.length()));
            } else {
                listIterator.remove();
            }
        }
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream("JButton Button JGroupButton TextView RadioButton JTextField JTextArea ToolBar JSlider JProgressBar JMenu JToolBar JWindow JFrame".split("\\s")).collect(Collectors.toList());
        //List<String> list = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());
        list.stream()
            .filter(n -> n.startsWith("J"))
            .map(n -> n.substring(1))
            .collect(Collectors.toCollection(LinkedList::new))
            .descendingIterator()
            .forEachRemaining(System.out::println);
    }
}
