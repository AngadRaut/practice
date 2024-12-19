package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Unique {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list3);

        list1.add(100);
        list1.add(778);
        list1.add(100);
        list1.add(99);
        list1.add(44);
        list1.add(323);
        list1.add(323);

        list2.add(778);
        list2.add(100);
        list2.add(99);
        list2.add(6);
        list2.add(3);
        list2.add(2);
        list2.add(44);

        System.out.println(list1+"\n"+list2);
        list2.addAll(list1);
        System.out.println(list2);

        Set<Integer> set = new HashSet<>();
        for(Integer i : list2){
            if(!set.add(i)){
                System.out.println(i);
            }
        }


        System.out.println(list2);
        List<Integer> integerList = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(""+integerList);


      /*  Iterator iterator = list2.iterator();
        while (iterator.hasNext()){

        }*/
    }
}
