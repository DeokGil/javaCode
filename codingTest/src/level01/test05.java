package level01;

import java.util.Arrays;
import java.util.Scanner;

public class test05 {
// 자릿수 뒤집어
	
/*	
자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]

*/

public static void main(String[] args) {
	System.out.print("입력값 : ");
	 Scanner sc = new Scanner(System.in);
	 long n = sc.nextLong();
	 
        String a = "" + n;
        System.out.println("a:" + a);
        int[] answer = new int[a.length()];
        int tmp = 0 ;
        while(n > 0){
            
           answer[tmp++] =(int) (n%10);
            n/=10;
            System.out.println(n);
             
        }
        
        System.out.println("결과 : " +Arrays.toString(answer));
	}   
}
