package RegularPractice;

public class CallByValue {
    int a=10;
    CallByValue(){
        this.a=a;
    }

    public int print(){
        return this.a;
    }
    public static void printa(int ab){
        ab=13;
    }
    public static void main(String arg[]){
        int b=60;
        CallByValue obj=new CallByValue();
        printa(b);
        System.out.println(b);
       System.out.println(obj.a);
        System.out.println(obj.print());
    }
}
