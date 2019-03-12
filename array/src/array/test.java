package array;

import java.util.Arrays;
import java.util.Random;

public class test {
	static void swap(int[] a, int i, int j) {
		int t = a[j];
		a[j] = a[i];
		a[i] = t;
	}

	static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; ++i)
			for (int j = i + 1; j < a.length; ++j)
				if (a[i] > a[j])
					swap(a, i, j);
	}
	static int search3(int[] a, int value) {
		return search3(a, value, 0, a.length-1);
	}

	static int search3(int[] a, int value, int start, int end) {
		int middle = (start + end) / 2;
		
		if(start > end) return -1;
		
		if (a[middle] < value) start = middle + 1;
		else if (a[middle] > value) end = middle - 1;
		else return middle;
		
		
		return search3(a,value,start,end);
	}


	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[5];
		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(10);

		sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(search3(a, 4));
	}
}
