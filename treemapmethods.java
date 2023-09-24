import java.util.*;
import java.io.*;
import java.lang.*;
class treemapmethods{
public static void main(String args[]){
Map<String,Integer>tm=new TreeMap<String,Integer>();
tm.put("A",1);
tm.put("B",2);
tm.put("C",3);
int valueA=tm.get("A");
System.out.println(valueA);
tm.remove("B");
for(String key:tm.keySet()){
System.out.println(key+""tm.get(key));
}}
}