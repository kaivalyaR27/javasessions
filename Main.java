import java.util.*;
import java.io.*;
import java.lang.*;
class oops1 {
  String concept;
  public void read() {
    System.out.println("Learning oops concepts");
  }
}
class inheritance extends oops1 {
  public void display() {
    System.out.println("The conecpt that i am learning is" + concept);
  }
}

class Main {
  public static void main(String[] args) {
    inheritance learningobject = new inheritance();
    learningobject.concept = "INHERITANCE";
    learningobject.display();
    learningobject.read();

  }
}