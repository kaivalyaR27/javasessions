import java.util.*;
import java.io.*;
import java.lang.*;
abstract class test{
test(){
System.out.println("Students are writing the test");
}
abstract void study();
void changesubject(){
System.out.println("subject changes");
}
}
class assessment extends test{
void study(){
System.out.println("exam written");
}
}
class testt{
public static void main(String args[]){
test t=new assessment ();
t.study();
t.changesubject();
}
}