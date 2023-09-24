import java.util.*;
class hashandlink{
public static void main(String args[]){
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(1);
al.add(2);
al.add(3);
HashSet<Integer>hs=new HashSet(al);
hs.add(4);
Iterator<Integer>i=hs.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
}}