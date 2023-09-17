import java.util.*;
import java.lang.*;
import java.io.*;
class directthread{
public static void main(String args[]){
try{
for(int i=0;i<6;i++)
{
Thread.sleep(1000);
System.out.println(i);
}
}
catch(Exception e){
System.out.println(e);
}

}
}
