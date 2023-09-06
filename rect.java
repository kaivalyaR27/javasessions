class rect{
int len;
int width;
int area;
void insert(int l,int w){
len=l;
width=w;
}
void calarea(){
System.out.println(len*width);
}
public static void main(String args[]){
rect r1=new rect();
r1.insert(9,8);
r1.calarea();
}
}