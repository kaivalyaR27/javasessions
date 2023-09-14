class eg4 implements Runnable{
public void run(){
System.out.println("It used both runnable and String method");
}
public static void main(String args[]){
Runnable r1=new eg4();
Thread t1=new Thread(r1,"New thread");
t1.start();
String str=t1.getName();
System.out.println(str);
}
}

