package Stepic_Interview;

import java.util.*;
import java.util.stream.Collectors;

/*

Палиндром - слово, которое одинаково читается в обоих направлениях.
Например:
123454321
madam i’m Adam
Olson in Oslo

Необходимо реализовать функцию:
на вход функция получает строку;
нужно вывести в консоль слово yes, если строка является палиндромом;
нужно вывести в консоль слово no, если строка не является палиндромом;

при определении палиндрома игнорировать все пробелы, знаки препинания и апостроф.
Sample Input 1:
Madam i’m Adam
Sample Output 1:
yes
Sample Input 2:
Olson in Oslo
Sample Output 2:
yes
 */
public class L1_1_3 {
    public static void main(String[] args) {
        checkPalindrom("Madam i’m Adam");
        checkPalindrom("Olson in Oslozzz");
    }

    static void checkPalindrom(String s) {
        s = s.toLowerCase().replaceAll("\\W", "");
        ;
        List<String> list = Arrays.asList(s.split(""));
        Collections.reverse(list);
        String revert = list.stream().collect(Collectors.joining(""));
        System.out.println(revert.equals(s) ? "yes" : "no");
    }

    static void checkPalindrom2(String s) {
        String san = s.replaceAll("[^A-Za-z0-9]", "");
        System.out.print(new StringBuilder(san).reverse().toString().equalsIgnoreCase(san) ? "yes" : "no");
    }


}
