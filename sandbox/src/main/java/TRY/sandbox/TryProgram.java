package TRY.sandbox;

public class TryProgram {

	public static void main(String[] args) {
		hello("life");
		hello("morning");
		hello("spring");

		Square s = new Square(3);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Point AB = new Point(2, 3, 7, 8);
		System.out.println("Расстояние между точкой A(" + AB.x1 + "," + AB.y1 + ") и B(" + AB.x2 + "," + AB.y2 + ") = " + AB.distance());

	}

	public static void hello(String somebody) {
		System.out.println("What a wonderful " + somebody + "!");
	}

}