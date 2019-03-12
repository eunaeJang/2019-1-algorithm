package recursive;

//아래와 같이 출력되도록 printAll 메소드를 구현하라.
//출력 -> 10 9 8 7 6 5 4 3 2 1
//먼저 반복문으로 printAll 메소드를 구현해 보고,
//그 다음 재귀 호출로 다시 구현하라

public class Example3 {

    static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public void printAll() {
//			<반복>       	
//        	Node p = this;
//        	while(p != null) {
//        		System.out.print(p.value + " ");
//        		p = p.next;
//        	}
        	
        	
//        	if(this != null) { 
//        		System.out.print(this.value + " ");
//        		this.next.printAll();
//        	}
// -> NullPointException

//          <재귀>
        	if(this.next == null) 
        		System.out.print(this.value + " ");
        	else {
        		System.out.print(this.value + " ");
        		this.next.printAll();
        	}

        }
    }


    public static void main(String[] args) {
        Node root = null;
        for (int i = 1; i <= 10; ++i)
            root = new Node(i, root);

        root.printAll();
    }
}
