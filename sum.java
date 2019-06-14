class Summation {
int sum;
Summation(int num) {
sum= 0;
for(int i=1; i<=num ; i++)
sum += i;
Summation(int num) {
sum=0 ;
for(int i=1; i <= num; i++)
sum +=i;
}
Summation(Summation ob ){
sum = ob.sum;
}
}
class SumDemo {
public static void main (String args []){
Summation sa = new Summation(5);
Summation sa = new Summation(s1);
System.out.primtln("s1.sum:" + s1.sum);
System.out.primtln("s2.sum:" + s2.sum);
}
}