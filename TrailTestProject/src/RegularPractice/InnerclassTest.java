package RegularPractice;

public class InnerclassTest {
    int data=30;
    void display(){
       class Local{
           void msg(){
               System.out.println("thhis is instance");
           }
       }
       Local l=new Local();
       l.msg();
    }
    void main(){
        InnerclassTest il=new InnerclassTest();
        il.display();
    }
}
