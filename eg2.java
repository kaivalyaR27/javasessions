class eg2 implements Runnable{
public void run(){
System.out.println("implementing thread using runnable interface");
}
public static void main(String args[]){
eg2 e=new eg2();
Thread t1=new Thread(e);
t1.start();
}
}
