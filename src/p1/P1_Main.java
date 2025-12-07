package p1;

public class P1_Main {

	public static void main(String args[]) {
		int a = 43;
		System.out.println(getNumber(a));
	}
	
	public static int getNumber(int a) {
		return a > 42 ? 42 : 0;
	}
}
