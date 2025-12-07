package h2;

public class H2_Main {

	public static void main(String[] args) {
		SimpleList myList = new SimpleList();
		myList.append(12);
		myList.append(45);
		myList.append(66);
		myList.append(12);
		myList.append(45);
		myList.append(60);
		myList.insertAfter(45,4);
		myList.delete(45);
		myList.insertAfter(Integer.MIN_VALUE, 50);
		
		Node temp = myList.getFirst();
		if(temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
		}
		while(temp != null) {
			System.out.print("," + temp.value);
			temp = temp.next;
		}
		System.out.println();
		System.out.println(myList.findFirst(45).value);
		System.out.println(myList.getFirst().value);
		System.out.println(myList.getLast().value);
	}
	
}
