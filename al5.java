import java.util.*;
import java.lang.*;
import java.io.*;
class al5{
    public static void main(String args[]){
        ArrayList<String> tr=new ArrayList<String>();
        tr.add("mango");
        tr.add("Apple");
        tr.add("banana");
        Iterator itr=tr.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
        }

    }
}