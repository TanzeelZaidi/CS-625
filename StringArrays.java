class StringArrays {
public static void main (String args[]){
String strs[] = {"This","is","a","test."};
System.out.println("Original array:");
for(String s : strs)
System.out.print(s + " " );
System.out.println("\n");
strs[1] = "was";
strs[3] = "test , too!" ;
System.out.println("modified array:");
for(String s :strs )
System.out.print(s + " ");
}
}