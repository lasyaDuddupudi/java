import java.io.*;
class Animal {
    public void animalSound() {
        System.out.println("An animal can make sound");
    } 
}
class Cow extends Animal{
    public void animalSound() {
        System.out.println("A cow sounds-maa");
    }
}
class Cat extends Animal {
    public void animalSound() {
        System.out.println("A cat sounds-meow");
    }
}
public class PolymorphismDemo {
    public static void main(String args[]) {
        Animal an=new Animal();
        Animal mycow=new Cow();
        Animal mycat=new Cat();
        an.animalSound();
        mycow.animalSound();
        mycat.animalSound();
    }
}
