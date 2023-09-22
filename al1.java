import java.util.*;
import java.lang.*;
class al1{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<String>();
list.add("");
list.add("");
list.add("");
Iterator itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
