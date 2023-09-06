import java.util.*;
import java.lang.*;
import java.io.*;
class pali{
public static void main(String args[]){
/*
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem,rev=0;
int onum=n;
while(n!=0){
rem=n%10;
rev=rev*10+rem;
n/=10;
}
if(onum==rev)
{
System.out.println("YES");
}
else{
System.out.println("N");
}*/

    String str = "Radar", reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }

}

