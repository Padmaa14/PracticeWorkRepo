package LeetCodeInterviewbit;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lecture1 {
    public  static void main(String ar[]){
        //Lecture 1 Practice classroom
        //Search an element in an array PROGRAM QUESTION 1
        // just add scanner for user input
        Scanner sc = new Scanner(System.in);
        List<Integer> arr1= Arrays.asList(7,3,5,2,1); //given array
        int x=111;
        int arr_size=0;
        String a = null;
        if(sc.hasNext()){
            a=sc.next();
        }

        if(sc.hasNextInt()){

        }
        boolean flag=arr1.contains(x);
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
        for(int i=0;i<arr1.size();i++){

        }

        //Brute force solution Q: Repeat a missing number array.
        int[] array={3,1,2,5,3};
        int n=array.length;
        for(int i=1;i<=array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if(array[j]==i)
                    count++;
            }
            if(count==0)
                System.out.println("A :"+i);
            if(count==2)
                System.out.println("B:"+i);
        }
        // runtime complexity based solution
        
    }
}
