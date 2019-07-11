package sort.practice;

//1) String[] 배열 정렬을 구현하라.
//참고:  int 비교          if (a > b)
//     String 객체 비교  if (a.compareTo(b) > 0)

public class Example1 {
	
  static void insertionSort(int[] a) {
      for (int i = 1; i < a.length; ++i) {
          int value = a[i];             // 삽입할 값 보관
          int j;
          for (j = i - 1; j >= 0; --j)  // 뒤로 이동
              if (a[j] > value)
                  a[j + 1] = a[j];
              else
                  break;
          a[j + 1] = value;             // 값 삽입
//        a 배열의 0 에서 i-1 사이에서 value 보다 큰 값들을
//        뒤로 한 칸씩 이동하고, 그 값들 앞에 value를 넣는다.

      }
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"장은애", "김규희", "박혜린", "조예린"};
	}
}
