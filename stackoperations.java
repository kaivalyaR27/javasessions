import java.util.*;
import java.io.*;
import java.lang.*;
class stackoperations{
public static void main(String args[]){
Stack<Integer>st=new Stack<Integer>();
boolean result=st.empty();
System.out.println("Is stack empty?"+result);
st.push(78);
st.push(89);
st.push(23);
st.push(244);
System.out.println("stack conisist of elements"+st);
result=st.empty();
System.out.println(result);
st.pop();
System.out.println(st);
Integer it=st.peek();
System.out.println(it);
int location=st.search(23);
System.out.println(location);
int sizee=st.size();
System.out.println(sizee);

}
}
