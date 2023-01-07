package level01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test09 {
// 정수 내림차순으로 배치하기
	
/*	

문제 설명

함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

입출력 예
n	return
118372	873211

*/

	public static void main(String[] args) {
		System.out.print("입력값 N : ");
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long answer = 0;
        
		// String 타입으로 변경 
        String number = Long.toString(n);
        
        // String 배열 생성 
        String arr[] = new String[number.length()];
        
        // 배열에 문자 넣
        for(int i=0; i<number.length(); i++){
            arr[i] = number.substring(i,i+1);
        }
        
        //  Collections.reverseOrder() 내림차순 함수
        // 오름차순 함수는 Arrays.sort(arr)
        Arrays.sort(arr,Collections.reverseOrder());
        
        String result = "";
        
        for(String i : arr){
            result += i;
        }
        		
        // 다시 long 타입으로 변
		System.out.println("결과값 : " + Long.parseLong(result));
	}

 
}
