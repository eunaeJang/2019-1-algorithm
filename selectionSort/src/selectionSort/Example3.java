package selectionSort;

//위 예제의 실행 결과 출력이 아래와 같도록 findMin 메소드를 구현하라.
//11
//-19

public class Example3 {

    // 배열 a에서 가장 작은 값의 위치(index)를 리턴한다.
    static int findMin(int[] a) {
    	int minIndex = 0;
    	for(int i = 1; i < a.length; i++) {
    		if (a[minIndex] > a[i]) minIndex = i;
    	}
    	return minIndex;
    }

    public static void main(String[] args) {
        int[] a1 = { 17, 14, 11, 19 };
        int[] a2 = { -17, -14, -11, -19 };

        int minIndex = findMin(a1);
        System.out.println(a1[minIndex]);

        minIndex = findMin(a2);
        System.out.println(a2[minIndex]);
    }

}
