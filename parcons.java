class parcons{
int id;
String name;
parcons(int i,String n){
id=i;
name=n;
}
void display(){
System.out.println(id+" "+name);
}
public static void main(String args[]){
parcons p1=new parcons(11,"karan");
p1.display();
}
}