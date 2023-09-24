import java.io.*;
import java.util.*;
import java.lang.*;
class hashsetmethods{
public static void main(String args[]){
HashSet<String>hs=new HashSet<String>();
hs.add("A");
hs.add("B");
hs.add("C");
Iterator<String>i=hs.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
hs.removeAll(hs);
System.out.println(hs);

}
}