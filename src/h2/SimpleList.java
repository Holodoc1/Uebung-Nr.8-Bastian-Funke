package h2;

public class SimpleList {
	Node head;
	
	public SimpleList() {
		head = new Node(Integer.MIN_VALUE);
	}
	
	public Node getFirst() {
		if(head.next != null) return head.next;
		else return null;
	}
	
	public Node getLast() {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		if(temp == head) return null;
		else return temp;
	}
	
	public void append(int newValue) {
		Node temp = new Node(newValue);
		Node last = getLast();
		if(last == null) head.next = temp;
		else last.next = temp;
	}
	
	public Node findFirst(int value) {
		Node temp = head;
		while(temp.value != value && temp != null) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean insertAfter(int preValue, int newValue) {
		Node neu = new Node(newValue);
		Node pre = findFirst(preValue);
		if(pre != null) {
			Node temp = pre.next;
			pre.next = neu;
			neu.next = temp;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean delete(int value) {
		Node lösch = findFirst(value);
		if(lösch != null || lösch != head) {
			Node temp = head;
			while(temp.next != lösch) {
				temp = temp.next;
			}
			temp.next = lösch.next;
			return true;
		}else {
			return false;
		}
	}
}
