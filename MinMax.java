class MinMax{
public static void main(String args[]){
int nums[]=new int[10];
int min,max;
nums[0]= 99;
nums[1]=23;
nums[2]=-4;
nums[3]=100;
nums[4]=56;
nums[5]=78;
nums[6]=988;
nums[7]=5678;
nums[8]=34;
nums[9]=789;
min= max = nums[0];
for(int i=1; i<10 ; i++){
if(nums[i] < min) min=nums[i];
if(nums[i] > max) max= nums[i];
}
System.out.println("min and max:" + min+ " "+ max);
}
}
 