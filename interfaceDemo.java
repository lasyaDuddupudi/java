import java.io.*;
interface printable {
    void print();
}
public class interfaceDemo implements printable{
    public void print(){
        System.out.println("method body");
    }
    public static void main(String args[]){
        interfaceDemo id=new interfaceDemo();
        id.print();
    }
}
