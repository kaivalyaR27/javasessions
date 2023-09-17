import java.lang.*;
import java.io.*;
import java.util.*;
class negsleep{
public static void main(String args[]){
try{
for(int i=0;i<6;i++){
Thread.sleep(-100);
System.out.println(i);
}
}
catch(Exception e){
System.out.println(e);
}
}
}
