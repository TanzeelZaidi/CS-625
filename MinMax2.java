class MinMax2 {
public static void main(String args[]) {
int nums[] = {12,245,-3,46,95,60,75,877,990,100};
int min ,max ;
min = max = nums[0];
for(int i=1; i< 10; i++ ) {
if(nums[i] < min) min= nums[i] ;
if(nums[i] > max) max = nums[i];
}
System.out.println("Min and max : " + min + " " +max);
}
}