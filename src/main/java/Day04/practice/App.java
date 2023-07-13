package Day04.practice;

public class App {

	public static void main(String[] args) throws Exception {
		RightAngledTriangle object = new RightAngledTriangle(2.0, 3.0, 4.0);
		System.out.println(object.calculateArea());
		System.out.print(object.calculatePerimeter());
	}

}
