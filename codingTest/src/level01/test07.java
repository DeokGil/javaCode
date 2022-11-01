package level01;

import java.util.Arrays;
import java.util.Scanner;

public class test07 {
// 문자열 내 p와 y의 개수
	
/*	


문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.
입출력 예
	s	answer
"pPoooyY"	true
"Pyy"	false

*/

public static void main(String[] args) {
		System.out.print("입력값 : ");
		 Scanner sc = new Scanner(System.in);
		 String n = sc.nextLine();
		 
		        
        boolean answer = true;

        int len =n.length();
        
        System.out.println("len : " + len);
        String word = "";
        int pCnt= 0;
        int yCnt =0;
        for(int i = 0; i<len; i++){
            word = n.substring(i,i+1);
            System.out.println("word : " + word);
            if(word.equals("p") || word.equals("P")){
                pCnt++;
            }
            if(word.equals("y") || word.equals("Y")){
                yCnt++;
            }
        }
        if(pCnt != yCnt){
            answer = false;
        }
	    System.out.println("결과값 : " + answer);
	}



/* 다른풀
 s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false; 
 */
 
}
