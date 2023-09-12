class shapes{
String shape;
int id;
shapes(String shape,int id){
this.shape=shape;
this.id=id;
}
}
class square extends shapes{
int no_of_shap;
square(int id,String shape,int no_of_shap){
super(id,shape);
this.no_of_Shape=shape;
}
void display(){
System.out.prinln(id+ " "+no_of_Shap+" "+shape);
}
}
class super{
public static void main(String args[]){
sqaure s1=new sqauare(1,6,"square");
s1.display();
}
}
