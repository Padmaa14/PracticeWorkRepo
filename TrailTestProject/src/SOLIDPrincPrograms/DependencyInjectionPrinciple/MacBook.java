package SOLIDPrincPrograms.DependencyInjectionPrinciple;

import java.security.Key;

public class MacBook {
    public Mouse mouse;
    public Keyboard keyboard;

    public MacBook(Mouse mouse, Keyboard keyboard) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public static void main(String arg[]) {
        Mouse b=new BluetoothMouse();
        Keyboard w=new WiredKeyboard();
        MacBook m=new MacBook(b,w);
        b.print();
        w.print();


    }
}
