package recursive;

//위 코드를 읽어서 분석하고, 실행 과정과 화면 출력을 적어라.

public class Example5 {

    static void print(int[] a, int index) {
        if (index >= a.length) return;
        System.out.printf("%d ", a[index]);
        print(a, index + 1);
    }

    static int sum(int[] a, int index) {
        if (index == a.length - 1) return a[index];
        return a[index] + sum(a, index + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i)
            a[i] = i;
        print(a, 0);
        System.out.println();
        System.out.println(sum(a,0));
    }

}

