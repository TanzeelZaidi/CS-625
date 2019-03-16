class CastDemo{
public static void main (String args[]){
double x ,y ;
byte b ;
int i;
char ch;
x= 10.0;
y= 3.0 ;
i= (int) (x/y );
i=100;
b= (byte) i ;
System.out.println ("value of b : " + b);
b= 88;
ch = (char) b;
System.out.println ("ch:"+ ch);
}
}