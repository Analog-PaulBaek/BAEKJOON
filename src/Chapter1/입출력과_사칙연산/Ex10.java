package Chapter1.입출력과_사칙연산;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
//		(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
						//		  472
						//		  385
						//      -------  
						//		 2360
						//		3776
						//	   1416
						//	   181720
//		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)
//		위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		
		
		Scanner sc = new Scanner(System.in);
//		
		int a = sc.nextInt();
		int b = sc.nextInt();
//		
		
		
//		int a = 472;
//		int b = 385;
		
		//1의 자리
		int b1 = b%10;
		
		//10의 자리
		int b10 = ((b%100)-b1)/10;
		
		//100의 자리
		int b100 = (b-(b%100))/100;
		
		int r1 = a*b1;
		int r2 = a*b10;
		int r3 = a*b100;
		int r4 = r1+(10*r2)+(100*r3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		
				
		
				

	}

}
