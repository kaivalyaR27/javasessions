class itc{
int id;
float salary;
String name;
void insert(int i,float s,String n){
id=i;
salary=s;
name=n;
}
void display(){
System.out.println(id+" "+salary+" "+name);
}
public static void main(String args[])
{
itc i1=new itc();
itc i2=new itc();
i1.insert(4567,727,"kahs");
i2.insert(57,57,"fwd");
i1.display();
i2.display();
}
}
