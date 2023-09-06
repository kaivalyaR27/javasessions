import java.util.*;
import java.lang.*;
import java.io.*;
class mon{
public static void main(String args[]){
String revstr="";
Scanner sc=new Scanner(System.in);
String str=sc.next();
for(int i=0;i<str.length();i++){
revstr=str.charAt(i)+revstr;
}
System.out.println(revstr);

}
}