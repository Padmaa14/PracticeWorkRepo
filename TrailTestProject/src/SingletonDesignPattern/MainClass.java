package SingletonDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainClass {
    public static void main(String arg[]) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.returnHashcode();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        singletonClass2.returnHashcode();

        /**
         * Break singleton with Reflection */
        //seems this does not work
        Class<?> singletonClasss=Class.forName("SingletonDesignPattern.SingletonClass");
        Constructor<SingletonClass> constructor= (Constructor<SingletonClass>) singletonClasss.getDeclaredConstructor();
        constructor.setAccessible(true); //breach the constructor of class first so that we can
        //constructor.se


        SingletonClass breachedSingletonClass=constructor.newInstance();
        breachedSingletonClass.returnHashcode();
        System.out.println("breached singleton using reflection : "+breachedSingletonClass.hashCode());
        //break using serialization
        //break using clone pattern
        SingletonClass brokenUsingcloning= (SingletonClass) singletonClass.clone();
        System.out.println("breached singleton using clone : "+brokenUsingcloning.hashCode());

    }
}
