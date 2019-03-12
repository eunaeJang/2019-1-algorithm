package recursive;

//실행하면, "행 수를 입력하시오: " 메시지가 출력된다.
//행수를 입력하면, 다음과 같이 출력되어야 한다.
//---------------------------
//행 수를 입력하시오: 7
//*
//**
//***
//****
//*****
//******
//*******
//
//*
//**
//***
//****
//*****
//******
//*******
//-----------------------------
//첫째 행에는 별 1개, 둘째 행에는 별 2개, N번째 행에는 별 N개가 출력된다.
//
//print1 메소드의 출력과 동일하게 출력하도록 print2 메소드를 구현하라.
//재귀호출로 구현하라.

import java.util.Scanner;

public class Example7a {

    static void print1(int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j)
                System.out.print("*");
            System.out.println();
        }
    }

    static void print2(int n, int i, int j) {
//    	if (i >= n) return; 
//    	System.out.print("*");
//    	if (j < i) print2(n, i, j + 1); 
//    	else { 
//    		System.out.println();
//    		print2(n, i + 1, 0); 
//    	}
    	
    	if(i < n) {
    		if(j <= i) {
    			System.out.print("*");
    			print2(n,i,j+1);
    		}
    		else {
    			System.out.println();
    			print2(n,i+1,0);
    		}
    	}
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("행 수를 입력하시오: ");
            int n = scanner.nextInt();
            print1(n);
            System.out.println();
            print2(n, 0, 0);
        }
    }
}
