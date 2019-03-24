package insertionSort;

//<수행 시간 점근적 분석>
//insertionSort 메소드 수행 시간?
//O(n^2)
//main 메소드 수행 시간?
//O(n^2)
		
import java.util.Arrays;

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
//          a 배열의 0 에서 i-1 사이에서 value 보다 큰 값들을
//          뒤로 한 칸씩 이동하고, 그 값들 앞에 value를 넣는다.

        }
    }

    public static void main(String[] args) {
        int[] a = { 17, 14, 11, 19, 13, 15 };

        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
