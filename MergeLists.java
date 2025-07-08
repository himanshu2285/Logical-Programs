// This Java program merges two lists of integers and prints the merged list.

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);

        List<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        System.out.println(merged);
    }
}
