import java.util.*;
import java.io.*;
import java.lang.*;
public class mapograms{
public static void main(String args[]){
Map<Integer,String>map=new HashMap<Integer,String>();
map.put(100,"first");
map.put(101,"Second");
map.put(103,"third");
for(Map.Entry m:map.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}
}
}
