class meov{
void sum(int a,int b){
System.out.println(a+b);
}
void sum(int a,int b,int c){
System.out.println(a+b+c);
}
public static void main(String args[]){
meov m1=new meov();
meov m2=new meov();
m1.sum(9,8);
m2.sum(1,2,3);
}
}