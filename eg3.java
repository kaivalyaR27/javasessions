class eg3 {
public static void main(String args[]){
Thread t=new Thread(" Helo");
t.start();
String s=t.getName();
System.out.println(s);
}
}