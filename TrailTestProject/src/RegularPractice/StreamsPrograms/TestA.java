package RegularPractice.StreamsPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestA {
    public static void main(String[] args){
        //streams
        List<Integer> arrInt=new ArrayList<>();
        arrInt.add(1);arrInt.add(22);arrInt.add(9);
        arrInt.add(2);arrInt.add(3);arrInt.add(6);
        
       
        //streams with forEach
        System.out.println("Even nos : ");
        arrInt.stream().filter(i->i%2==0).forEach(x->System.out.print(" "+x));
        System.out.println();

        //duplicate names in the stream a list
        System.out.println("duplicate/unique names ");
        List<String> arrLlist=new ArrayList<>();
        arrLlist.add("padma");arrLlist.add("bina");arrLlist.add("radha");
        arrLlist.add("seema");arrLlist.add("padma");arrLlist.add("radha");
        System.out.print("List : "+arrLlist);
        Set<String> uniquenames=new HashSet<>();
        Set<String> duplicatenames =arrLlist.stream().filter(name->!uniquenames.add(name)).collect(Collectors.toSet());
        System.out.println();
        System.out.println("duplicate names :"+duplicatenames);
       
        System.out.println("unique names : "+uniquenames);
       
        
    }
}
class Adder{
    Adder(){
        System.out.println("i am constructor");
    }
    static int add(int a,int b){
        return a+b;
    }
   // static long add(int a,int b){ // how the method overloading fails
     //   return a+b;
    //}


}
class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;
}
enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}
