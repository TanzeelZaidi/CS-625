class Help2{
public static void main(String args[])
throws java.io.IOException{
char choice, ignore;
do{
System.out.println("Hep on:");
System.out.println(" 1.if");
System.out.println(" 2. switch");
System.out.println(" 3. for ");
System.out.println(" 4. while");
System.out.println(" 5.do-while");
System.out.println(" choose one:");
choice = (char) System.in.read();
do{
ignore = (char) System.in.read();
} while(ignore != '\n');
} while (choice < '1' | choice > '5');
}
}