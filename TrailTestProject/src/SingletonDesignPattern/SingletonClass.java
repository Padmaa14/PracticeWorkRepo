package SingletonDesignPattern;

public class SingletonClass implements Cloneable{
    private SingletonClass() {
    }

    // private static SingletonClass singletonClass = new SingletonClass();
    private static SingletonClass singletonClass;


    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public void returnHashcode() {
        System.out.println("Hashcode : " + singletonClass.hashCode());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
