package SaturdayJan13.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,25,25,40,45,45);
        List<Integer> div3 = list.stream().filter(i -> i%3 == 0).collect(Collectors.toList());
        System.out.println(div3);
        List<Integer> div5 = list.stream().filter(i -> i%5 == 0).collect(Collectors.toList());
        System.out.println(div5);
        //we can also collect stream to a Set - which will not print any duplicate
        Set<Integer> collect = list.stream().filter(i -> i % 5 == 0).collect(Collectors.toSet());
        System.out.println(collect);
        //Use of foreach method in streams
        list.stream()
                .filter(i -> i % 2 ==0)
                .forEach(i -> System.out.println(i));
        //How to create a stream
        Stream<Integer> integerStream = Stream.of(1, 5, 2, 3, 6, 4, 8, 9, 7, 4, 5, 5, 1, 2, 5);
        integerStream.filter(i -> i % 2 == 0).collect(Collectors.toList()); //You can print it or assign to a variable

    }
}
