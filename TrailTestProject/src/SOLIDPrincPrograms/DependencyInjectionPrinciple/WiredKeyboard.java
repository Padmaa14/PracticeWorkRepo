package SOLIDPrincPrograms.DependencyInjectionPrinciple;

public class WiredKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("This is WiredKeyboard");
    }
}
