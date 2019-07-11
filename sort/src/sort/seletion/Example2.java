package sort.seletion;

//위 예제의 실행 결과 출력이 아래와 같도록 swap 메소드를 구현하라.
//[2, 4]
//[4, 2]

import java.util.Arrays;

public class Example2 {

// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
static void swap(int[] a, int i, int j) {
	  int temp = a[i];
	  a[i] = a[j];
	  a[j] = temp;
}

public static void main(String[] args) {
    int[] a = { 2, 4 };

    System.out.println(Arrays.toString(a));
    swap(a, 0, 1);
    System.out.println(Arrays.toString(a));
}

}