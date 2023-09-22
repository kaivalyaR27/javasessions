import java.util.*;
import java.lang.*;
import java.io.*;
class al3{
    public static void main(String args[]){
        ArrayList<String> l=new ArrayList<String>();
        l.add("maths");
        l.add("physiscs");
        l.add("chemistry");
        System.out.println(l.get(1));
        l.set(1,"socilstudies");
        System.out.println(l);
    }

    }
