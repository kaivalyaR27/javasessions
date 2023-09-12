interface drawable{
void draw();
default void msg(){
System.out.println("Its default");
}
}
class picture implements drawable{
public void draw(){
System.out.println("drawing a picture");
}
}
class interfaceexample{
public static void main(String args[]){
drawable d=new picture();
d.draw();d.msg();
}
}