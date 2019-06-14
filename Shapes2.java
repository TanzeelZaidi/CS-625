class TwoDShape{
private double height;
private double width;
double getHeight() {return height;}
double getWidth() {return width;}
void setWidth(double w) {width = w;}
void setHeight(doube h) {height = h;}
void showDim() {
System.out.println("Width and height are" + width + " and " + height);
}
}
class Triangle extends TwoDShape {
String style;
double area() {
return getWidth() * getHeight() /2;
}
void showStyle() {
System.out.println("Triangle is " + style);
}
}
class Shapes2{
public static void main(String args []) {
Triangle t1 = new Triangle();
Triangle t2 = new Triangle();
t1.setWidth = (4.0);
t1.setHeight = (4.0);
t1.style = "filled";
t2.setWidth = (8.0);
t2.setHeight = (12.0);
t2.style = "outlined";
System.out.println("Info for t1: ");
t1.showStyle();
t1.showDim();
System.out.println("Area is" + t1.area());
System.out.println();
System.out.println("Info for t2:");
t2.showStyle();
t2.showDim();
System.out.println("Area is" + t2.area());
}
}


