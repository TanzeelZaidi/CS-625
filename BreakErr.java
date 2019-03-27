class BreakErr{
public static void main(String args[]){
for( int x=0; x<3; x++){
System.out.println( "pass " + x + ": " );
}
one: for( int y=0; y<100; y++){
if(y==10) break one;
System.out.print(y + " ");
}
}
}
