class statickw{

int rollno;
String name;
static String college="VIT";
statickw(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[]){
statickw k1=new statickw(100,"kai");
statickw k2=new statickw(200,"kui");
k1.display();
k2.display();
}
}