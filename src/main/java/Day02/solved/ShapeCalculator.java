package Day02.solved;

//Method overloading in Java
public class ShapeCalculator {
		// Calculating Area for Circle
 public double calculateArea(double radius) {
     return Math.PI * radius * radius;
 }
		
		// Calculating Area for Rectangle
 public double calculateArea(double length, double width) {
     return length * width;
 }
}