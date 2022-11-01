package level01;

import java.util.Arrays;
import java.util.Scanner;

public class test06 {
// 정수 제곱근 판별
	
/*	

문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.
입출력 예
n	return
121	144
3	-1
입출력 예 설명
입출력 예#1
121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

입출력 예#2
3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.

*/

public static void main(String[] args) {
		System.out.print("입력값 : ");
		 Scanner sc = new Scanner(System.in);
		 long n = sc.nextLong();
		 
		        
	    long sqrt = (long) Math.sqrt(n);
	    
	     System.out.println("sqrt : " + sqrt);
	
	    long answer = 0;
	    
	    if(n == Math.pow(sqrt,2)){
	        answer = (long)Math.pow(sqrt+1,2);
	    }else{
	        answer = -1;
	    }
	    
	    System.out.println("결과값 : " + answer);
	}
}
