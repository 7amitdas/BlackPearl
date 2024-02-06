package algoexpert.easy;

/**
 * Coding Interview Questions </br>
 * Remove Duplicates From Linked List Solution 1 </br>
 * {@link} https://www.algoexpert.io/questions/remove-duplicates-from-linked-list
 * 
 * @author Amit Das
 */
public class RemoveDupFromLinkedList {

	public static class LinkedList {
		public int value;
		public LinkedList next;

		public LinkedList(int value) {
			this.value = value;
			this.next = null;
		}

		@Override
		public String toString() {
			return value + (next != null ? " -> " + next : "");
		}
	}

	public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
		// Write your code here.
		LinkedList currNode = linkedList;
		while (currNode.next != null) {
			if (currNode.value == currNode.next.value) {
				currNode.next = currNode.next.next;
			} else {
				currNode = currNode.next;
			}
		}
		return linkedList;
	}

	public static void main(String[] args) {
		RemoveDupFromLinkedList r = new RemoveDupFromLinkedList();
		LinkedList t9 = new LinkedList(6);
		LinkedList t8 = new LinkedList(6);
		t8.next = t9;
		LinkedList t7 = new LinkedList(5);
		t7.next = t8;
		LinkedList t6 = new LinkedList(4);
		t6.next = t7;
		LinkedList t5 = new LinkedList(4);
		t5.next = t6;
		LinkedList t4 = new LinkedList(4);
		t4.next = t5;
		LinkedList t3 = new LinkedList(3);
		t3.next = t4;
		LinkedList t2 = new LinkedList(1);
		t2.next = t3;
		LinkedList t1 = new LinkedList(1);
		t1.next = t2;
		System.out.println(r.removeDuplicatesFromLinkedList(t1));
	}
}