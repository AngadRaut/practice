/*
package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        Integer[] arr = {1,4,6,8,5,8,34,6,5,8,34,6,3,8,0,3,6};
        System.out.println(Arrays.toString(arr));
        // convert array to list
        List<Integer> integerList = Arrays.asList(arr);
        //find the second max and second min from arrayLIst
        int second_max = integerList.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
        System.out.println("second_max = "+second_max);

        // remove duplicate
        System.out.println(integerList);
        List<Integer> arr_new = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(arr_new);
        // sum
        Double average = integerList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(average);
        // sum
        Integer sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        // min and max
        int min = integerList.stream().max((a,b) -> -a.compareTo(b)).get();
        System.out.println("min = "+min);
        // odd even
        List<Integer> odd = integerList.stream().filter(a -> a%2!=0).collect(Collectors.toList());
        System.out.println("odd list = "+odd);

        // sum of square of all no's
        Double sum_of_square = integerList.stream().mapToDouble(a -> a*a).average().getAsDouble();
        System.out.println("sum of square"+sum_of_square);



        String[] arr2 = {"a","anna","ajit","santosh","vinayaka","bb","bahir"};
        List<String> list = Arrays.asList(arr2);
        List<Integer> list_new = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list_new);

        // sorted list
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        // sort by length
//        List<String> sortByLength = list.stream().sorted((a,b) -> a.length().compareTo(b.length())).collect(Collectors.toList());

        // find the length of each string
        Map<String,Integer> i = list.stream().collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(i);

        // sort by length
        List<String>n = list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(n);

        // string sort by inc and dec length
        List<String> sortByIncLength = list.stream().sorted((a,b) -> (a.length()-b.length())).collect(Collectors.toList());
        System.out.println("sortByIncLength = "+sortByIncLength);

        // finding the max length string from string array
        String max = list.stream().max((a,b)->-(a.length()-b.length())).get();
        System.out.println(max);

    }
}
*/
