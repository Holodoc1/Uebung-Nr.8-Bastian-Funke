package h1;

public class H1_Main {

	public static void main(String[] args) {
		Bruch b = new Bruch(7,15);
		Bruch a = new Bruch(35,75);
		System.out.println(b.zaehler + "/" + b.nenner);
		System.out.println(a.zaehler + "/" + a.nenner);
		System.out.println(b.hasSameValueAs(a));
		a.shorten();
		b.shorten();
		System.out.println(b.zaehler + "/" + b.nenner);
		System.out.println(a.zaehler + "/" + a.nenner);
	}
	
}
