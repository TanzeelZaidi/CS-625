public class WaterSongFixed{
public static void main(String[] args){
int waterNum = 9;
String word = "bottles";
while (waterNum > 0)
{
if (waterNum ==1)
{
word = "bottle";
}
System.out.println(waterNum + " " + word + " of water on the wall");
System.out.println(waterNum + " " + word + " of water");
System.out.println("Take one down.");
System.out.println("Pass it around.");
waterNum = waterNum - 1;
if (waterNum == 1)
{
word = "bottle";
}
else if(waterNum >0)
{
word = "bottles";
System.out.println(waterNum + " " + word + " of water on the wall");
}
else
{
System.out.println("No more bottles of water on the wall.");
}
}
}
}