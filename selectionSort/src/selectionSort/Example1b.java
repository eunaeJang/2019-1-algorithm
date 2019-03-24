package selectionSort;

//for (int i = a.length-1; i >= 1; --i) {
//    배열 a의 0부터 i까지 최대값을 찾는다.
//    최대값과 i위치의 값을 서로 바꾼다.
//}
//선택 정렬을 위와 같이 구현해도 된다.
//구현해 보라.

import java.util.Arrays;

public class Example1b {
	 // 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
    static void swap(int[] a, int i, int j) {
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }

    // 배열 a의 start 위치부터 끝까지에서 가장  값의 위치(index)를 리턴한다.
    static int findMin(int[] a, int start) {
    	int maxIndex = a.length-1;
    	for (int i = maxIndex; i >= start; --i) {
    		if (a[maxIndex] < a[i]) maxIndex = i;
    	}
    	return maxIndex;
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
