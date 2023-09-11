class Address{
String city,state,country;
Address(String city,String state,String country){
this.city=city;
this.state=state;
this.country=country;
}
}
public class aggregation{
int id;
String name;
Address address;
public aggregation(int id,String name,Address address){
this.id=id;
this.name=name;
this.address=address;
}
void display(){
System.out.println(id+ " "+name+ " ");
System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String args[]){
Address ad1=new Address("mu","maha","india");
aggregation ag1=new aggregation(101,"jack",ad1);
ag1.display();
}
}