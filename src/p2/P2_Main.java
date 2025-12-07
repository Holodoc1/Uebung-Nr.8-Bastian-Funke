package p2;

public class P2_Main {

	public static void main(String[] args) {
		String ausgabe = "RindfL";
		int n = 3;
		System.out.println(shortenToLowerCase(ausgabe,n));
	}
	
	public static String shortenToLowerCase(String input, int shortenBy) {
		if(shortenBy >= input.length()) {
			return "";
		}else {
			String ergebnis = input.substring(0,input.length() - shortenBy);
			return ergebnis.toLowerCase();
		}
	}
}
