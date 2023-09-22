import java.util.*;
import java.io.*;
import java.lang.*;
class ll{
    public static void main(String args[]){
        LinkedList<String> li=new LinkedList<String>();
        li.add("Sri");
        li.add("sai");
        li.add("kaivalya");
        li.add("ram");
        li.add("panchagnula");
        Iterator itr=li.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}