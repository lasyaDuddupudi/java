import java.io.*;
abstract class Animal {
    public abstract void animalSound();
public void Sleep() {
            System.out.println("zzz...");
        }
}
class Cow extends Animal {
    public void animalSound() {
        System.out.println("The cow sounds-maa");
    }
}
public class AbstractionDemo {
    public static void main(String args[]) {
        Cow c=new Cow();
        c.animalSound();
        c.Sleep();
    }
}
