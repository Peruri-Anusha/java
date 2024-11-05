import java.io.*;
import java.lang.*;
public class RunnableInterfaceDemo implements Runnable{
public void run(){
System.out.println("The Thread is created and is executing");
}
public static void main(String args[]){
RunnableInterfaceDemo ob=new RunnableInterfaceDemo();
Thread t=new Thread(ob);
t.start();
}
}
