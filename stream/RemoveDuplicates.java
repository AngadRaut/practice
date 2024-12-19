package stream;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(100);
        list.add(778);
        list.add(100);
        list.add(99);
        list.add(44);
        list.add(323);
        list.add(323);
        list.add(100);
        list.add(323);
        list.add(99);
        list.add(100);
        list.add(99);
        System.out.println(list);

        // by adding elements in set
        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);

        // by java stream
        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

    }
}
