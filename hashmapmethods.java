import java.util.*;
import java.io.*;
import java.lang.*;
class hashmapmethods{
public static void main(String args[]){
HashMap<Integer,String>hm=new HashMap<Integer,String>();
hm.put(1,"a");
hm.put(2,"b");
hm.put(3,"c");
for(Map.Entry m:hm.entrySet()){
System.out.println(m.getKey()+" " +m.getValue());
}
hm.replace(2,"B");
for(Map.Entry m:hm.entrySet()){
System.out.println(m.getKey()+" " +m.getValue());
}
hm.replace(1,"A","D");
for(Map.Entry m:hm.entrySet()){
System.out.println(m.getKey()+" " +m.getValue());
}
}
}


