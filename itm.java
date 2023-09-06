class itm{
int age;
float salary;
String name;
void insertrecord(int a,float s,String n){
age=a;
salary=s;
name=n;
}
void displayinformation(){
System.out.println(age+" "+salary+" "+name);
}
public static void main(String args[]){
itm i1=new itm();
itm i2=new itm();
i1.insertrecord(21,24532,"kaivalya");
i2.insertrecord(32,878867,"kai");
i1.displayinformation();
i2.displayinformation();
}
}