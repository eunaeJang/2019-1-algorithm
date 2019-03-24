package selectionSort;

//위 예제의 실행 결과 출력이 아래와 같도록 위 예제의 구현을 완성하라. 
//[11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
//<수행 시간 점근적 분석>
//swap 메소드 수행 시간?
//O(1)
//findMin 메소드 수행 시간?
//O(n)
//selectionSort 메소드 수행 시간?
//O(n^2)
//main 메소드 수행 시간?
//O(n^2)

import java.util.Arrays;

public class Example1a {

    // 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
    static void swap(int[] a, int i, int j) {
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }

    // 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
    static int findMin(int[] a, int start) {
    	int minIndex = start;
    	for(int i = start + 1; i < a.length; i++) {
    		if (a[minIndex] > a[i]) minIndex = i;
    	}
    	return minIndex;
    }

    // selection sort
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; ++i) {//n에 비례
            int minIndex = findMin(a, i);//n에 비례 // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서
            swap(a, i, minIndex);         // 그 값을 i 위치로 이동한다
        } // -> n제곱에 비례
    }

    public static void main(String[] args) {
        int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };

        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}