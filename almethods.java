import java.util.*;
import java.io.*;
import java.lang.*;
class almethods{
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(25);
        al.add(35);
        al.add(24);
        al.add(89);
        al.add(100);
        al.add(244);
        al.add(67);
        al.add(1,45);
        System.out.println(al);
        al.remove(0);
System.out.println(al);
al.removeAll(al);
System.out.println(al);
al.clear();
System.out.println(al);
    }
    }
