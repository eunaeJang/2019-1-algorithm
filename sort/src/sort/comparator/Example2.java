package sort.comparator;

//2) Person[] 배열 정렬을 구현하라.
//참고:
//PersonNameComparator comparator = new PersonNameComparator();
//if (comparator.compare(a, b) > 0)


import java.util.Arrays;

public class Example2 {
	static void swap(Person[] a, int i, int j) {
      Person temp = a[i];
      a[i] = a[j];
      a[j] = temp;
  }
	
	static void bubbleSort(Person[] p) {
		PersonNameComparator comparator = new PersonNameComparator();
      for (int i = p.length - 1; i >= 1; --i) {
          boolean 완료 = true;
          for (int j = 0; j < i; ++j) {
				if (comparator.compare(p[j], p[j + 1]) > 0) {
                  swap(p, j, j + 1);
                  완료 = false;
              }
          }
          if (완료) break;
      }
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p = {new Person("장은애", 22),new Person("장영훈", 26)
				,new Person("정선희", 50),new Person("장명석", 57), new Person("장은애", 7)};
		
		bubbleSort(p);
		System.out.println(Arrays.toString(p));

	}

}