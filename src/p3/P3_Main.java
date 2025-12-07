package p3;

public class P3_Main {

	public static void main(String[] args) {
		int[] a = {1,1,1};
		int[] b = {1,-1,0};
		int[] ausgabe = elementwiseMultiply(a,b);
		
		System.out.print("[");
		if(ausgabe.length > 0) {
			System.out.print(ausgabe[0]);
			int i;
			for(i = 1; i < ausgabe.length; i++) {
				System.out.print("," + ausgabe[i]);
			}
		}
		System.out.print("]");
		System.out.println();
		System.out.println(areOrthogonal(a,b));
	}
	
	public static int[] elementwiseMultiply(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return new int[0];
		}
		int[] ergebnis = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			ergebnis[i] = arr1[i] * arr2[i];
		}
		return ergebnis;
	}
	
	public static boolean areOrthogonal(int[] arr1, int[] arr2) {
		int[] multiplied = elementwiseMultiply(arr1,arr2);
		int sum = 0;
		for(int i = 0; i < multiplied.length; i++) {
			sum += multiplied[i];
		}
		return sum == 0;
	}
}
