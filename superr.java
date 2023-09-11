class parent{  
int id;  
String name;  
parent(int id,String name){  
this.id=id;  
this.name=name;  
}  
}  
class student extends parent{  
float fee;  
student(int id,String name,float fee){  
super(id,name); 
this.fee=fee;  
}  
void display(){System.out.println(id+" "+name+" "+fee);}  
}  
class superr{  
public static void main(String[] args){  
student e1=new student(1,"student",30000f);  
e1.display();  
}} 