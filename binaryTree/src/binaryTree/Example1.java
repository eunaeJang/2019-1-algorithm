package binaryTree;
//이진트리
//<add> 메소드 분석
//add 메소드의 수행 시간을 점근적 분석하라.
//O(logn) ??
//<contains> 메소드 구현
//파리미터 값 value가 이진 트리에 들어있는지 여부를 true/false로 리턴하는 contains 메소드를 구현하라.

import java.util.Random;

public class Example1 {

	static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		public void add(int value) {
			if (value < this.value) {
				if (left == null) left = new Node(value);
				else left.add(value);
			} else if (value > this.value) {
				if (right == null) right = new Node(value);
				else right.add(value);
			}
		}

		public void print() {
			if (left != null) left.print();
			System.out.printf("%d ", value);
			if (right != null) right.print();
		}

		public boolean contains(int value) {
			if (value < this.value) {
				if (left == null) return false;
				else return left.contains(value);
			} else if (value > this.value) {
				if (right == null) return false;
				else return right.contains(value);
			}
			else return true;
			
			
		}
	}

	public static void main(String[] args) {
		Random random = new Random();
		Node root = new Node(random.nextInt(20));
		for (int i = 0; i < 15; ++i)
			root.add(random.nextInt(20));

		root.print();
		System.out.println();

		for (int i = 0; i < 20; ++i) {
			int value = random.nextInt(20);
			System.out.printf("%d %s\n", value, root.contains(value));
		}



	}

}

