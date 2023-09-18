import java.io.*;
import java.lang.*;
class joinmethod extends Thread{
public void run(){
for(int i=0;i<5;i++){
try{
Thread.sleep(1000);
System.out.println(Thread.currentThread().getName());
}
catch(Exception e){
System.out.println(e);
}
System.out.println(i);
}
}
}
public class joinmethodd{
public static void main(String args[]){
joinmethod j1=new joinmethod();
joinmethod j2=new joinmethod();
joinmethod j3=new joinmethod();
j1.start();
try{
System.out.println(Thread.currentThread().getName());
j1.join();
}
catch(Exception e){
System.out.println(e);
}
j2.start();
try{
System.out.println(Thread.currentThread().getName());
j2.join();
}
catch(Exception e){
System.out.println(e);
}
j2.start();
}
}
