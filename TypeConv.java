class Overload2 {
void f(int x) {
System.out.println("Inside f(int): " + x);
}
void f(double x) {
System.out.println("inside f(double): "+ x);
}
}
class TypeConv{
public static void main (String args[]){
Overload2 ob = new Overload2();
int i =10 ;
double d = 10.0;
byte b = 99;
short s = 10;
float f = 11.5F ;
ob.f(i) ;
ob.f(d);
ob.f(b);
ob.f(s);
ob.f(f);
}
}