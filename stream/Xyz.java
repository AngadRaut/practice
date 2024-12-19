package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Xyz {
    public static void main(String[] args){

        String string = "Sandip is very clever boy";
        // convert this string into string array
        String[] string_array = string.split(" ");
        System.out.println("string array = "+ Arrays.toString(string_array));

        // convert this string_array array into list
        List<String> string_list = Arrays.asList(string_array);
        System.out.println("string_list = "+ string_list);

        // sort by natural order
        List<String> sortedList = string_list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("sorted list by natural order = "+ sortedList);



    }
}
