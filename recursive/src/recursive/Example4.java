package recursive;

import recursive.Example3.Node;

//아래와 같이 출력되도록 addTail 메소드를 구현하라.
//출력 -> 0 1 2 3 4 5 6 7 8 9 10
//addTail 메소드는 링크드 리스트 끝에 value 값의 Node를 추가해야 한다.
//
//먼저 반복문으로 addTail 메소드를 구현해 보고,
//그 다음 재귀 호출로 다시 구현하라.

public class Example4 {

	static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public void printAll() {
			if(this.next == null) 
				System.out.print(this.value + " ");
			else {
				System.out.print(this.value + " ");
				this.next.printAll();
			}
		}

		public void addTail(int value) {
//			<반복>
//			Node p = this;
//			while(p.next != null) {
//				p = p.next;
//			}
//			p.next = new Node(value, null);

//			<재귀>
			if(this.next == null) this.next = new Node(value, null);
			else this.next.addTail(value);


		}
	}


	public static void main(String[] args) {
		Node root = new Node(0, null);

		for (int i = 1; i <= 10; ++i)
			root.addTail(i);

		root.printAll();
	}
}

