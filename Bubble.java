class Bubble {
public static void main(String args[]){
int nums []= {10,20,25,30,15,51,35,40,45,55};
int a,b,c;
int size;
size=10;
System.out.println("Unsorted array:");
for(int i=0; i<size; i++)
System.out.print(" "+ nums[i]);
for(a=1; a<size ;a++)
for(b=size-1;b >=a; b--){
if(nums[b-1] > nums[b]){
c= nums[b-1];
nums[b-1]= nums[b];
nums[b]=c;
}
}
System.out.print("sorted array:");
for(int i=0; i <size; i++)
System.out.print(" " + nums[i]);
System.out.println();
}
}