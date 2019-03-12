package recursive;

//차원 배열 출력 기능을 print2 메소드에 구현하라.
//재귀호출로 구현하라.
//print1 메소드의 출력과 동일하게 출력되도록 구현하라.
//
//난이도가 꽤 높은 재귀호출 구현 문제이다. 
//그냥 답만 보고 위우는 것은 실력 향상에 별로 도움이 안된다.
//자꾸 실패하더라도 계속 도전해 보라.

public class Example7 {

	static void print1(int[][] a) {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j)
				System.out.printf("%d ", a[i][j]);
			System.out.println();
		}
	}

	static void print2(int[][] a, int i, int j) {
//		if (i >= a.length) return; 
//		System.out.printf("%d ", a[i][j]);
//		if (j < a[i].length - 1) 
//			print2(a, i, j + 1); 
//		else { 
//			System.out.println();
//			print2(a, i + 1, 0); 
//		}
		
		if(i < a.length){
			if(j < a[i].length) {
				System.out.printf("%d ", a[i][j]);
				print2(a,i,j+1);
			}
			else {
				System.out.println();
				print2(a,i+1,0);
			}
		}


	}

	public static void main(String[] args) {
		int[][] a = {{ 1, 2, 3 }, {4, 5, 6}, {7, 8, 9} };
		print1(a);
		System.out.println();
		print2(a, 0, 0);
	}
}
