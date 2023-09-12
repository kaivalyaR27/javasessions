class person{
private int age;
public int getAge(){
return age;
}
public void setAge(int age){
this.age=age;
}
}
class encap{
public static void main(String args[]){
person p1=new person();
p1.setAge(32);
System.out.println(p1.getAge());
}
}