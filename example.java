import java.lang.*;
class example extends Thread{
public void run(){
System.out.println("My first program on threads");
}
public static void main(String args[]){
example e1=new example();
e1.start();
}
}