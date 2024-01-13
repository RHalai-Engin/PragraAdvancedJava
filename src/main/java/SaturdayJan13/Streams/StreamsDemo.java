package SaturdayJan13.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        List<Integer> div3 = list.stream().filter(i -> i%3 == 0).collect(Collectors.toList());
        System.out.println(div3);
        List<Integer> div5 = list.stream().filter(i -> i%5 == 0).collect(Collectors.toList());
        System.out.println(div5);


    }
}
