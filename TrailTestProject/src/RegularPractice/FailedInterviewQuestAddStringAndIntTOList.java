package RegularPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FailedInterviewQuestAddStringAndIntTOList {
    public static void main(String ar[]) throws Exception {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        List<Object> obj = new ArrayList<>();

        List<String> a=list1.stream().map(i->i.toString()).collect(Collectors.toList());
        a.addAll(list2);
        for (Object o : obj) {
            System.out.println(o.toString());
        }
    }
}
