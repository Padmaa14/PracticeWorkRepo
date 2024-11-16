package RegularPractice.StreamsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamPractice {
    public static void main(String ar[]) {
        List<Integer> array=new ArrayList<>();
        array.add(5);array.add(5);
        array.add(9);array.add(2);
        int[] arr={8,9,6,5,3};int sum=0;
      int a=  array.stream().mapToInt(i->i).sum();
      OptionalDouble d=array.stream().mapToDouble(x->x).average();
        System.out.println(d);
      System.out.println(a);
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
        }
        System.out.println(sum);
        Arrays.sort(arr);
        System.out.println(arr[4]);
        //Integer a=array.stream()

    }
}
