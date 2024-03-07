package mkt_assignment;

//Assignment7-Create a class & write 5 static methods each for addition, subtraction, multi, div & modules, call it in the main method
public class Assignment7 {
	static void add() {
		int a = -128;
		int b = 127;
		System.out.println(a + b);
	}

	static void sub() {
		float c = 0.091f;
		float d = 9.761f;
		System.out.println(c - d);
	}

	static void multi() {
		long a1 = 4875634;
		long b1 = 8497252;
		System.out.println(a1 * b1);
	}

	static void div() {
		int c1 = 2;
		int d1 = 17;
		System.out.println(c1 / d1);
	}

	static void modules() {
		int e = 25;
		int f = 90;
		System.out.println(f % e);
	}

	public static void main(String[] args) {
		add();
		sub();
		multi();
		div();
		modules();

	}

}
