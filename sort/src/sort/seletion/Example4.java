package sort.seletion;

//위 예제의 실행 결과 출력이 아래와 같도록 findMin 메소드를 구현하라.
//11
//11
//13
//15

public class Example4 {

  // 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
  static int findMin(int[] a, int start) {
  	int minIndex = start;
  	for(int i = start + 1; i < a.length; i++) {
  		if (a[minIndex] > a[i]) minIndex = i;
  	}
  	return minIndex;
  }

  public static void main(String[] args) {
      int[] a = { 14, 11, 13, 15 };

      for (int i = 0; i < a.length; ++i) {
          int minIndex = findMin(a, i);
          System.out.println(a[minIndex]);
      }
  }

}
